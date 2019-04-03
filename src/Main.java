import java.lang.String;
import java.util.Scanner;

public class Main {
    // Функции
    // напишем простые функции сложения,вычитания,умножения,деленния, возведения в степень
    public static void main(String[] args) {
        //int typeOfOps, digitA,digitB;

        // Просим чтобы юзер ввел цифры в соответствии с математической операцией
        greetings();
    }
    // функция запускающая главный процесс
    public static void greetings (){
        System.out.println("Выберите один из пунктов с желаемой математической операцией:\n" +
                "1. Сложение\n" +
                "2. Вычитание\n" +
                "3. Умножение\n" +
                "4. Деление\n" +
                "5. Возведение в корень\n" +
                "6. Извлечение корня\n" +
                "(Введите от 1 до 6 и нажмите ЕНТЕР)");
        // создаем сканер и считываем выбранное
        Scanner scnr = new Scanner(System.in);
        int typeOfOps = scnr.nextInt();
        // если ввел что то непонятное - останавливаем программу
        stopProgramChoose(typeOfOps);

        // просим юзера ввести числа
        System.out.println("Пожалуйста, введите ЦЕЛЫЕ числа для расчетов.\n" +
                " Введите первое число:");
        int digitA = scnr.nextInt();
        // если ввел что то непонятное - останавливаем программу
        stopProgram(digitA);

        System.out.println("Введите второе число:");
        int digitB = scnr.nextInt();
        // если ввел что то непонятно перезапускаем программу
        stopProgram(digitB);

        System.out.println("########## Результаты расчетов ##########");
        String outMathOps = mathOps(digitA,digitB,typeOfOps);

        System.out.println(outMathOps);
        return;
    }
    public static void stopProgramChoose(int a){
        if(a > 6){
            System.out.println("Вы ввели не правильное число для операции.");
            // запускаем программу заново
            greetings();
            //System.exit(0);
        }
    }

    public static void stopProgram(int a){
        //if(a > 6){
        //    System.out.println("Вы ввели не правильное число для операции.");
         //   greetings();
            //System.exit(0);
        //}
    }
    public static String mathOps(int z,int x,int v){
        String rtrn = new String();
        switch (v){
            case 1:
                System.out.println("Вы выбрали операцию сложения.");
                rtrn = String.valueOf(fncSum(z, x));
                break;
            case 2:
                System.out.println("Вы выбрали операцию вычитания.");
                rtrn = String.valueOf(fncDiff(z, x));
                break;
            case 3:
                System.out.println("Вы выбрали операцию умножения.");
                rtrn = String.valueOf(fncMult(z, x));
                break;
            case 4:
                System.out.println("Вы выбрали операцию деления.");
                rtrn = String.valueOf(fncDivsn(z, x));
                break;
            case 5:
                System.out.println("Вы выбрали операцию возведения в степень.");
                rtrn = String.valueOf(fncExponent(z, x));
                break;
            case 6:
                System.out.println("Вы выбрали операцию нахождения корня.");
                rtrn = String.valueOf(fncRoot(z, x));
                break;
            default:
                String wTpOp = new String();
                if(z == 0) {
                    wTpOp = "первую цифру";
                }
                if(x == 0) {
                    wTpOp = "вторую цифру";
                }
                if(v == 0) {
                    wTpOp = "тип операции";
                }
                System.out.println("Вы не ввели "+ wTpOp+"!");
        }
        return rtrn;
    }
    // сложения
    public static int fncSum(int a, int b){
        int result;
        result = a + b;
        return result;
    }
    // вычитания
    public static int fncDiff(int a, int b){
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
    // вычисление корня
    public static String fncRoot(int a, int b){
        //Math.pow(a, 1.0 / b) = Math.exp(Math.log(a)/b);
        double resultDouble = Math.exp(Math.log(a)/b);
        String result = String.valueOf(resultDouble);
        return result;
    }
}

