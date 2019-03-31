import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // МАССИВЫ многомерные - юзер указывает размерность массива
        // потом вводит строки в каждую ячейку согласно его размерности

        // сначала попробуем сделать строковый квадратный многомерный массив
        Scanner scnr = new Scanner(System.in);

        //собираем данные - сколько ячеек будет в массиве
        System.out.println("Введите количество ячеек в массиве:");

        //первый эл-т строкового массива
        int elemStrArr1 = scnr.nextInt();


        //собираем данные - сколько ячеек будет в массиве
        System.out.println("Введите количество подъячеек в массиве:");

        //первый эл-т строкового массива
        int elemStrArr2 = scnr.nextInt();

        String[][] arrMass = new String[elemStrArr1][elemStrArr2];
        int f = arrMass.length;
        // добавляем считывание строки, оптому что программа считывает символ \n после нажатия ЕНТЕР как новую строку
        scnr.nextLine();
        for(int i = 0; i < arrMass.length; i++){
            System.out.println("Введите значение для ячейки массива:" + f );
            for(int j = 0; j < arrMass[i].length; j++){
                String strng = new String();
               // scnr.nextLine();
                System.out.println("Подъячейка№:" + j );
                strng = scnr.nextLine();
                arrMass[i][j] = strng;
            }
            f = f-1;
        }
        // выводим все
        System.out.println("#################################");

        for(int i = 0; i < arrMass.length; i++){
            System.out.println("arrMass["+i+"]");
            for(int j = 0; j < arrMass[i].length; j++){
                System.out.print(""+arrMass[i][j]+" ");
            }
            System.out.println("");

        }
    }
}
