package employee.version1;

public class MyDate {
    private int day;
    private int month;
    private int year;
    
    // Constructors
    public MyDate() {
        day = 0;
        month = 0;
        year = 0;
    }
    
    public MyDate(int day, int month, int year) {
        this.day = day;
        this.month = month;
        this.year = year;
    }

    @Override
    public String toString() {
        return day + "-" + month + "-" + year;
    }
}
