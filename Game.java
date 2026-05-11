
/**
 *This is a  game that has the info that hols the game
 *
 *Nicolas is doing this
 * 04/05/26
 */
public class Game
{
    // instance variables - replace the example below with your own
    private String title;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private GameType gameType;
    private double playTime;
    private int rating;

    public Game(String title, Genre genre, Platform platform, AgeRating ageRating, GameType gameType)
    { 
        //This is for ONE GAME
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
        if(rating >= 1 && rating <=5)
        {
            this.rating = rating;
        } else {
            System.out.println("Rating must be between 1 to 5");
        }
    }

    public void addPlayTime(double minutes)
    {
        // adding playtime TO ONE GAME
        if(minutes > 0)
        {
            playTime = playTime + minutes;
        } else {
            System.out.println("Minutes must be a positive number");
        }
    }
    //Special thanks to Illia and Jonas (5th semester guy) for explaining and helping me implementing the instanceof keyword
    //equals is used to check if the game has the exact same name and only return true of false bc it is a boolean
    //PS I thought I commited it but it did not... odd...
    //PS PS They are the goat
    public boolean equals(Object other)
    {
        if(other instanceof Game) {
            Game otherGame = (Game) other;
            return title.equals(otherGame.getTitle());
        }

        return false;
    }

    public String toString()
    {
        // return the info in text
        return title + " | " + genre + " | " + platform + " | " + ageRating + " | " + gameType + " | Rating: " + rating + "/5 | Play time: " + playTime + " minutes";
    }
}
