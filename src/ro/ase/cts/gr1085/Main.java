package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        System.out.println("tastati o prop care cont lit mari si mici: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        try {
            text = br.readLine();
            //System.out.println(text);

            //daca toate lit st mici -> LowerCaseException
            //daca toate lit st mari -> UpperCaseException
            if(text.toUpperCase(Locale.ROOT).equals(text)){
                throw new UpperCaseException();
            }
            if(text.toLowerCase(Locale.ROOT).equals(text)){
                throw new LowerCaseException();
            }

        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
