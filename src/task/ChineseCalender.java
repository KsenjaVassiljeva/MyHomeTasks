/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package task;

import java.util.Scanner;

public class ChineseCalender {

    private final Scanner scanner;

    public ChineseCalender(Scanner scanner) {
        this.scanner = scanner;
    }

    public void runTask() {
        System.out.print("Введите год: ");
        int year = scanner.nextInt();
        scanner.close();

        int startYear = 1984;

        String[] colors = {"зеленый", "красный", "желтый", "белый", "черный"};
        String[] animals = {"крысы", "коровы", "тигра", "зайца", "дракона", "змеи", "лошади", "овцы", "обезьяны", "курицы", "собаки", "свиньи"};

        int yearIndex = (year - startYear) % 60;
        if (yearIndex < 0) {
            yearIndex += 60;
        }

        int colorIndex = yearIndex / 12;
        int animalIndex = yearIndex % 12;
        
        String color = colors[colorIndex];
        String animal = animals[animalIndex];

        System.out.println("Год " + color + " " + animal);
    }
}



