import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;
import abstractclasses.LibraryMaterial;
import abstractclasses.User;
import extras.Loan;
import extras.ConsoleUtils;

public class Library {
    private List<LibraryMaterial> materials;
    private List<User> users;
    private List<Loan> loans;

    // Constructor
    public Library () {
        this.materials = new ArrayList<>();
        this.users = new ArrayList<>();
        this.loans = new ArrayList<>();
    }

    public void showMenu (){
        ConsoleUtils.clear_screen();
        System.out.println("\n\t=== Library System Menu ===");
        System.out.println("1. Users Management");
        System.out.println("2. Materials Management");
        System.out.println("0. EXIT");
    }

    public void mainMenu (){
        Scanner input = new Scanner(System.in);
        int i = -1;

        while (i != 0){
            showMenu();
            System.out.println("\nSelect Option: ");

            i = input.nextInt();
            input.nextLine();

            switch (i){
                case 1:
                    break;
                case 2:
                    break;
                case 3:
                    System.out.println("Closing program...");
                default:


            }
        }
    }
}
