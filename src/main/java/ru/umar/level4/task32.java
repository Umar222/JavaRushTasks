package ru.umar.level4;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class task32 {
    /*
    Ввести с клавиатуры строку и число N больше 0.
Вывести на экран строку N раз используя цикл while. Каждое значение с новой строки.

Пример ввода:
абв
2

Пример вывода:
абв
абв

Требования:
•	Программа должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Каждое значение должно быть выведено с новой строки.
•	Программа должна выводить на экран строку N раз.
•	В программе должен использоваться цикл while.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String a = reader.readLine();
        String b = reader.readLine();
        int num1 = Integer.parseInt(b);
        while (num1 > 0){
            num1 --;
            System.out.println(a);
        }
    }

}
