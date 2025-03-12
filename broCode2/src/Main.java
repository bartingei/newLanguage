import javax.swing.JOptionPane;
import java.util.Random;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        //creating an instance for random
        Random random = new Random();

    /*

        System.out.println("What is your name: ");
        String name = scanner.nextLine();

        System.out.println("What is your age?: ");
        short age = scanner.nextShort();

        System.out.println("What is your favourite food?: ");
        String food = scanner.next();

        System.out.println("Your name is: " +name+"\n you are "+age+" years old\n your favourite food is "+food);

        String name = JOptionPane.showInputDialog("Enter your name: ");

        short age = Short.parseShort(JOptionPane.showInputDialog("What is your age?: "));

        JOptionPane.showMessageDialog(null, "your name is : " + name);
        JOptionPane.showMessageDialog(null, "you are : " + age+ " years old");

        // a program to find the hypotenuse of a triangle using Math functions
        double x;
        double y;
        double z;

        System.out.println("Enter the value of x: ");
        x = scanner.nextDouble();
        System.out.println("Enter the value of y: ");
        y = scanner.nextDouble();

        z = Math.sqrt((x*x) + (y*y));
        System.out.println(" hypotenuse value: "+ z);
        scanner.close();
//for generating random integer values
        //int guess = random.nextInt(6)+1;
        //random boolean values
        boolean g = random.nextBoolean();
        System.out.println(g);

 //if statements
        System.out.println("What is your age?: ");
        short age = scanner.nextShort();
        if(age>=18){
            System.out.println("You are an adult");
        }
        else{
            System.out.println("Come back when you are older... lol :)");
        }

        // switch cases... lets create an instance for switching on the days of the week
        System.out.println("what is the day today?: ");
        String day = scanner.nextLine();

        switch(day){
            case "Sunday":
                System.out.println("it is Sunday");
                break;
            case "Monday":
                System.out.println("it is Monday");
                break;
            case "Tuesday":
                System.out.println("it is Tuesday");
                break;
            case "Wednesday":
                System.out.println("it is Wednesday");
                break;
            case "Thursday":
                System.out.println("it is Thursday");
                break;
            case "Friday":
                System.out.println("it is Friday");
                break;
            case "Saturday":
                System.out.println("it is Saturday");
                break;
            default:
                System.out.println("Enter a valid day bruh :( ");
        }

         //while loop... it executes a block  of code as long as the condition returns true
        Scanner result = new Scanner(System.in);
        String name = "";

        while(name.isBlank()){
            System.out.println("Enter your name: ");
            name = result.nextLine();
        }

        System.out.println("Hello "+name);
//for loop is a loop that continues for a limited number of times

        for (int i=10; i >= 1; i--) {
            System.out.println(i);
        }

        // nested loops
        short rows;
        short columns;
        String symbol;

        System.out.println("Enter the number of rows you want to use: ");
        rows = scanner.nextShort();
        System.out.println("Enter the number of columns you want to use: ");
        columns = scanner.nextShort();
        scanner.nextLine();
        System.out.println("Enter the symbol you want to use: ");
        symbol = scanner.nextLine();

        for(int i = 1; i<=rows; i++){
            System.out.println();
            for(int j = 1; j<=columns; j++){
                System.out.println(symbol);
            }
        }

*/
        //arrays - is a data structure used to store data of same kind

        /*String[] cars = {"Camaro", "Tesla", "Jeep", "G wargon"};
        cars[0] = "Mustang";

        System.out.println(cars[0]);

        String[] cars = new String[4];

        cars[0] = "Corolla";
        cars[1] = "Toyota";
        cars[2] = "Maybach";

        for( int i = 0; i<= cars.length; i++){
            System.out.println(cars[i]);
        }

          String[][] people = new String[3][3];

        people[0][0] = "jp";
        people[0][1] = "john";
        people[0][2] = "mercy";
        people[1][0] = "David";
        people[1][1] = "Pauline";
        people[1][2] = "Delilah";
        people[2][0] = "Maureen";
        people[2][1] = "Tracy";
        people[2][2] = "Abel";

        for(int i = 0; i<people.length; i++){
            System.out.println();
            for(int j = 0; j<people[i].length; j++){
                System.out.println(people[i][j]);
            }
        }
*/

        Person person1 = new Person("Johnpaul", 19, 70.3);
        person1.viewname();

        Person person2 = new Person("Maureen", 19, 59.3);
        person2.viewDetails();

    }
}