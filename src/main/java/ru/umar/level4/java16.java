package ru.umar.level4;
import java.io.*;

public class java16 {
    /*
    Пример для числа 2.5:
зелёный

Пример для числа 3:
жёлтый

Пример для числа 4:
красный

Пример для числа 5:
зелёный

Требования:
•	Программа должна считывать вещественное число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если горит зелёный цвет, необходимо вывести текст: "зелёный"
•	Если горит жёлтый цвет, необходимо вывести текст: "жёлтый"
•	Если горит красный цвет, необходимо вывести текст: "красный"
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String number1 = reader.readLine();
        double t = Double.parseDouble(number1);
        if (t % 5 < 3.00 || t % 5 == 5.00){
            System.out.println("зелёный");
        } else if (t % 5 >= 3.00 && t % 5 < 4.00){
            System.out.println("жёлтый");
        } else if (t % 5 >= 4.00 && t % 5 < 5.00){
            System.out.println("красный");
        }

    }
}
