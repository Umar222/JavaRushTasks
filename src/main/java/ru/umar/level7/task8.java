package ru.umar.level7;
import java.util.ArrayList;
public class task8 {
    /*
    1. Создай список строк.
    2. Добавь в него 5 различных строк.
    3. Выведи его размер на экран.
    4. Используя цикл выведи его содержимое на экран, каждое значение с новой строки.

Требования:
•	Программа не должна ничего считывать с клавиатуры.
•	Объяви переменную типа ArrayList<String> (список строк) и сразу проинициализируй ee.
•	Программа должна добавить 5 любых строк в список.
•	Программа должна вывести размер списка на экран.
•	Программа должна вывести содержимое списка на экран, каждое значение с новой строки.
     */

    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        list.add("Раз");
        list.add("два");
        list.add("три");
        list.add("Четыре");
        list.add("Пять");
        for(int i = 0; i < list.size(); i++){
            System.out.println(list.get(i));
        }
        System.out.println(list.size());



        //напишите тут ваш код
    }
}
