import java.lang.String;
import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        // МАССИВЫ одномерные - юзер указывает размерность массива
        // затем вводит числа, которые помещаем в массив
        // затем выводим весь массив

        // обьявляем массив и переменную, все простые числа
        int[] a;
        int n;

        // создаем сканер и просим чтобы юзер ввел размерность массива
        Scanner sc = new Scanner(System.in);
        System.out.println("Пожалуйста, введите желаемое количество ячеек в массиве: ");
        n = sc.nextInt();
        a = new int[n];
        // в цикле записываем в массив значения, которые вводит юзер
        for(int i = 0; i < n; i++){
            System.out.println("Введите число, которое помести в ячейкц массива a["+i+"}:");
            a[i] = sc.nextInt();
        }

        // выводим полученный массив
        System.out.println("В массиве \"а\" из "+ a.length +" ячеек содержатся следующие числа:");
        for(int i = 0; i < a.length;i++){
            System.out.print(a[i]+ " ");
       }
    }
}
