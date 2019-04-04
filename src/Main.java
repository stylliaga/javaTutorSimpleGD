import java.lang.String;
import java.util.Scanner;

public class Main {
    // ООП
    // напишем простые функции сложения,вычитания,умножения,деленния, возведения в степень
    public static void main(String[] args) {
        Person vitya = new Person();
        Person vasya = new Person();

        vasya.weight = 85;
        vasya.height = 177;
        System.out.println("Витя весит "+vitya.weight+" килограммов и у него рост - "+vitya.height+" см. " +
                            "А у Васи рост "+vasya.height+"см., вес "+vasya.weight+" килограммов.");

        // попробуем то же самое но с массивом
        Person personName = new Person();

        //vasya.weight = 85;
        //vasya.height = 177;
        //System.out.println(personName.name[0]);
        System.out.println(personName.name[0]+" весит "+vitya.weight+" килограммов и у него рост - "+vitya.height+" см. " +
                "А у "+personName.name[1]+" рост "+vasya.height+"см., вес "+vasya.weight+" килограммов.");

        vasya.talk(personName.name[0],"Я бы с удовольствием сейчас поспал. Нихрена не высыпаюсь!", "сказал");
        vitya.talk(personName.name[1],"Ты чего, думаешь один тут такой?", "тут же спросил его с вызовом");
        personName.talk(personName.name[2],"Чуваки, а может по пиву?", "флегматично предложил");


    }
}

