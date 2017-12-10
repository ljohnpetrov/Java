/**
 * Java. Level 1. Lesson 6. Homework
 *
 * @author Ivan Petrov
 * @version dated Nov 30, 2017
 * @link https://github.com/ljohnpetrov/Java
 */
public class Main {
/**1. Создать классы Собака и Кот с наследованием от класса Животное.
 * 2. Животные могут выполнять действия: бежать, плыть, перепрыгивать препятствие. 
 * В качестве параметра каждому методу передается величина,
 * означающая или длину препятствия (для бега и плавания),
 * или высоту (для прыжков).
 * 3. У каждого животного есть ограничения на действия 
 * (бег: кот 200 м., собака 500 м.; прыжок: кот 2 м., собака 0.5 м.;
 * плавание: кот не умеет плавать, собака 10 м.)
 * 4. При попытке животного выполнить одно из этих действий,
 * оно должно сообщить результат в консоль.
 * (Например, dog1.run(150); -> результат: run: true)
 */
    public static void main(String[] args) {
        Animal[] animal = {new Cat(), new Dog()};
        Cat cat1 = new Cat();
        Dog dog1 = new Dog();
        for (Animal beast : animal) {
            System.out.println(beast.name() + ".run(200) -> rezult: " + beast.run(150));
            System.out.println(beast.name() + ".jump(0.3) -> rezult: " + beast.jump(0.3));
            System.out.println(beast.name() + ".swim(2) -> rezult: " + beast.swim(2));
            System.out.println();
        }
    }
}
interface IAnimal {
    boolean run(int r);
    boolean swim(int s);
    boolean jump(double j);
    String name();
}

abstract class Animal implements IAnimal {
    String name;
    int r;
    int s;
    double j;
    Animal() {
        this.name = name;
        this.r = r;
        this.s = s;
        this.j = j;
    }
}

class Cat extends Animal {
    Cat() {
        this.name = name;
        this.r = r;
        this.s = s;
        this.j = j;
    }
    public String name() {
        return "cat";
    }
    public boolean run(int r) {
        if (r <= 200)
            return true;
        return false;
        }
    public boolean swim(int s) {
        return false;
    }
    public boolean jump(double j) {
        if (j <= 2)
            return true;
        return false;
        }
    }
class Dog extends Animal {
    Dog() {
        this.name = name;
        this.r = r;
        this.s = s;
        this.j = j;
    }
    public String name() {
        return "dog";
    }
    public boolean run(int r) {
        if (r <= 500)
            return true;
        return false;
    }
    public boolean swim(int s) {
        if (s <= 10)
            return true;
        return false;
    }
    public boolean jump(double j) {
        if (j <= 0.5)
            return true;
        return false;
    }
}
