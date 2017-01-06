package oguz.tutorials.collections;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Arrays;
import java.util.Scanner;

public class Main {


    Scanner scanner = new Scanner (System.in);

    int B = scanner.nextInt();
    int H = scanner.nextInt();
    boolean flag = false;

    /*if (B <=0 || H <= 0) {
        throw new Exception("Breadth and height must be positive");
    } else {
        flag = true;
        //System.out.println(B*H);
    }*/

    public static void main(String[] args) throws IOException {
        System.out.println("Hello World!");

        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));

        //InputStreamReader inputStreamReader = new InputStreamReader(new );

        String a = bufferedReader.readLine();
        String b = bufferedReader.readLine();
        String c = bufferedReader.readLine();

        System.out.println(a);
        System.out.println(b);
        System.out.println(c);

        //String s1 = "uiea";

        //Exception

        //Short.MAX_VALUE;
        //Long


        //System.out.printf(s1, []);

        //inputStreamReader.read();

        //Scanner scanner = new Scanner(System.in);

        //System.out.printf()


        char[] sA = a.toLowerCase().toCharArray();
        char[] sB = b.toLowerCase().toCharArray();

        Arrays.sort(sA);
        Arrays.sort(sB);



        String sortedA = new String(sA);
        String sortedB = new String(sB);

        //sortedA.split()

        if (sortedA.equalsIgnoreCase(sortedB)) {
            //return true;
        } else {
            //return false;
        }


        /*
        System.out.println(sA.toString());
        System.out.println(sB.toString());

        String sortedA1 = sA.toString();
        String sortedB1 = sB.toString();
        System.out.println(sortedA1);
        System.out.println(sortedB1);
        */




    }



}
