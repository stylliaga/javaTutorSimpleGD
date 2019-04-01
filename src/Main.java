import java.lang.String;
import java.util.Scanner;

public class Main {
    // Функции
    // напишем простые функции сложения,вычитания,умножения,деленния, возведения в степень
    public static void main(String[] args) {
        // считываем то что ввел юзер
        Scanner scnr = new Scanner(System.in);
        System.out.println("Пожалуйста, введите ЦЕЛЫЕ числа для расчетов.\n" +
                            " Введите первое число:");
        int digitA = scnr.nextInt();
        System.out.println("Введите второе число:");
        int digitB = scnr.nextInt();

        System.out.println("########## Результаты расчетов ##########");

        int outFunc = fncSum(digitA,digitB);
        System.out.println(outFunc);

        outFunc = fncSubtr(digitA,digitB);
        System.out.println(outFunc);

         outFunc = fncMult(digitA,digitB);
        System.out.println(outFunc);

         outFunc = fncDivsn(digitA,digitB);
        System.out.println(outFunc);

         outFunc = fncExponent(digitA,digitB);
        System.out.println(outFunc);

    }
    // сложения
    public static int fncSum(int a, int b){
        int result;
        result = a + b;
        return result;
    }
    // вычитания
    public static int fncSubtr(int a, int b){
        int result;
        result = a - b;
        return result;
    }
    // умножения
    public static int fncMult(int a, int b){
        int result;
        result = a * b;
        return result;
    }
    // деления
    public static int fncDivsn(int a, int b){
        int result;
        result = a / b;
        return result;
    }
    // возведение в степень
    public static int fncExponent(int a, int b){
        int result = 1;
        for(int i = 0; i < b; i++)
            result *=a;

        return result;
    }
}

