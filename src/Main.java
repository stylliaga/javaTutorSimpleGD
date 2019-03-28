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
        
    }
}
