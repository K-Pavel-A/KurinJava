package org.example;

import java.util.Scanner;
import static java.lang.Integer.parseInt;

public class Main {
    public static void main(String[] args) {
        String input;
        Scanner scanner = new Scanner(System.in);

        int menuItem = inputProcessing("Введите номер задания для проверки:\n" + "1. Первое задание\n" +
                "2. Второе задание\n" + "3. Третье задание");

        switch (menuItem) {
            case 1:
                // Task 1
                String messageForFirstTask = "Чтобы поздороваться, введите число больше 7-ми:";

                String firstTaskResult = (inputProcessing(messageForFirstTask) > 7)
                        ? "Привет!" : "Вы ввели число меньше 7-ми";
                System.out.println(firstTaskResult);
                break;

            case 2:
                // Task 2
                String name = "Вячеслав";

                System.out.println("Введите Ваше имя:");
                input = scanner.nextLine();

                if (input.equals(name)) {
                    System.out.println("Привет, Вячеслав!");
                } else {
                    System.out.println("Нет такого имени");
                }
                break;

            case 3:
                // Task 3
                int size = inputProcessing("Введите размер массива:");
                int[] array = new int[size];
                int element;

                for (int i = 0; i < array.length; i++) {
                    element = inputProcessing("Введите " + (i + 1) + " элемент массива:");
                    array[i] = element;
                }

                System.out.println("Числа кратные 3:");
                for (int elements : array) {
                    if (elements % 3 == 0) {
                        System.out.println(elements);
                    }
                }
                break;

            default:
                System.out.println("Нет такого задания!");
                break;
        }
    }

    // Метод обработки ввода
    public static int inputProcessing(String message) {

        Scanner scanner = new Scanner(System.in);
        int processedInput;

        while (true) {
            System.out.println(message);
            String input = scanner.nextLine();
            try {
                processedInput = parseInt(input);
                break;
            } catch (NumberFormatException exception) {
                System.out.println("Вы ввели не число!");
            }
        }

        return processedInput;
    }
}