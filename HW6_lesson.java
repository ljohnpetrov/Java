public class HW6_lesson {

    public static void main(String[] args) {
        Cat cat1 = new Cat(run);
        Dog dog1 = new Dog();
        System.out.println(cat1.run(150))
        
    }
}
class Animal {
    int run;
    int jump;
    int swim;
    boolean run() {
        if (run < 200)
        return true;
    return false;
        
    }
   // swim() {
   // }
   // jump() {
   // }
    
}
public class Cat extends Animal{

}
public class Dog extends Animal{

}
