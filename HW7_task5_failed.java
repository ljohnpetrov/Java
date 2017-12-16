/**
 * Java. Level 1. Lesson 7. Homework
 *
 * @author Ivan Petrov
 * @version dated Nov 30, 2017
 * @link https://github.com/ljohnpetrov/Java
 */

import java.io.*;

class HW7_task5_failed {
/**
 * 5. Создать массив котов и тарелку с едой, попросить всех котов покушать из этой тарелки 
 * и потом вывести информацию о сытости котов в консоль
 */
    public static void main(String[] args) {
        Cats[] cats = {new Cat1("Barsik", 10, false), new Cat2("Platon", 10, false)};
        Plate plate = new Plate(30);
        System.out.println(plate);{
            for (Cats devourers : cats)
                if (devourers.getAppetite() > plate.getFood()) {
                    System.out.println("Not enouth eat");
                    System.out.println(cats);
                } else {
                    devourers.eat(plate);
                System.out.println(plate + "; " + cats);
            }
        }
    }
}
abstract class Cats {
    private String name;
    public String getName(){
        return name;
    }
    public void setName(String name){
        this.name = name;
    }
     private int appetite;
     public int getAppetite(){
        return appetite;
    }
    boolean fullness;
    Cats(){
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
class Cat1 extends Cats {
    Cat1(String name, int appetite, boolean fullness) {
    }

    public String name() {
        return getName();
    }
    public int appetite() {
        return getAppetite();
    }

    public boolean fullness() {
        return fullness;
    }

    void eat(Plate plate) {
        plate.decreaseFood(getAppetite());
        fullness = true;
    }
    @Override
    public String toString() {
        return "Cat: " + fullness;
    }
}
class Cat2 extends Cats {

    Cat2(String name, int appetite, boolean fullness) {
    }

    public String name() {
        return getName();
    }
    public int appetite() {
        return getAppetite();
    }

    public boolean fullness() {
        return fullness;
    }

    void eat(Plate plate) {
        plate.decreaseFood(getAppetite());
        fullness = true;
    }
    @Override
    public String toString() {
        return "Cat: " + fullness;
    }
}

class Plate {
    private int food;
    public int getFood(){
        return food;
    }
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