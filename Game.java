/**
 * Represents one game in the game library.
 *
 * @author Nicolas and Thomas
 * @version 04/05/26
 */
public class Game
{
    private String title;
    private Genre genre;
    private Platform platform;
    private AgeRating ageRating;
    private GameType gameType;
    private int rating;
    private double playTime;

    public Game(String title, Genre genre, Platform platform, AgeRating ageRating, GameType gameType)
    {
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

    public int getRating()
    {
        return rating;
    }

    public double getPlayTime()
    {
        return playTime;
    }

    public void setRating(int rating)
    {
        if(rating >= 1 && rating <= 5) {
            this.rating = rating;
        }
        else {
            System.out.println("Rating must be between 1 and 5.");
        }
    }

    public void addPlayTime(double minutes)
    {
        if(minutes > 0) {
            playTime = playTime + minutes;
        }
        else {
            System.out.println("Minutes must be positive.");
        }
    }

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
        return title + " | " + genre + " | " + platform + " | "
            + ageRating + " | " + gameType + " | Rating: "
            + rating + "/5 | Play time: " + playTime + " minutes";
    }
}