public class Person {
    public int height = 180;
    public int weight = 70;
    public String[] name = {"Витя","Вася","Петя"};


    public void talk(String personName, String saySomeThing, String kindOfSaing){
        System.out.println(" - "+saySomeThing+". - "+kindOfSaing+" "+personName+".");
    }

    public Person(){}

    String persName;
    String persPhrase;
    String persTypeOfPhrase;
    int persHeight;
    int persWeight;
    public Person(String name, String phrase, String typeOfPhrase, int height, int weight){
        persName            = name;
        persPhrase          = phrase;
        persTypeOfPhrase    = typeOfPhrase;
        persHeight          = height;
        persWeight          = weight;
    }
}
