package employee.version3;

public class Name {
    protected String firstName;
    protected char middleIn;
    protected String lastName;
    
    public Name() {
        firstName = "XXXXX";
        middleIn = 'X';
        lastName = "XXXXX";
    }
    
    public Name(String firstName, char middleIn, String lastName) {
        this.firstName = firstName;
        this.middleIn = middleIn;
        this.lastName = lastName;
    }
    
    public void displayName() {
        System.out.println(lastName + ", " + firstName + " " + middleIn + ".");
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setMiddleIn(char middleIn) {
        this.middleIn = middleIn;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public char getMiddleIn() {
        return middleIn;
    }

    public String getLastName() {
        return lastName;
    }

    @Override
    public String toString() {
        return "Name{" + "firstName=" + firstName + ", middleName=" + middleIn + ", lastName=" + lastName + '}';
    }
}
