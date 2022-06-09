package lesson_04;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Lab_04 {
    public static void main(String[] args) {
        int t;
        List<Integer> intArray=new ArrayList<>();
        while (true) {
            Scanner sc = new Scanner(System.in);
            System.out.println("-----Menu----");
            System.out.println("1. ADD number into Arraylist");
            System.out.println("2. Print numbers");
            System.out.println("3. Get maximun number");
            System.out.println("4. Get minimun number");
            System.out.println("Enter Choice");
            t = sc.nextInt(); // lua chon
            switch (t) {
                case 1:
                    System.out.println("Enter cout list");
                    int count = sc.nextInt(); //nhập từ bàn phím
                    for (int i = 0; i < count; i++) {
                        int x = sc.nextInt();
                        intArray.add(x);
                    }
                    break;
                case 2:
                    if (intArray.size() > 0) {
                        for(int i = 0; i < intArray.size(); i++) {
                            System.out.print(intArray.get(i) + " ");
                        }
                        System.out.println();
                        break;
                    }

                case 3:
                    if (intArray.size() > 0) {
                        int max = intArray.get(0);
                        for(int i = 0; i < intArray.size(); i++) {
                            if (intArray.get(i) > max) {
                                max = intArray.get(i);
                            }
                        }
                        System.out.println("number max: "+max);
                        System.out.println();
                        break;
                    }

                case 4:
                    if (intArray.size() > 0) {
                        int min = intArray.get(0);
                        for (int i = 0; i < intArray.size(); i++) {
                            if (intArray.get(i) < min) {
                                min = intArray.get(i);
                            }
                        }
                        System.out.println("Number min: "+min);
                        System.out.println();
                        break;
                    }
            }
        }

    }

}
