package ru.umar.level4;
import java.io.*;

public class task19 {
    /*
    Ввести с клавиатуры четыре числа, и вывести максимальное из них.
Если числа равны между собой, необходимо вывести любое.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить на экран максимальное из четырёх чисел.
•	Если максимальных чисел несколько, необходимо вывести любое из них.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        String number4 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        int d = Integer.parseInt(number4);
        System.out.println(a>=b && a>=c && a>=d ? a : b>=a && b>=c && b>=d ? b : c>=a && c>=b && c>=d? c : d );
    }
}
