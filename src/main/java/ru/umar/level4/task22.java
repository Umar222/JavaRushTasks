package ru.umar.level4;
import java.io.*;

public class task22 {
    /*
    Ввести с клавиатуры имя и возраст. Если возраст меньше 18 вывести надпись "Подрасти еще".

Требования:
•	Программа должна дважды считать данные c клавиатуры.
•	Программа должна использовать команду System.out.println() или System.out.print().
•	Если возраст меньше 18 вывести только сообщение "Подрасти еще".
•	Если возраст больше либо равно 18 ничего не выводить.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String name = reader.readLine();
        String age1 = reader.readLine();
        int age = Integer.parseInt(age1);
        if(age < 18){
            System.out.println("Подрасти еще");
        }

    }

}
