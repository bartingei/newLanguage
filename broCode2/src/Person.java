public class Person {
    String name;
    int age;
    double weight;

    Person(String name, int age, double weight){
        this.name = name;
        this.age = age;
        this.weight = weight;
    }
    void viewname(){
        System.out.println("Hello "+ name);
    }
    void viewDetails(){
        System.out.println("name: "+name+" age: "+age+"Weight: "+weight);
    }
}
