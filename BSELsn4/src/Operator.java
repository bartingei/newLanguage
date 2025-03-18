 import java.util.Arrays;
 import java.util.Scanner;

public class Operator{
    public static void myArray(){
        String[] names = new String[3];

        short[] marks = {12,43,54,56,86,45};

        Scanner scanner = new Scanner(System.in);

        //populating the names
        System.out.println("Student names");
        for(byte x = 0; x < names.length; x ++){
            System.out.println("Enter name of student " +(x+1)+ ":");
            names[x] = scanner.nextLine();
        }
        System.out.println("Student marks are as shown below (before sorting");
        //using for each loop
        for(short s: marks){
            System.out.println(s +",");
        }
        System.out.println();

        //sort the elements of the array in descending order
        System.out.println("Student marks after sorting");
            //short[] marks = {12,43,54,56,86,45};
            for(short y: marks) {
                System.out.println(y +"\t");
            }
    }

    //varargs method    below, we are creating a dynamic array
    public static void sum(int... numbers){
        long total = 0;
        for(int x: numbers){
            total += x;
        }
        System.out.println("Sum of all numbers is " + total);
    }
}