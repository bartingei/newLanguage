public class Student {
    private String name;
    private int age;
    private String home;

    Student(String name, int age, String home){
        this.setName(name);
        this.setAge(age);
        this.setHome(home);
    }
    // the data memebers have been made private leading to encapsulation... the only way to resolve this is by using setters and getters
    //using getters
    String getName(){
        return name;
    }
    int getAge(){
        return age;
    }
    String getHome(){
        return home;
    }
    void viewDetails(){
        System.out.println("name: "+name+"\n age: "+age+"\n home: "+home);
    }
    //if we intend to change details of the values we will be using the setters
    void setName(String name){
        this.name = name;
    }
    void setAge(int age){
        this.age = age;
    }
    void setHome(String home){
        this.home = home;
    }
}
