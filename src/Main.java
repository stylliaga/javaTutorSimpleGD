public class Main {

    public static void main(String[] args) {
        Array a = new MyArray();
        System.out.println(((MyArray) a).Add(3));
        System.out.println(((MyArray) a).Add(23));
        System.out.println(((MyArray) a).Add(34));
        System.out.println(((MyArray) a).Add(7));
        System.out.println(((MyArray) a).Add(8));
        System.out.println(((MyArray) a).Get(3));


        System.out.println("");
        Array b = new Array_1();
        System.out.println(b.Add(3));
        System.out.println(b.Add(23));
        System.out.println(b.Add(34));
        System.out.println(b.Add(7));
        System.out.println(b.Get(2));

    }

}

