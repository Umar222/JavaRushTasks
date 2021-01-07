package ru.umar.level4;
import java.io.*;

public class task25 {
    /*
    числа, которые будут координатами точки, не лежащей на координатных осях OX и OY.
Вывести на экран номер координатной четверти, в которой находится данная точка.
Подсказка:
Принадлежность точки с координатами (a,b) к одной из четвертей определяется следующим образом:
для первой четверти a>0 и b>0;
для второй четверти a<0 и b>0;
для третьей четверти a<0 и b<0;
для четвертой четверти a>0 и b<0.

Пример для чисел 4 6:
1

Пример для чисел -6 -6:
3

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если точка находится в первой координатной четверти, вывести "1".
•	Если точка находится во второй координатной четверти, вывести "2".
•	Если точка находится в третей координатной четверти, вывести "3".
•	Если точка находится в четвёртой координатной четверти, вывести "4".
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        if(num1 > 0 && num2 > 0){
            System.out.println(1);
        }else if(num1 < 0 && num2 > 0){
            System.out.println(2);
        }else if(num1 < 0 && num2 < 0){
            System.out.println(3);
        }else if(num1 > 0 && num2 < 0){
            System.out.println(4);
        }

    }

}
