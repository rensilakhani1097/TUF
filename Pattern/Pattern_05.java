package Pattern;

import java.util.Scanner;

public class Pattern_05 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int x = sc.nextInt();
            nTriangle(x);
        }
    }
    public static void nTriangle(int n) {
        int p =0;
        for(int i = 1; i<= n; i++)
        {

            for(int j =1 ;j<=i;j++)
            {
                ++p;
                System.out.print(p + " ");
            }
            System.out.println();
        }
    }
}
