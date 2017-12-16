/**
 * Java. Level 1. Lesson 7. Homework
 *
 * @author Ivan Petrov
 * @version dated Dec 15, 2017
 * @link https://github.com/ljohnpetrov/Java
 */

import java.io.*;
class HW7_Lesson {
/**1. Расширить задачу про котов и тарелки с едой
 * 2. Сделать так, чтобы в тарелке с едой не могло получиться отрицательного количества еды 
 * (например, в миске 10 еды, а кот пытается покушать 15-20)
 * 3. Каждому коту нужно добавить поле сытость (когда создаем котов, они голодны). 
 * Если коту удалось покушать (хватило еды), сытость = true
 * 4. Считаем, что если коту мало еды в тарелке, то он ее просто не трогает,
 * то есть не может быть наполовину сыт (это сделано для упрощения логики программы)
 * 6. Добавить в тарелку метод, с помощью которого можно было бы добавлять еду в тарелку
 */
    public static void main(String[] args) {
        Cat cat = new Cat("Barsik", 20, false);
        Plate plate = new Plate(30);
        System.out.println(plate);
        if(cat.getAppetite() > plate.getFood()){
            System.out.println("Not enouth eat");
            System.out.println(cat);
        }else {
            cat.eat(plate);
            System.out.println(plate +"; "+ cat);
        }
        plate.addfood(20);
        System.out.println(plate);
    }
}

class Cat {
    private String name;
    private int appetite;
    public int getAppetite(){
        return appetite;
    }
    public void setAppetite(int appetite){
        this.appetite = appetite;
    }
    private boolean fullness;
    public Cat(String name, int appetite, boolean fullness) {
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
    private int food;
    int addfood;
    public int getFood(){
        return food;
    }
    public Plate(int food) {
        this.food = food;
    }

    void decreaseFood(int food) {
        this.food -= food;
    }
    void addfood(int addfood) {
        this.food += addfood;
    }

    @Override
    public String toString() {
        return "Plate: " + food;
    }
}
