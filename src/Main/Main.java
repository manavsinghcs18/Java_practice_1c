package Main;

import java.util.Scanner;

/**
 * @author ManavSingh
 * @version 1.0*/

public class Main
{
    public static void main(String[] args)
    {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the values of a and b");
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        int c;
        int d;
        int e;
        int f;
        int g;
        c=a+b;
        System.out.println(" a + b = " +c);
        d=a-b;
        System.out.println(" a - b = " +d);
        e=a*b;
        System.out.println(" a * b = " +e);
        f=a/b;
        System.out.println(" a / b = " +f);
        g=a%b;
        System.out.println(" a % b = " +g);
    }
}
