/**
 * Java. Level 2. Lesson 3. Homework
 *
 * @author Ivan Petrov
 * @version dated Jan 03, 2018
 * @link https://github.com/ljohnpetrov/Java
 */
import java.util.*;
import java.lang.*;
import java.io.*;
/**1. Создать массив с набором слов (10-20 слов, должны встречаться повторяющиеся). 
 * Найти и вывести список уникальных слов, из которых состоит массив (дубликаты не считаем). 
 * Посчитать сколько раз встречается каждое слово.
 * 1a *** Вместо массива прочесть слова из текстового файла.
 */

public class HW3_lesson {
    static String[] readFromFile(File file) {
        String str = "";
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext())
                str += read.nextLine() + " ";
        } catch (IOException ex) {}
        return str.split(", ");
    }

    public static void main(String[] args) {
        System.out.println("task1");
        ArrayListExample();
        System.out.println();
        Book();
    }

    static void ArrayListExample() {
        Integer a;
        Map <String,Integer> list = new HashMap<>();
        String[] eat = readFromFile(new File("file.txt"));
        for(String s : eat){
            a = list.get(s);
            if (a == null)
                list.put(s, 1);
            else
                list.put(s, a+1);
        }

        System.out.print(list);
        System.out.print("\nThere are " + list.size() +" unique words in array of " + eat.length + " words");

    }
    
    static void Book() {
        Phonebook pb = new Phonebook();
        pb.put(" Boss", "1231232 ");
        pb.put(" Mom", "42142342 ");
        pb.put(" Dad", "3214324 ");
        pb.put(" Bro", "4124342 ");
        pb.put(" Bro", "21434324 ");

        System.out.println("task2");
        System.out.println(pb);
        System.out.println("Phones of Bro:");
        System.out.println(pb.get(" Bro"));
    }
}
/**2. Написать простой класс ТелефонныйСправочник, который хранит в себе список фамилий и телефонных номеров. 
 * В этот телефонный справочник с помощью метода add() можно добавлять записи. 
 * С помощью метода get() искать номер телефона по фамилии. 
 * Следует учесть, что под одной фамилией может быть несколько телефонов (в случае однофамильцев),
 * тогда при запросе такой фамилии должны выводиться все телефоны.
 */
 
class Phonebook {
    Map <String, String> pbook;

    Phonebook(){
        pbook = new HashMap<>() ;
    }

    void put(String name, String phone) {
        pbook.put(phone, name);
    }

    List<String> get(String name) {
        List<String> book = new ArrayList<>();
        for (Map.Entry<String, String> inn : pbook.entrySet())
            if (name.equals(inn.getValue()))
                book.add(inn.getKey());
        return book;
    }

    @Override
    public String toString() {
        return pbook.toString();
    }
}