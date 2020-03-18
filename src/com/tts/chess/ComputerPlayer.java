package com.tts.chess;

public class ComputerPlayer extends Player
{
    public ComputerPlayer( boolean whiteTeam )
    {
        this.setHumanPlayer(false);
        this.setWhiteTeam(false);
    }
}