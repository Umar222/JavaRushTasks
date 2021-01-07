package ru.umar.level4;
import java.io.*;

public class task29 {
    /*
    Ввести с клавиатуры три целых числа. Вывести на экран количество положительных и количество отрицательных чисел в исходном наборе, в следующем виде:
"количество отрицательных чисел: а", "количество положительных чисел: б",
где а, б - искомые значения.

Пример:
а) при вводе чисел
2
5
6
получим вывод
количество отрицательных чисел: 0
количество положительных чисел: 3
Пример:
б) при вводе чисел
-2
-5
6
получим вывод
количество отрицательных чисел: 2
количество положительных чисел: 1

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить количество отрицательных чисел в исходном наборе.
•	Программа должна выводить количество положительных чисел в исходном наборе.
•	Если отрицательных чисел нет,
программа должна вывести "количество отрицательных чисел: 0".
•	Если положительных чисел нет, программа должна вывести "количество положительных чисел: 0".
•	Учесть, что число "0" не относится ни к положительным, ни к отрицательным числам.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        String c = reader.readLine();
        int num1 = Integer.parseInt(a);
        int num2 = Integer.parseInt(b);
        int num3 = Integer.parseInt(c);
        int positive = 0;
        int negative = 0;
        if(num1 > 0)
            positive ++;
        if(num1 < 0)
            negative ++;
        if(num2 > 0)
            positive ++;
        if(num2 < 0)
            negative ++;
        if(num3 > 0)
            positive ++;
        if(num3 < 0)
            negative ++;
        System.out.println("количество отрицательных чисел: " + negative + "\nколичество положительных чисел: "+ positive);

    }
}