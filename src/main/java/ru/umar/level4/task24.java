package ru.umar.level4;
import java.io.*;

public class task24 {
    /*
    Ввести с клавиатуры три целых числа. Одно из чисел отлично от двух других, равных между собой. Вывести на экран порядковый номер числа, отличного от остальных.

Пример для чисел 4 6 6:
1

Пример для чисел 6 6 3:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команды System.out.println() или System.out.print().
•	Программа должна выводить на экран порядковый номер числа, отличного от остальных.
•	Если все числа разные, ничего не выводить.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int num3 = Integer.parseInt(c);
        if(num1 != num2 && num2 == num3){
            System.out.println(1);
        }else if(num2 != num1 && num1 == num3){
            System.out.println(2);
        }else if(num3 != num2 && num2 == num1){
            System.out.println(3);
        }
    }

}
