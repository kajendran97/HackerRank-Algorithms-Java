package Warmup;

import java.util.Scanner;

/**
 * Created by Suwadith on 2/17/2017.
 */
public class Solve_Me_First {

    static int solveMeFirst(int a, int b) {
        return a+b;
    }


    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int a;
        a = in.nextInt();
        int b;
        b = in.nextInt();
        int sum;
        sum = solveMeFirst(a, b);
        System.out.println(sum);
    }

}
