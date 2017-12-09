/**
 * Java. Level 1. Lesson 5. Homework
 *
 * @author Ivan Petrov
 * @version dated Dec 08, 2017
 * @link https://github.com/ljohnpetrov/Java.git
 */
/**
* 1. Создать класс "Сотрудник" с полями: ФИО, должность, email, телефон, зарплата, возраст;
*
* 2. Конструктор класса должен заполнять эти поля при создании объекта;
*
* 3. Внутри класса «Сотрудник» написать метод, который выводит информацию об объекте в консоль;
*
* 4. Создать массив из 5 сотрудников
*
* Пример:
* Person[] persArray = new Person[5]; // Вначале объявляем массив объектов
* persArray[0] = new Person("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30); // потом для каждой ячейки массива задаем объект
* persArray[1] = new Person(...);
* ...
* persArray[4] = new Person(...);
* 5. С помощью цикла вывести информацию только о сотрудниках старше 40 лет;
 */

public class HW5_lesson {

    public static void main(String[] args) {
        Cooperator[] Array = new Cooperator[5];
        Array[0] = new Cooperator("Ivanov Ivan", "Engineer", "ivivan@mailbox.com", "892312312", 30000, 30);
        Array[1] = new Cooperator("Petrov Bogdan", "Manager", "bogd@mailbox.com", "41432546", 20000, 47);
        Array[2] = new Cooperator("Ignat Bibigon", "Teller", "ignatik@mabox.com", "863545424", 24000, 43);
        Array[3] = new Cooperator("Dmitriy Shilin", "Animator", "dimshil@mail.com", "98754634", 44000, 25);
        Array[4] = new Cooperator("Zanko Vsevolod", "Architect", "zanko@inbox.com", "245346432", 56000, 25);
        for (Cooperator search : Array) {
            if (search.age > 40)
            System.out.println(search.Cooperator());
        }
    }
}

    class Cooperator {
        String name;
        String position;
        String email;
        String phone;
        int salary;
        int age;

        Cooperator(String name, String position, String email, String phone, int salary, int age) {
            this.name = name;
            this.position = position;
            this.email = email;
            this.phone = phone;
            this.salary = salary;
            this.age = age;
        }

        public String Cooperator() {
            return "name: " + name + " position: " + position + " email: " + email + " phone: " + phone + " salary: " + salary;

        }
    }

