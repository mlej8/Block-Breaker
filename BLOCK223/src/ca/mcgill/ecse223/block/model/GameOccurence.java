/*PLEASE DO NOT EDIT THIS CODE*/
/*This code was generated using the UMPLE 1.29.0.4181.a593105a9 modeling language!*/

package ca.mcgill.ecse223.block.model;
import java.util.*;

// line 56 "../../../../../Block223v3.ump"
public class GameOccurence extends Game
{

  //------------------------
  // ENUMERATIONS
  //------------------------

  public enum GameStatus { Idle, InGame, Paused, Ended }

  //------------------------
  // STATIC VARIABLES
  //------------------------

  private static int nextGameId = 1;

  //------------------------
  // MEMBER VARIABLES
  //------------------------

  //GameOccurence Attributes
  private GameStatus gameStatus;
  private int currentScore;

  //Autounique Attributes
  private int gameId;

  //------------------------
  // CONSTRUCTOR
  //------------------------

  public GameOccurence(int aWidthPlayArea, int aHeightPlayArea, int aWidthHallOfFame, int aHeightHallOfFame, boolean aIsPublished, boolean aIsTested, int aWaitTime, String aName, int aNrBlocksPerLevel, Paddle aPaddle, Ball aBall, Block223 aBlock223, GameStatus aGameStatus, int aCurrentScore)
  {
    super(aWidthPlayArea, aHeightPlayArea, aWidthHallOfFame, aHeightHallOfFame, aIsPublished, aIsTested, aWaitTime, aName, aNrBlocksPerLevel, aPaddle, aBall, aBlock223);
    gameStatus = aGameStatus;
    currentScore = aCurrentScore;
    gameId = nextGameId++;
  }

  //------------------------
  // INTERFACE
  //------------------------

  public boolean setGameStatus(GameStatus aGameStatus)
  {
    boolean wasSet = false;
    gameStatus = aGameStatus;
    wasSet = true;
    return wasSet;
  }

  public boolean setCurrentScore(int aCurrentScore)
  {
    boolean wasSet = false;
    currentScore = aCurrentScore;
    wasSet = true;
    return wasSet;
  }

  public GameStatus getGameStatus()
  {
    return gameStatus;
  }

  public int getCurrentScore()
  {
    return currentScore;
  }

  public int getGameId()
  {
    return gameId;
  }

  public void delete()
  {
    super.delete();
  }


  public String toString()
  {
    return super.toString() + "["+
            "gameId" + ":" + getGameId()+ "," +
            "currentScore" + ":" + getCurrentScore()+ "]" + System.getProperties().getProperty("line.separator") +
            "  " + "gameStatus" + "=" + (getGameStatus() != null ? !getGameStatus().equals(this)  ? getGameStatus().toString().replaceAll("  ","    ") : "this" : "null");
  }
}