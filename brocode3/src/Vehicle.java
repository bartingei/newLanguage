public class Vehicle {
    // this is the class whose attributes i want to be inherited
    double speed;

    void go(){
        System.out.println("This vehicle is moving");
    }
    void stop(){
        System.out.println("This vehicle is stopped! ");
    }
    //i am creating an instance to show method overrinding
    void sound(){
        System.out.println("This vehicle is making a sound");
    }
}
