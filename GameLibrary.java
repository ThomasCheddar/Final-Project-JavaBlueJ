import java.util.ArrayList;

/**
 * Represents a library that stores games.
 *
 * @author Thomas and Nicolas
 * @version 04/05/26
 */
public class GameLibrary
{
    private ArrayList<Game> games;

    public GameLibrary()
    {
        games = new ArrayList<Game>();
    }

    public void addGame(Game game)
    {
        
    }

    public void listAllGames()
    {
        
    }

    public void rateGame(String title, int rating)
    {
        Game game = findGame(title);

        if(game != null) {
            game.setRating(rating);
        }
        else {
            System.out.println("Game not found.");
        }
    }

    public void startSession(String title, double minutes)
    {
        
    }

    public void printLibraryDetails()
    {
        System.out.println("Number of games: " + games.size());
    }

    public void printSessionLog()
    {
        
    }

    private Game findGame(String title)
    {
        for(Game game : games) {
            if(game.getTitle().equals(title)) {
                return game;
            }
        }

        return null;
    }


    public String toString()
    {
       return "test";
    }
}