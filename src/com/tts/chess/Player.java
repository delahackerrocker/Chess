package com.tts.chess;

public abstract class Player
{
    private boolean whiteTeam;
    private boolean humanPlayer;

    // team getter setters
    public boolean isWhiteTeam()
    {
        return this.whiteTeam == true;
    }
    public void setWhiteTeam(boolean isWhiteTeam)
    {
        this.whiteTeam = isWhiteTeam;
    }

    // player getter setters
    public boolean isHumanPlayer()
    {
        return this.humanPlayer == true;
    }
    public void setHumanPlayer(boolean isHumanPlayer)
    {
        this.humanPlayer = humanPlayer;
    }
}
