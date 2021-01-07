package ru.umar.level4;

public class task3 {
    /*
    Помогите коту обрести имя с помощью метода setName.

Требования:
•	Класс Cat должен содержать только одну переменную name.
•	Переменная name должна иметь модификатор доступа private и тип String.
•	Класс Cat должен содержать только два метода setName и main.
•	Метод setName класса Cat должен устанавливать значение переменной private String name равным переданному параметру String name.
     */

    private String name = "безымянный кот";

    public void setName(String name) {
        this.name = name;
        //напишите тут ваш код

    }

    public static void main(String[] args) {
        task3 cat = new task3();
        cat.setName("Жужик");
        System.out.println(cat.name);
    }
}
