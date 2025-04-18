import extras.Date;

public class Loan {
    private int id;
    private String user, borrowedMaterial, status;
    private Date LoanDate, EstimatedReturnDate, ActualReturnDate;

    // Constructor
    public Loan(int id, String user, String borrowedMaterial, String status, Date loanDate, Date estimatedReturnDate, Date actualReturnDate) {
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

    public String getUser() {
        return user;
    }

    public String getBorrowedMaterial() {
        return borrowedMaterial;
    }

    public String getStatus() {
        return status;
    }

    public Date getLoanDate() {
        return LoanDate;
    }

    public Date getEstimatedReturnDate() {
        return EstimatedReturnDate;
    }

    public Date getActualReturnDate() {
        return ActualReturnDate;
    }

    // Setters
    public void setId(int id) {
        this.id = id;
    }

    public void setUser(String user) {
        this.user = user;
    }

    public void setBorrowedMaterial(String borrowedMaterial) {
        this.borrowedMaterial = borrowedMaterial;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public void setLoanDate(Date loanDate) {
        LoanDate = loanDate;
    }

    public void setEstimatedReturnDate(Date estimatedReturnDate) {
        EstimatedReturnDate = estimatedReturnDate;
    }

    public void setActualReturnDate(Date actualReturnDate) {
        ActualReturnDate = actualReturnDate;
    }


}
