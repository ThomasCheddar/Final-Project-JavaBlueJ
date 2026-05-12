import java.util.Scanner;

/**
 * Runs the game library application.
 *
 * @author Nicolas
 * @version 04/05/26
 */
public class GameLibraryApp
{
    private GameLibrary library;
    private Scanner scanner;

    public GameLibraryApp()
    {
        library = new GameLibrary();

        library.addGame(new Game("Minecraft", Genre.ADVENTURE, Platform.PC, AgeRating.EVERYONE, GameType.MULTIPLAYER));
        library.addGame(new Game("Limbus Company", Genre.ACTION, Platform.PC, AgeRating.MATURE, GameType.SINGLEPLAYER));
        library.addGame(new Game("Counter Strike: Global Offensive", Genre.ACTION, Platform.PC, AgeRating.MATURE, GameType.MULTIPLAYER));

    }

    public static void Main(String[] args)
    {
        GameLibraryApp app = new GameLibraryApp();
        app.run();
    }

    public void run()
    {

    }

    public void printMenu()
    {
        System.out.println();
        System.out.println("Game Library Menu");
        System.out.println("1. Print library details");
        System.out.println("2. List all games");
        System.out.println("3. Rate a game");
        System.out.println("4. Start a game session");
        System.out.println("5. Print game session log");
        System.out.println("6. Add your own game");
        System.out.println("0. Exit");
        System.out.print("Choice: ");
    }

    private void rateGame()
    {
        System.out.print("Enter game title: ");
        String title = scanner.nextLine();

        System.out.print("Enter rating from 1 to 5: ");
        int rating = scanner.nextInt();
        scanner.nextLine();

        library.rateGame(title, rating);
    }

    private void startSession()
    {
        System.out.print("Enter game title: ");
        String title = scanner.nextLine();

        System.out.print("Enter minutes played: ");
        double minutes = scanner.nextDouble();
        scanner.nextLine();

        library.startSession(title, minutes);
    }

    public GameLibrary getLibrary()
    {
        return library;
    }

    public void setLibrary(GameLibrary library)
    {
        this.library = library;
    }
}