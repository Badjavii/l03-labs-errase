package users;
import abstractclasses.User;

public class Student extends User {
    private String degree;
    private int semester;

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }
}
