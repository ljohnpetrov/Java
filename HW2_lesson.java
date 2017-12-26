/**
 * Java. Level 1. Lesson 6. Homework
 *
 * @author Ivan Petrov
 * @version dated Nov 30, 2017
 * @link https://github.com/ljohnpetrov/Java
 */

import java.text.NumberFormat;
import java.util.*;
import java.io.*;

public class Main {
    static String[] Arrs = readFromFile(new File("src/file.txt"));

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

