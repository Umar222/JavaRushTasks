package ru.umar.level4;
import java.io.*;

public class task28 {
/*
Ввести с клавиатуры три целых числа. Вывести на экран количество положительных чисел среди этих трех.
Примеры:
а) при вводе чисел
-4
6
6
получим вывод
2

б) при вводе чисел
-6
-6
-3
получим вывод
0
в) при вводе чисел
0
1
2
получим вывод
2
Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить число на экран.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если положительных чисел нет, программа должна вывести "0".
•	Учти, что "0" не относится ни к положительным, ни к отрицательным числам.
     */
public static void main(String[] args) throws Exception {
    BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
    String a = reader.readLine();
    String b = reader.readLine();
    String c = reader.readLine();
    int num1 = Integer.parseInt(a);
    int num2 = Integer.parseInt(b);
    int num3 = Integer.parseInt(c);
    if(num1 > 0 && num2 <= 0 && num3 <= 0 || num1 <= 0 && num2 > 0 && num3 <= 0 || num1 <= 0 && num2 <= 0 && num3 > 0){
        System.out.println(1);
    } else if(num1 > 0 && num2 > 0 && num3 <= 0 || num1 <= 0 && num2 > 0 && num3 > 0 || num1 > 0 && num2 <= 0 && num3 > 0){
        System.out.println(2);
    } else if(num1 > 0 && num2 > 0 && num3 > 0){
        System.out.println(3);
    } else if (num1 <= 0 && num2 <= 0 && num3 <= 0){
        System.out.println(0);
    }
}
}
