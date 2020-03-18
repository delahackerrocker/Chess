package com.tts.chess;

public class Square
{
    // A Square is a single area that a chess piece can be moved into

    // if there is a piece placed on this square save a ref here
    private Piece piece;

    // each square occupies it's own X, Y location on the board
    private int x;
    private int y;

    public Square( int x, int y, Piece piece)
    {
        this.setPiece(piece);
        this.setX(x);
        this.setY(y);
    }

    // get and set piece
    public Piece getPiece()
    {
        return this.piece;
    }
    public void setPiece( Piece newPiece )
    {
        this.piece = newPiece;
    }

    // get and set location of this square
    public int getX()
    {
        return this.x;
    }
    public void setX( int newX )
    {
        this.x = newX;
    }
    public int getY()
    {
        return this.y;
    }
    public void setY( int newY )
    {
        this.x = newY;
    }
}
