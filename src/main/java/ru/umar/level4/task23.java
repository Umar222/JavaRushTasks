package ru.umar.level4;
import java.io.*;

public class task23 {
    /*
    Ввести с клавиатуры имя и возраст. Если возраст больше 20 вывести надпись "И 18-ти достаточно".

Требования:
•	Программа должна считывать строки c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст больше 20 вывести только сообщение "И 18-ти достаточно".
•	Если возраст меньше либо равно 20 ничего не выводить
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age1 = reader.readLine();
        int age = Integer.parseInt(age1);
        if(age > 20){
            System.out.println("И 18-ти достаточно");
        }

    }

}
