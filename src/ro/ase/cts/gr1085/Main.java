package ro.ase.cts.gr1085;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class Main {
    public static void main(String[] args) {
        System.out.println("tastati cv: ");
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String text = null;
        try {
            text = br.readLine();
            System.out.println(text);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

    }
}
