import java.lang.String;


public class Main {
    public static void main(String[] args){
        // byte typ  - from -128 to 127
        // try it
        byte byt = -128;
        System.out.println("Byte - "+ byt);

        // int - from -2^31-1 to 2^31
        int nt = 999999999;
        System.out.println("Int - " + nt);

        // lng это -2в63
        // при этом в 32 битной системе длина равно int
        // а в 64 битной принимает уже 64
        long lng = 1000000001;
        System.out.println("Long - " + lng);

        //важные моменты в работе с double и float
        // при написании, после присвоенных значений добавлять соответствующие буквы.
        float flt = 12.33f;
        double dbl = 234.45645234d;

        // типы дныых "ложь - истина"
        boolean bln = true;
        boolean bln2 = false;

        // строковые переменные
        // для работы с ними необходимо подключить дополнительную библиотеку
        // import java.lang.String и писать седует с ДВОЙНЫМИ КОВЫЧКАМИ
        String str = "Что по поводу строковых переменных, то здесь можно вводить, в принципе, любое количество символов";
        System.out.println("Переменная str - " + str);

        // переменная содержащая один символ инициализируется С ОДИНОЧНЫМИ КОВЫЧКАМИ - так
        char chr = 'w';
        System.out.println("Выводим переменную char - " + chr);


    }
}
