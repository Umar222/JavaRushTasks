package ru.umar.level4;
import java.io.*;

public class task18 {
    /*
    Ввести с клавиатуры два целых числа, и вывести на экран минимальное из них.
Если два числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран минимальное из двух целых чисел.
•	Если два числа равны между собой, необходимо вывести любое.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        if(a < b){
            System.out.println(a);
        } else if (a > b){
            System.out.println(b);
        } else {
            System.out.println(b);
        }
    }
}
