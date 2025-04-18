package extras;
import java.time.LocalDate;
import abstractclasses.User;

public class Loan {
    private int id;
    private User user;
    private String borrowedMaterial, status;
    private LocalDate LoanDate, EstimatedReturnDate, ActualReturnDate;

    // Constructor
    public Loan(int id, User user, String borrowedMaterial, String status, LocalDate loanDate, LocalDate estimatedReturnDate, LocalDate actualReturnDate) {
        this.id = id;
        this.user = user;
        this.borrowedMaterial = borrowedMaterial;
        this.status = status;
        LoanDate = loanDate;
        EstimatedReturnDate = estimatedReturnDate;
        ActualReturnDate = actualReturnDate;
    }

    // Getters
    public int getId() {
        return id;
    }

    public User getUser() {
        return user;
    }

    public String getBorrowedMaterial() {
        return borrowedMaterial;
    }

    public String getStatus() {
        return status;
    }

    public LocalDate getLoanDate() {
        return LoanDate;
    }

    public LocalDate getEstimatedReturnDate() {
        return EstimatedReturnDate;
    }

    public LocalDate getActualReturnDate() {
        return ActualReturnDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void setBorrowedMaterial(String borrowedMaterial) {
        this.borrowedMaterial = borrowedMaterial;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLoanDate(LocalDate loanDate) {
        LoanDate = loanDate;
    }

    public void setEstimatedReturnDate(LocalDate estimatedReturnDate) {
        EstimatedReturnDate = estimatedReturnDate;
    }

    public void setActualReturnDate(LocalDate actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }

}
