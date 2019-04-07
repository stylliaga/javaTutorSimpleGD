import java.lang.String;
import java.util.Scanner;

public class Main {
    // полиморфизм
    // создаем несколько классов с переопределением метода, оторые наследую один класс с пустым методом
    public static void main(String[] args) {
        Shape[] arr = new Shape[]{ new Triangle(), new Circle(), new Square()};

        for(int i=0; i < arr.length; i++){
            arr[i].draw();
        }

    }

}

