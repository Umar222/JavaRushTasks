package ru.umar.level4;
import java.io.*;

public class task17 {
    /*
    Ввести с клавиатуры три целых числа. Определить, имеется ли среди них хотя бы одна пара равных между собой чисел.
Если такая пара существует, вывести на экран числа через пробел.
Если все три числа равны между собой, то вывести все три.

Примеры:
а) при вводе чисел
1
2
2
получим вывод
2 2

б) при вводе чисел
2
2
2
получим вывод
2 2 2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна содержать System.out.println() или System.out.print()
•	Если два числа равны между собой, необходимо вывести числа на экран.
•	Если все три числа равны между собой, необходимо вывести все три.
•	Если нет равных чисел, ничего не выводить.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        String number2 = reader.readLine();
        String number3 = reader.readLine();
        int a = Integer.parseInt(number1);
        int b = Integer.parseInt(number2);
        int c = Integer.parseInt(number3);
        if(a == b && a != c){
            System.out.println(a +" "+ b );
        } else if(a == c && a != b){
            System.out.println(a +" "+ c);
        } else if(b == c && c != a){
            System.out.println(b +" "+ c);
        } else if(a == b && b == c && c == a) {
            System.out.println(a +" "+ b +" "+ c);
        }
    }
}
