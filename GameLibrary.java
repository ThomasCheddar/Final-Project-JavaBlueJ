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
        if(game !=null)
        {
            games.add(game);
        }
    }

    public void listAllGames()
    {
        for(Game game : games){
            System.out.println(game);
        }
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
        Game game = findGame(title);
        if(game != null){
            game.addPlayTime(minutes);
        }
        else
            System.out.println("Game not found.");
    }

    public void printLibraryDetails()
    {
        System.out.println("Number of games: " + games.size());
    }

    public void printSessionLog()
    {
        for(Game game : games){
            System.out.println(game.getTitle() + " : " + game.getPlayTime() + " minutes");
        }
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
       return "Game library with " + games.size() + "games.";
    }
}