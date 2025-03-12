import javax.swing.JOptionPane;
import java.util.Scanner;

public class Admin {
    private String name; //admin name
    public Admin(){
        name = JOptionPane.showInputDialog("Enter Admin name ");
        Patient p2 = new Patient();
        p2.viewDetails();
    }

    public static void array1(){
        byte x;
        Scanner obj = new Scanner(System.in);
        String[] names = {"James", "john", "jane"};
        String[] places = new String[4];
        for(x = 0; x < places.length; x++){
            System.out.println("Enter place " + (x + 1) + " you will visit");

            places[x] = obj.nextLine();
        }
        System.out.println("These are our local tourists");
        for(String S:names){
            System.out.println(S + ",");
        }
        System.out.println("\n They have visited the following places");
        for (String p:places){
            System.out.println(p + ",");
        }
    }

    public static void main(String args[]){
        Admin admin1 = new Admin();
        array1();
    }

}
