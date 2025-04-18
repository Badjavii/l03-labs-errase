package Menus;

public class SubMenuUsers implements Menu{

    @Override
    public void showMenu() {
        System.out.println("\n\t=== Users Management Menu ===");
        System.out.println("1. Add User");
        System.out.println("2. Show Users");
        System.out.println("3. Edit User");
        System.out.println("2. Delete User");
        System.out.println("0. EXIT");
    }

    @Override
    public void menu() {

    }
}
