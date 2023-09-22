package employee.version3;

public class PieceWorkerEmployee extends Employee{
    private int totalPiecesFinished;
    private float ratePerPiece;
    
    // Constructors
    public PieceWorkerEmployee() {
        empID = 0;
        empName = "XXXXX";
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }
    
    public PieceWorkerEmployee(int empID, String empName) {
        super.empID = empID;
        super.empName = empName;
        totalPiecesFinished = 0;
        ratePerPiece = 0;
    }

    public PieceWorkerEmployee(int empID, String empName, MyDate empDateHired, MyDate empBirthDate, int totalPiecesFinished, float ratePerPiece) {
        super.empID = empID;
        super.empName = empName;
        super.empDateHired = empDateHired;
        super.empBirthDate = empBirthDate;
        this.totalPiecesFinished = totalPiecesFinished;
        this.ratePerPiece = ratePerPiece;
    }
    
    // Other Operations
    public double computeSalary() {
        double salary = 0;
        if(totalPiecesFinished < 100) {
            salary = totalPiecesFinished * ratePerPiece;
        } else {
            salary = (totalPiecesFinished * ratePerPiece) + ((totalPiecesFinished / 100) * (ratePerPiece * 10));
        }
        return salary;
    }
    
    public void displayInfo() {
        System.out.println("--- Piece Worker Employee ---");
        System.out.println("ID: " + empID);
        System.out.println("Name: " + empName);
        System.out.println("Date Hired: " + empDateHired);
        System.out.println("Date of Birth: " + empBirthDate);
        System.out.println("Total Pieces Finished: " + totalPiecesFinished);
        System.out.println("Rate per Piece: " + ratePerPiece);
        System.out.println("Total Salary: " + computeSalary() + "\n");
    }
    
    // Setters and Getters
    void setTotalPiecesFinished(int totalPiecesFinished) {
        this.totalPiecesFinished = totalPiecesFinished;
    }

    void setRatePerPiece(float ratePerPiece) {
        this.ratePerPiece = ratePerPiece;
    }

    int getTotalPiecesFinished() {
        return totalPiecesFinished;
    }

    float getRatePerPiece() {
        return ratePerPiece;
    }

    @Override
    public String toString() {
        return "PieceWorkerEmployee{" + "empID=" + empID + ", empName=" + empName + ", empDateHired=" + empDateHired + ", empBirthDate=" + empBirthDate + ", totalPiecesFinished=" + totalPiecesFinished + ", ratePerPiece=" + ratePerPiece + '}';
    }
    
}