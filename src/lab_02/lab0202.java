package lab_02;

import java.util.Scanner;

public class lab0202 {
    public static void main(String[] args) {
        int n;
        Scanner scanner = new Scanner(System.in);
        System.out.println("input n:");
        n = scanner.nextInt();
        if(n%2==0){
            System.out.println( "n la so chan");
        } else {
            System.out.println( "n la so le");
        }
    }
}
