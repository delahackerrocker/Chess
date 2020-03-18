package com.tts.chess;
import java.util.*;

public enum GameStatus
{
    ACTIVE,
    BLACK_WIN,
    WHITE_WIN,
    FORFEIT,
    STALEMATE,
    RESIGNATION
}

public class Game
{
    private Player[] players;
    private Board board;
    private Player currentTurn;
    private GameStatus status;
    private List<Move> movesPlayed;

    private void initialize(Player p1, Player p2)
    {
        players[0] = p1;
        players[1] = p2;

        board.resetBoard();

        if (p1.isWhiteTeam())
        {
            this.currentTurn = p1;
        } else {
            this.currentTurn = p2;
        }
    }

    public boolean isEnd()
    {
        return this.getStatus() != GameStatus.ACTIVE;
    }

    public GameStatus getStatus()
    {
        return this.status;
    }
    public void setStatus(GameStatus newStatus)
    {
        this.status = newStatus;
    }

    public boolean playerMove(Player player, int startX, int startY, int endX, int endY)
    {
        Square startSquare = board.getSquare(startX, startY);
        Square endSquare = board.getSquare(endX, endY);
        Move move = new Move(player, startSquare, endSquare);
        return this.makeMove(move, player);
    }

    private boolean makeMove(Move move, Player player)
    {
        Piece sourcePiece = move.getSquareStart().getPiece();
        if (sourcePiece == null) {
            return false;
        }

        // is this a valid player turn?
        if (player != currentTurn)
        {
            return false;
        }

        // does this player control this piece?
        if (sourcePiece.isWhite() != player.isWhiteTeam())
        {
            return false;
        }

        // is this a valid move?
        if (!sourcePiece.canMove(board, move.getSquareStart(), move.getSquareEnd()))
        {
            return false;
        }

        // is a piece being killed?
        Piece destinationPiece = move.getSquareStart().getPiece();
        if (destinationPiece != null)
        {
            destinationPiece.setKilled(true);
            move.setPieceKilled(destinationPiece);
        }

        // is castling?
        if ( (sourcePiece != null) && (destinationPiece instanceof King) && (sourcePiece.isCastlingMove()) ) {
            move.isCastlingMove();
        }

        // store the move
        movesPlayed.add(move);

        // move piece from the start square to the end square
        move.getSquareEnd().setPiece(move.getSquareStart().getPiece());
        // the piece is no longer in it's starting position
        move.getSquareStart().setPiece(null);

        if ( (destinationPiece != null) && (destinationPiece instanceof King) ) {
            if (player.isWhiteTeam()) {
                // white team won
                this.setStatus(GameStatus.WHITE_WIN);
            } else {
                // black team won
                this.setStatus(GameStatus.BLACK_WIN);
            }
        }

        // set the current turn to the other player
        if (this.currentTurn == players[0]) {
            this.currentTurn = players[1];
        } else {
            this.currentTurn = players[0];
        }

        return true;
    }
}
