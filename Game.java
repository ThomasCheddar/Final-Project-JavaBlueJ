
/**
 *This is a  game that has the info that hols the game
 *
 *Nicolas is doing this
 * 04/05/26
 */
public class Game
{
    // instance variables - replace the example below with your own
    private int x;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private GameType gameType;
    private double playTime;
    private int rating;
    
    public Game(String title, Genre genre, Platform platform, AgeRating ageRating, GameType gameType)
    { 
        //When creating a game, it would ask for a title, genre, platform, age rates and game type
    }
    public void setRating(int rating)
    {
        // Setting a rate to a game and it must be 1-5
    }
    public void addPlayTime(double minutes)
    {
        // adding playtime either in hours or minutes
    }
    public boolean matches(String word)
    {
        // used to search for a game by using boolean
        return true;
    }
    public String toString()
    {
        // return the info in text
        return "true";
    }
}
