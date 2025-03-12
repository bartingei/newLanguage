public class Main{
    public static void main(String[] args){
        //creating objects

        Person oerson = new Person("Johnpaul", 20);

        Hero hero1 = new Hero("The Flash", 27, "Super Speed");

        System.out.println(hero1.toString());

        System.out.println(oerson.toString());
//hero1.name +"\n"+ hero1.age +"\n"+ hero1.superpower

    }
}