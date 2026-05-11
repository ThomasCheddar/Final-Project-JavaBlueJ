/**
 * Runs the game library application.
 *
 * @author Nicolas
 * @version 04/05/26
 */
public class GameLibraryApp
{
    private GameLibrary library;

    public GameLibraryApp()
    {
        library = new GameLibrary();

        library.addGame(new Game("Minecraft", Genre.ADVENTURE, Platform.PC, AgeRating.EVERYONE, GameType.MULTIPLAYER));
        library.addGame(new Game("Limbus Company", Genre.ACTION, Platform.PC, AgeRating.MATURE, GameType.SINGLEPLAYER));
        library.addGame(new Game("Counter Strike: Global Offensive", Genre.ACTION, Platform.PC, AgeRating.MATURE, GameType.MULTIPLAYER));
        
    }

    public void run()
    {
        library.printLibraryDetails();
        library.listAllGames();

        library.rateGame("Minecraft", 5);
        library.startSession("Minecraft", 30);

        System.out.println();
        System.out.println("After rating and playing:");
        library.listAllGames();

        System.out.println();
        System.out.println("Session log:");
        library.printSessionLog();
    }

    public GameLibrary getLibrary()
    {
        return library;
    }

    public void setLibrary(GameLibrary library)
    {
        this.library = library;
    }

    public String toString()
    {
        return "Game Library App";
    }
    //Return the info as text
}