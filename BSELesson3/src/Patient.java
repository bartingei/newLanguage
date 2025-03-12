import java.util.Scanner;

public class Patient {
    private String gender = new String();
    final static String hospital = "Mt Olive Hospital";
    private short yob;
    private String name;


    Patient() {
        System.out.println("Enter your name... ");
        name = result.nextLine();
        System.out.println("Enter your gender... ");
        gender = result.nextLine();
        System.out.println("Enter your Year of birth... ");
        yob = result.nextShort();
    }

    private static Scanner result = new Scanner(System.in);    //creating only one instance of the scanner method

    public void setName() {
        System.out.println("Current name is Muturi... Enter new name ");
        name = result.nextLine();

    }

    public String getName() {
        return name;
    }
    public void setYob(){
        System.out.println("Enter year of birth... ");
        yob = result.nextShort();
    }
    public short getYob(){
        return yob;
    }
    public void setGender(){
        System.out.println("What is your gender... ");
        gender = result.nextLine();
    }


    void viewDetails() {
        System.out.println("This is " + hospital);
        System.out.println("name = " + name);
        System.out.println("gender = " + gender);
        System.out.println("YOB = " + yob);
    }

    public static void main(String args[]) {
        Patient p1 = new Patient();
        p1.setName();
        //p1.getName();
        // p1.setGender();
        p1.viewDetails();
    }
}
