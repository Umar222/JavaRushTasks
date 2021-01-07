package ru.umar.level7;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;

public class task9 {
    /*
    1. Создай список строк.
    2. Считай с клавиатуры 5 строк и добавь в список.
    3. Используя цикл, найди самую длинную строку в списке.
    4. Выведи найденную строку на экран. Если таких строк несколько, выведи каждую с новой строки.

Требования:
•	В методе main инициализируй существующее поле strings класса Solution новым ArrayList<>
•	Программа должна считывать 5 строк с клавиатуры и записывать их в поле strings класса Solution.
•	Программа должна выводить самую длинную строку на экран.
•	Если есть несколько строк с длиной равной максимальной, то нужно вывести каждую из них с новой строки.
     */
    private static ArrayList<String> strings;


    public static void main(String[] args) throws Exception {
        strings = new ArrayList<>();

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < 5; i++) {
            strings.add(reader.readLine());
        }

        int maxStringLength = strings.get(0).length();
        for (String string : strings) {
            if (string.length() > maxStringLength) {
                maxStringLength = string.length();
            }
        }

        for (String string : strings) {
            if (string.length() == maxStringLength) {
                System.out.println(string);
            }
        }
    }
}
