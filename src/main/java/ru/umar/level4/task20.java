package ru.umar.level4;
import java.io.*;

public class task20 {
    /*
    Ввести с клавиатуры три числа, и вывести их в порядке убывания.
Выведенные числа должны быть разделены пробелом.

Требования:
•	Программа должна считывать числа c клавиатуры.
•	Программа должна выводить числа на экран.
•	Программа должна выводить три числа разделенных пробелами.
•	Программа должна выводить числа в порядке убывания.
     */
    public static void main(String[] args) throws Exception {

        BufferedReader reader = new BufferedReader(new InputStreamReader(System.in));
        int a = Integer.parseInt(reader.readLine());
        int b = Integer.parseInt(reader.readLine());
        int c = Integer.parseInt(reader.readLine());
        int a1 = 0;
        int b1 = 0;
        int c1 = 0;
        if (a > b){
            a1++;
        }
        if (a > c){
            a1++;
        }
        if(b > a){
            b1++;
        }
        if (b > c){
            b1++;
        }
        if (c > a){
            c1++;
        }
        if (c > b){
            c1++;
        }
        if(a1 >= b1 && b1 >= c1){
            System.out.println(a +" "+ b +" "+ c);
        }else if(a1 >= c1 && c1 >= b1 ){
            System.out.println(a +" "+ c +" "+ b);
        }else if(b1 >= a1 && a1 >= c1){
            System.out.println(b +" "+ a +" "+ c);
        }else if(b1 >= c1 && c1 >= a1){
            System.out.println(b +" "+ c +" "+ a);
        }else if(c1 >= a1 && a1 >= b1){
            System.out.println(c +" "+ a +" "+ b);
        }else if(c1 >= b1 && b1 >= a1){
            System.out.println(c +" "+ b +" "+ a);
        }
    }
}
