package ru.umar.level7;
import java.io.BufferedReader;
import java.io.InputStreamReader;


public class task4 {

    /*
    1. Создать массив на 10 чисел.
    2. Ввести с клавиатуры 10 чисел и записать их в массив.
    3. Вывести на экран элементы массива в обратном порядке, каждое значение выводить с новой строки.

Требования:
•	Программа должна создавать массив на 10 целых чисел.
•	Программа должна считывать числа для массива с клавиатуры.
•	Программа должна выводить 10 строчек, каждую с новой строки.
•	Массив должен быть выведен на экран в обратном порядке.
     */

    public static void main(String[] args) throws Exception {
        int [] numbers = new int[10];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for(int i = 0; i < numbers.length; i++){
            numbers[i] = Integer.parseInt(buffer.readLine());
        }
        for (int i = 0; i < 10; i++)
            System.out.println(numbers[9 - i]);
    }
}
