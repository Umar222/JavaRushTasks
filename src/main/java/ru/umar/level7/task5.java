package ru.umar.level7;
import java.io.BufferedReader;
import java.io.InputStreamReader;
public class task5 {

    /*
    1. Создать массив на 20 чисел.
    2. Ввести в него значения с клавиатуры.
    3. Создать два массива на 10 чисел каждый.
    4. Скопировать большой массив в два маленьких: половину чисел в первый маленький, вторую половину во второй маленький.
    5. Вывести второй маленький массив на экран, каждое значение выводить с новой строки.

    Требования:
•	Программа должна создавать большой массив на 20 целых чисел.
•	Программа должна считывать с клавиатуры 20 чисел для большого массива.
•	Программа должна создавать два маленьких массива на 10 чисел каждый.
•	Программа должна скопировать одну половину большого массива в первый маленький, а вторую - во второй и вывести второй маленький массив на экран
     */

    public static void main(String[] args) throws Exception {
        int [] bigArray = new int[20];
        int [] littleArray1 = new int[10];
        int [] littleArray2 = new int[10];
        BufferedReader buffer = new BufferedReader(new InputStreamReader(System.in));
        for (int i = 0; i < bigArray.length; i++){
            bigArray[i] = Integer.parseInt(buffer.readLine());
        }

        for (int i = 0; i < littleArray1.length; i++){
            littleArray1[i] = bigArray[i];
        }

        for (int i = 0; i < littleArray2.length; i++){
            littleArray2[i] = bigArray[10 + i];
            System.out.println(littleArray2[i]);
        }

    }
}
