import java.util.ArrayList;
import java.util.Scanner;

/**
 * This class is a game library that can store games
 *
 * Thomas is taking this class
 * May 4
 */
public class GameLibrary
{
    //private Game game;
    private ArrayList<Game>games;

    public GameLibrary() //Creates an empty class of game
    {
        // initialise the list of game
        games = new ArrayList<>();
    }
    public void addGame(Game game)
    {
        //add game by putting name of the game
    }

    public int getNumberOfGames() // Gives a number of game
    {
        return games.size();
    }

    public void listAllGames() // list all games that is in this class
    {
        for(Game game : games){
            System.out.println(game);
        }
    }

    public void searchGames(String word) // search for a game
    {

    }

    public void listTopRatedGames() // List game with the highest rating
    {

    }

    public boolean rateGame(String title, int rating) //rate game by using title
    {
        Scanner myObj = new Scanner(System.in);
        String rateGame = myObj.nextLine();
        if (rating < 1 && rating > 5){
            System.out.println("Error, invalid rating, must be between 1 to 5.");
            return false;
        }
        else
        if (rating > 1 && rating < 5){  
            return true;
        }
        System.out.println("Your rating: " + rating);
        return true;
    }

    public void printLibraryDetails()// print info about library
    {
        System.out.println("Number of games: " + games.size());
    }
}
