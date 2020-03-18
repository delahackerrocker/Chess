package com.tts.chess;

public class HumanPlayer extends Player
{
    public HumanPlayer( boolean whiteTeam )
    {
        this.setHumanPlayer(true);
        this.setWhiteTeam(true);
    }
}