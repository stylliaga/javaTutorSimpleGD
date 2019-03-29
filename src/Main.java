import java.lang.String;
import  java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args){
        // SWITCH CASE - условные операторы
        // легкий консольный калькулатор без проверок с
        // простыми числами

        // создаем сканнер чтобы парсить то что вводит юзер
        Scanner scnr = new Scanner(System.in);

        // обьявляем переменные(пока простые int) - mathOperation будет ловить какую операцию мы будем
        // проивзодить - деление, умноение и т.д.
        int a,b,c,r,mathOperation;

        // обьявляем переменную которая будет служить определителем операции
        String symbOfOperation;

        // строковая переменная которая уведомит о выборе операции
        String str;

        // просим чтобы человек ввел что нибудь
        System.out.println("Пожалуйста, выберите какую математическую операцию вы желаете произвести:" +
                "           \n1.Сложение" +
                "           \n2.Вычитание" +
                "           \n3.Умножение" +
                "           \n4.Деление " +
                "           \n(Введите цифру от 1 до 4)");

        // ловим что он выбрал и проверяем
        // в соответствии с тем что он выбрал выводим в консоль
        mathOperation = scnr.nextInt();
        switch(mathOperation){

            // если ввел 1, то операция сложения
            case 1:
                symbOfOperation = "+";
                str = "Вы выбрали операцию сложения чисел.";
                break;
            case 2:
                // если ввел 2, то операция вычитания
                symbOfOperation = "-";
                str = "Вы выбрали операцию вычитания чисел.";
                break;
            case 3:
                // если ввел 3, то операция умножения
                symbOfOperation = "*";
                str = "Вы выбрали операцию умножения чисел.";
                break;
            case 4:
                // если ввел 4, то операция деления
                symbOfOperation = "/";
                str = "Вы выбрали операцию деления чисел.";
                break;
            default:
                // если ничего не ввел или ввел левое число
                symbOfOperation = "";
                str = "Вы не выбрали вид мат. операции!";
                break;
        }

        // выводим в консоль уведомление о выбранно мат. операции
        System.out.println(""+str+"");
        // ловим первое число
        System.out.println("Пожaлуйста, введите первое число:");
        a = scnr.nextInt();
        // ловим второе число
        System.out.println("Пожaлуйста, введите второе число:");
        b = scnr.nextInt();

        // соединяем все в одну строку чтобы потом произвести операцию
        StringBuilder sb = new StringBuilder();
        sb.append(a).append(symbOfOperation).append(b);

        // сохраянем строку в переменную
        String strSb = sb.toString();

        // используем нечто из JavaScript - это нечто обьединит все в одну строку
        // и представит так что бы мат. операция прошла успешно
        ScriptEngineManager manager = new ScriptEngineManager();
        ScriptEngine engine = manager.getEngineByName("js");
        // ловим ошибки если они есть
        try {
            Object result = engine.eval(strSb);
            System.out.println(result);
        } catch (ScriptException e) {}

    }
}
