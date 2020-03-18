package com.tts.chess;

public class Knight extends Piece
{
    public Knight(boolean isWhite)
    {
        super(isWhite);
    }

    @Override
    public boolean canMove(Board board, Square squareStart, Square squareEnd)
    {
        // we can't move this piece to a square that has a piece of the same color
        if (squareEnd.getPiece().isWhite() == this.isWhite())
        {
            return false;
        }

        int x = Math.abs(squareStart.getX() - squareEnd.getX());
        int y = Math.abs(squareStart.getY() - squareEnd.getY());
        return ((x * y) == 2);
    }
}
