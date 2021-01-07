package ru.umar.level4;

import java.io.BufferedReader;
import java.io.InputStreamReader;

public class task12 {
    /*
    Ввести с клавиатуры число.
Если число положительное, то увеличить его в два раза.
Если число отрицательное, то прибавить единицу.
Если введенное число равно нулю, необходимо вывести ноль.
Вывести результат на экран.

Требования:
•	Программа должна считывать число c клавиатуры.
•	Программа должна выводить число на экран.
•	Если введенное число положительное, необходимо увеличить его в два раза и вывести.
•	Если введенное число отрицательное, необходимо увеличить его на единицу и вывести.
•	Если введенное число равно нулю, необходимо вывести ноль.
     */

    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        String numbers = reader.readLine();
        int n = Integer.parseInt(numbers);
        if (n > 0) {
            System.out.println(n * 2);

        } else if (n == 0) {
            System.out.println(0);

        } else {
            System.out.println(n + 1);
        }

    }
}
