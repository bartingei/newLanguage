import java.util.Scanner;

public class Rectangle {
    protected short length;
    protected short width;

    public static Scanner scanner = new Scanner(System.in);

    Rectangle(){
        //a default constructor requires one to set a method to ask user to set the values
        setDimensions();
    }


    Rectangle(short length, short width){
        this.length = length;
        this.width = width;
    }

    void setDimensions(){
        System.out.println(" Enter Length: ");
        length = scanner.nextShort();

        System.out.println("Enter width: ");
        width = scanner.nextShort();
    }
    short getLength(){
        return length;
    }
    short getWidth(){
        return width;
    }
    public void getArea(){
        double area = length * width;
        System.out.println("Area of rectangle is: " + area);
    }

}
