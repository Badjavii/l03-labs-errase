package extras;
import java.util.Scanner;

/**
 * @class ConsoleUtils
 * @brief Class that provides methods for manipulating the console.
 */
public class ConsoleUtils {

    private static Scanner scanner = new Scanner(System.in);

    /**
     * Generic method for capturing and validating user input.
     *
     * @param variable Reference to the object that will store the value (passed by generic type).
     * @param type     Type of data to capture ("int", "double", "string", "boolean").
     * @param <T>      Generic data type.
     * @return The data validated and stored in the provided reference.
     */

    public static <T> T scanv(T variable, String type){
        while (true){
            System.out.print("» ");
            try {
                String input = scanner.nextLine();
                switch (type.toLowerCase()) {
                    case "int":
                        variable = (T) Integer.valueOf(input);
                        break;
                    case "double":
                        variable = (T) Double.valueOf(input);
                        break;
                    case "string":
                        if (!input.isEmpty()) {
                            variable = (T) input;
                        } else {
                            throw new IllegalArgumentException("The input cannot be empty.");
                        }
                        break;
                    case "boolean":
                        variable = (T) Boolean.valueOf(input);
                        break;
                    default:
                        System.out.println("Error: Unsupported data type.");
                        return null;
                }
                return variable;
            } catch (Exception e){
                System.out.println("Invalid input. Make sure you enter a valid " + type + ".");
            }
        }
    }


    /**
     * @brief Pauses program execution until the user presses ENTER.
     * @details Displays a message on the console and waits for the user to press ENTER.
     */
    public static void pause_terminal() {
        Scanner input = new Scanner(System.in);
        System.out.println("Press [ENTER] to continue...");
        input.nextLine();
    }

    /**
     * @brief Clean the console screen.
     * @details Determine the operating system and run the corresponding command to clear the screen.
     */
    public static void clear_screen() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                new ProcessBuilder("clear").inheritIO().start().waitFor();
            }
        } catch (Exception e) {
            System.out.println("Cannot clean console");
        }
    }
}
