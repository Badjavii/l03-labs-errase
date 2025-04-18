package users;
import abstractclasses.User;

public class Professor extends User{
    private String department, specialty;

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }
}
