package lesson_04;

import java.util.Scanner;

public class Switchcase {
    public static void main(String[] args) {
        int t;
        int[] list = null;
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----Menu----");
            System.out.println("1. ADD number into Arraylist");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximun number");
            System.out.println("4. Get minimun number");
            System.out.println("Enter Choice");
            t = sc.nextInt();
            switch (t) {
                case 1:
                    System.out.println("Enter cout list");
                    int count = sc.nextInt();
                    list = new int[count];
                    for (int i = 0; i < count; i++) {
                        int x = sc.nextInt();
                        list[i] = x;
                    }
                    break;
                case 2:
                    if (list != null) {
                        for(int i = 0; i < list.length; i++) {
                            System.out.print(list[i] + " ");
                        }
                        System.out.println();
                        break;
                    }

                case 3:
                    if (list != null) {
                        int max = list[0];
                        for(int i = 0; i < list.length; i++) {
                            if (list[i] > max) {
                                max = list[i];
                            }
                        }
                        System.out.println(max);
                        System.out.println();
                        break;
                    }

                case 4:
                    if (list != null) {
                        int min = list[0];
                        for (int i = 0; i < list.length; i++) {
                            if (list[i] < min) {
                                min = list[i];
                            }
                        }
                        System.out.println(min);
                        System.out.println();
                        break;
                    }
            }
        }

    }

}
