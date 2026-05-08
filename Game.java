
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
    private String title;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private GameType gameType;
    private double playTime;
    private int rating;

    public Game(String title, Genre genre, Platform platform, AgeRating ageRating, GameType gameType)
    { 
        //When creating a game, it would ask for a title, genre, platform, age rates and game type
        this.title = title;
        this.genre = genre;
        this.platform = platform;
        this.ageRating = ageRating;
        this.gameType = gameType;
        rating = 0;
        playTime = 0.0;
    }

    public String getTitle()
    {
        return title;
    }

    public Genre getGenre()
    {
        return genre;
    }

    public Platform getPlatform()
    {
        return platform;
    }

    public AgeRating getAgeRating()
    {
        return ageRating;
    }

    public GameType getGameType()
    {
        return gameType;
    }

    public int getRating()
    {
        return rating;
    }

    public double getPlayTime()
    {
        return playTime;
    }

    public void setTitle(String title)
    {
        this.title = title;
    }

    public void setGenre(Genre genre)
    {
        this.genre = genre;
    }

    public void setPlatform(Platform platform)
    {
        this.platform = platform;
    }

    public void setAgeRating(AgeRating ageRating)
    {
        this.ageRating = ageRating;
    }

    public void setGameType(GameType gameType)
    {
        this.gameType = gameType;
    }

    public void setRating(int rating)
    {
        // Setting a rate to a game and it must be 1-5
    }

    public void addPlayTime(double minutes)
    {
        // adding playtime either in hours or minutes
    }

    public String toString()
    {
        // return the info in text
        return "true";
    }
}
