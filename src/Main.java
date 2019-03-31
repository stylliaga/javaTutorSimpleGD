import java.lang.String;
import  java.util.Scanner;
import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;

public class Main {
    public static void main(String[] args){
        // FOR - циклы
        // DO.WHILE
        // уменьшение на 1
       /* for(int i = 100; i > 10; i--){
            System.out.println(i);
        }
       // уменьшение на 10
        for (int i = 100; i >= 10; i -=10){
            System.out.println(i);
        }
        // увеличение на 20
        for(int i = 0; i  <=  100; i += 20 ){
            System.out.println(i);
        }*/
       // DO-WHILE  - циклы
        boolean bol = true;
        int nt      = 5;
        do{
            System.out.println(nt);
            nt ++;
            if(nt >= 15){
                bol = false;
            }

        }while(bol == true);
    }
}
