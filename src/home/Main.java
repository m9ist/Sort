package home;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<String> res = new ArrayList<String>();
        while (sc.hasNextLine())
        {
            String s = sc.nextLine();
            res.add(s);
        }

        Collections.sort(res);

        for (String i : res)
        {
            System.out.println(i);
        }
    }
}
