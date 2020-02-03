package homework;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class StringPractice {
    public static void main(String[] args) {
        String str = "Первый символ строки";
        System.out.println(str.length());
        System.out.println("Первый символ строки: "+str.charAt(0));
        String [] strArray= str.split(" " );
        for(int i=0; i < strArray.length; i++){
            System.out.println(i+":"+strArray[i]);
            BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
            try {
                in.readLine();
            } catch (IOException e){
                e.printStackTrace();
            }
            System.out.println(in);

        }



    }
}
