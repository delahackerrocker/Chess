package com.tts.chess;

public class Move
{
    private Player player;
    private Square squareStart;
    private Square squareEnd;
    private Piece pieceMoved;
    private Piece pieceKilled;
    private boolean castlingMove = false;

    public Move(Player player, Square squareStart, Square squareEnd)
    {
        this.player = player;
        this.squareStart = squareStart;
        this.squareEnd = squareEnd;
        this.pieceMoved = squareStart.getPiece();
    }

    public boolean isCastlingMove()
    {
        return this.castlingMove == true;
    }

    public void setCastlingMove(boolean castlingMove)
    {
        this.castlingMove = castlingMove;
    }

    public Square getSquareStart() {
        return squareStart;
    }

    public Square getSquareEnd() {
        return squareEnd;
    }

    public void setPieceKilled(Piece killedThisPiece)
    {
        pieceKilled = killedThisPiece;
    }
}