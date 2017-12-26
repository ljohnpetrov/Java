/**
 * Java. Level 2. Lesson 2. Homework
 *
 * @author Ivan Petrov
 * @version dated Dec 26, 2017
 * @link https://github.com/ljohnpetrov/Java
 */
 
import java.text.NumberFormat;
import java.util.*;
import java.io.*;
/**
 *1. Напишите метод, на вход которого подаётся двумерный строковый массив размером 4х4,
 *при подаче массива другого размера необходимо бросить исключение ArrayIndexOutOfBoundsException.
 *2. Далее метод должен пройтись по всем элементам массива, преобразовать в int,
 *и просуммировать. Если в каком-то элементе массива преобразование не удалось 
 *(например, в ячейке лежит символ или текст вместо числа),
 *должно быть брошено исключение NumberFormatException, с детализацией в какой именно ячейке лежат неверные данные.
 *3. В методе main() вызвать полученный метод, 
 *обработать возможные исключения ArrayIndexOutOfBoundsException и NumberFormatException, и вывести результат расчета.
 *4. *** Прочитать двухмерный строковый массив из текстового файла.
*/
public class HW2_lesson {
    static String[] Arrs = readFromFile(new File("file.txt"));

    public static void main(String[] args) {
        for(String s : Arrs)
            try {
                System.out.println(testErrors(s));
            } catch (NumberFormatException | ArrayIndexOutOfBoundsException q) {
                System.out.println(q);
            }
    }

    static int testErrors(String Arrs)
            throws NumberFormatException, ArrayIndexOutOfBoundsException {
        int summ = 0;
        String Mass[][] = new String[4][4];
        String[] strArr = Arrs.split(", ");
        if (strArr.length != 4)
            throw new ArrayIndexOutOfBoundsException("Error: out of array");
        for (int i = 0; i < strArr.length; i++) {
            Mass[i] = strArr[i].split(" ");
            System.out.println(Arrays.toString(Mass[i]));
            if (Mass[i].length != 4) {
                throw new ArrayIndexOutOfBoundsException(" Error in  column" + (i + 1));
            }
        }
            for (String[] mass : Mass)
                for (String element : mass)
                    summ += Integer.parseInt(element);
            return summ;
        }

    static String[] readFromFile(File file) {
        String str = "";
        try (Scanner read = new Scanner(file)) {
            while (read.hasNext())
                str += read.nextLine() + " ";
        } catch (IOException ex) {  }
        return str.split("q");
    }
}

