package com.tts.chess;

public class King extends Piece
{
    private boolean castlingDone = false;

    public King(boolean isWhite)
    {
        super(isWhite);
    }

    public boolean isCastlingDone()
    {
        return this.castlingDone == true;
    }

    public void setCastlingDone(boolean castlingDone)
    {
        this.castlingDone = castlingDone;
    }

    @Override
    public boolean canMove(Board board, Square squareStart, Square squareEnd)
    {
        // we can't move this piece to a Square that has a piece of the same color
        if ( squareEnd.getPiece().isWhite() == this.isWhite() )
        {
            // these pieces are teh same color
            return false;
        }

        int x = Math.abs( squareStart.getX() - squareEnd.getX() );
        int y = Math.abs( squareStart.getY() - squareEnd.getY() );

        if ( (x + y) == 1)
        {
            return true;
        }

        return this.isValidCastling(board, squareStart, squareEnd);
    }

    public boolean isValidCastling(Board board, Square squareStart, Square squareEnd)
    {
        // check if the starting and ending position are correct
        return false;
    }
}
