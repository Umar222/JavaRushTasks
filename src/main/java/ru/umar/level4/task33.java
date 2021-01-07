package ru.umar.level4;

public class task33 {
/*
Вывести на экран квадрат из 10х10 букв S используя цикл while.
Буквы в каждой строке не разделять.

Пример вывода на экран:
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS
SSSSSSSSSS

Требования:
•	Программа не должна считывать текст c клавиатуры.
•	Программа должна выводить текст на экран.
•	Программа должна выводить квадрат из 10х10 букв S.
•	В программе должен использоваться цикл while.
MEDIUM
 */
public static void main(String[] args) {
    int i = 0;
    while(i < 10){
        int b = 0;
        while(b < 10){
            b++;
            System.out.print("S");
        }
        System.out.println();
        i++;
    }

}

}
