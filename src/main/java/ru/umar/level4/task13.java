package ru.umar.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task13 {
    /*
    Ввести с клавиатуры номер дня недели, в зависимости от номера вывести название
"понедельник", "вторник", "среда", "четверг", "пятница", "суббота", "воскресенье",
если введен номер больше 7 или меньше 1 - вывести "такого дня недели не существует".

Пример для номера 5:
пятница

Пример для номера 10:
такого дня недели не существует

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить текст на экран.
•	Если введено число от 1 до 7, необходимо вывести день недели.
•	Если введено число не входящее в интервал от 1 до 7, то вывести уведомление что такого дня недели не существует.
     */
    public static void main(String[] args) throws Exception {
        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String week = reader.readLine();
        int n = Integer.parseInt(week);
        if(n == 1){
            System.out.println("понедельник");
        } else if (n == 2){
            System.out.println("вторник");
        } else if (n == 3){
            System.out.println("среда");
        } else if (n == 4){
            System.out.println("четверг");
        } else if (n == 5){
            System.out.println("пятница");
        } else if (n == 6){
            System.out.println("суббота");
        } else if (n == 7){
            System.out.println("воскресенье");
        } else if (n > 7 || n < 1){
            System.out.println("такого дня недели не существует");
        }

    }
}
