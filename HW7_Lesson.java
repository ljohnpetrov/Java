/**
 * Java. Level 1. Lesson 7
 *
 * @author Sergey Iryupin
 * @version dated Oct 17, 2017
 */
import java.io.*; 

class J1Lesson7 {

    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 20, false);
        Plate plate = new Plate(10);
        System.out.println(plate);
        if(cat.appetite > plate.food){
            System.out.println("Not enouth eat");
            System.out.println(cat);
        }else {
            cat.eat(plate);
            System.out.println(plate +"; "+ cat);
        }
        
    }
}

class Cat {
    private String name;
    int appetite;
    boolean fullness;
    Cat(String name, int appetite, boolean fullness) {
        this.name = name;
        this.appetite = appetite;
        this.fullness = fullness;
    }

    void eat(Plate plate) {
        plate.decreaseFood(appetite);
        fullness = true;
    }
    @Override
    public String toString() {
        return "Cat: " + fullness;
    }
}

class Plate {
    int food;

    Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;
    }
    
    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
