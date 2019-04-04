import java.lang.String;
import java.util.Scanner;

public class Main {
    // ООП
    // создали класс, генератор фраз
    public static void main(String[] args) {
        System.out.println("########### Простое определение через new Person() ##########");

        Person vitya = new Person();
        Person vasya = new Person();

        vasya.weight = 85;
        vasya.height = 177;
        System.out.println("Витя весит "+vitya.weight+" килограммов и у него рост - "+vitya.height+" см. " +
                            "А у Васи рост "+vasya.height+"см., вес "+vasya.weight+" килограммов.");

        System.out.println("");
        System.out.println("########### Попробуем то же самое но с массивом ##########");

        Person personName = new Person();

        //vasya.weight = 85;
        //vasya.height = 177;
        //System.out.println(personName.name[0]);
        System.out.println(personName.name[0]+" весит "+vitya.weight+" килограммов и у него рост - "+vitya.height+" см. " +
                "А у "+personName.name[1]+" рост "+vasya.height+"см., вес "+vasya.weight+" килограммов.");

        vasya.talk(personName.name[0],"Я бы с удовольствием сейчас поспал. Нихрена не высыпаюсь!", "сказал");
        vitya.talk(personName.name[1],"Ты чего, думаешь один тут такой?", "тут же спросил его с вызовом");
        personName.talk(personName.name[2],"Чуваки, а может по пиву?", "флегматично предложил");

        System.out.println("");
        System.out.println("########### Попробуем то же самое но через конструктор ##########");

        // описываем толика
        Person tolya = new Person("Толик","Вы знаете, а я бы коньячку тяпнул!",
                    "воскликнул", 170, 97);
        // описываем танечку
        Person tanya = new Person("Таня","Пошел бы лучше в Java попркатиковался!","с издевкой сказала",165,51);

        // описываем серегу
        Person serega= new Person("Серега","Тань, отвали... Пятница почти наступила и посему можно что нибудь употребить ;)",
                "возразил",187 ,100);

        // подключаем генератор
        personName.talk(tolya.persName,tolya.persPhrase,tolya.persTypeOfPhrase);
        personName.talk(tanya.persName,tanya.persPhrase,tanya.persTypeOfPhrase);
        personName.talk(serega.persName,serega.persPhrase,serega.persTypeOfPhrase);

    }
}

