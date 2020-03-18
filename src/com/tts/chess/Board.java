package com.tts.chess;

public class Board
{
    Square[][] squares;

    public Board()
    {
        this.resetBoard();
    }

    public Square getSquare(int x, int y)
    {
        // return a square at x, y
        if ( (x<0) || (x>7) || (y<0) || (y>7) )
        {
            //throw new Exception("Index out of bounds");
        }
        return squares[x][y];
    }

    public void resetBoard()
    {
        // initialize our pieces
        // white pieces
        // back row
        squares[0][0] = new Square(0, 0, new Knight(true));
        squares[0][1] = new Square(0, 1, new Knight(true));
        squares[0][2] = new Square(0, 2, new Knight(true));
        squares[0][3] = new Square(0, 3, new Knight(true));
        squares[0][4] = new Square(0, 4, new Knight(true));
        squares[0][5] = new Square(0, 5, new Knight(true));
        squares[0][6] = new Square(0, 6, new Knight(true));
        squares[0][7] = new Square(0, 7, new Knight(true));
        // front row
        squares[1][0] = new Square(1, 0, new Knight(true));
        squares[1][1] = new Square(1, 1, new Knight(true));
        squares[1][2] = new Square(1, 2, new Knight(true));
        squares[1][3] = new Square(1, 3, new Knight(true));
        squares[1][4] = new Square(1, 4, new Knight(true));
        squares[1][5] = new Square(1, 5, new Knight(true));
        squares[1][6] = new Square(1, 6, new Knight(true));
        squares[1][7] = new Square(1, 7, new Knight(true));

        // black pieces
        // back row
        squares[7][0] = new Square(7, 0, new Knight(false));
        squares[7][1] = new Square(7, 1, new Knight(false));
        squares[7][2] = new Square(7, 2, new Knight(false));
        squares[7][3] = new Square(7, 3, new Knight(false));
        squares[7][4] = new Square(7, 4, new Knight(false));
        squares[7][5] = new Square(7, 5, new Knight(false));
        squares[7][6] = new Square(7, 6, new Knight(false));
        squares[7][7] = new Square(7, 7, new Knight(false));
        // front row
        squares[6][0] = new Square(6, 0, new Knight(false));
        squares[6][1] = new Square(6, 1, new Knight(false));
        squares[6][2] = new Square(6, 2, new Knight(false));
        squares[6][3] = new Square(6, 3, new Knight(false));
        squares[6][4] = new Square(6, 4, new Knight(false));
        squares[6][5] = new Square(6, 5, new Knight(false));
        squares[6][6] = new Square(6, 6, new Knight(false));
        squares[6][7] = new Square(6, 7, new Knight(false));

        // initialize remaining Squares without any pieces
        for (int i=2; i<6; i++)
        {
            for (int j=0; j<8; j++)
            {
                squares[i][j] = new Square(i, j, null);
            }
        }
    }
}
