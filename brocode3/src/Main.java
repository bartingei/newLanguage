public class Main{
    public static void main(String[] args){
        //i want to implement the concepts of inheritance

        Vehicle vehicle = new Vehicle();

        //lets create instances of the inheriting classes

        Car car = new Car();
        Bicycle bicycle = new Bicycle();

        bicycle.go();
        car.stop();
        System.out.println("current speed: "+car.speed);

        System.out.println("number of car doors is: "+ car.doors);
        System.out.println("Number of wheels in a bicycle is: "+bicycle.wheels);

        bicycle.sound();
    }
}