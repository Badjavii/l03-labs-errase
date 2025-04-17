package users;
import abstractclasses.User;

public class Administrative extends User{
    private String area, position;

    // Implementation of abstract methods of Materials.User class
    public int calculateLoanLimit(){
        return 0;
    }

    // Implementation of abstract methods of Materials.User class
    public boolean canReserve(){
        return false;
    }
}
