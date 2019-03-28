import java.lang.String;
import  java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // математические операции

        // обьявляем новый сканер и пихаем его в переменную
        Scanner scnr = new Scanner(System.in);

        // обьявляем переменные
        int a,b,result;

        // говорим юзеру что что то ввел
        System.out.println("Операция сложения");
        System.out.print("Введите первое число:");
        a = scnr.nextInt();
        System.out.print("Введите второе число:");
        b = scnr.nextInt();
        result = a + b;
        System.out.println("Сумма ваших чисел равна: " + result);
        System.out.println("------------------------------------------------------");
        System.out.println("Операция вычитания");
        System.out.print("Введите первое число:");
        a = scnr.nextInt();
        System.out.print("Введите второе число:");
        b = scnr.nextInt();
        result = a - b;
        System.out.println("Разность ваших чисел равна: " + result);
        System.out.println("------------------------------------------------------");
        System.out.println("Операция умножения");
        System.out.print("Введите первое число:");
        a = scnr.nextInt();
        System.out.print("Введите второе число:");
        b = scnr.nextInt();
        result = a * b;
        System.out.println("Произведение ваших чисел равно: " + result);
        System.out.println("------------------------------------------------------");
        System.out.println("Операция деления");
        System.out.print("Введите первое число:");
        a = scnr.nextInt();
        System.out.print("Введите второе число:");
        b = scnr.nextInt();
        result = a / b;
        System.out.println("Частное ваших чисел равно: " + result);
        System.out.println("------------------------------------------------------");

    }
}
