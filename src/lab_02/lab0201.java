package lab_02;
import java.util.Scanner;
public class lab0201 {
    public static void main(String[] args) {
        double height, weight, BMI;
        Scanner scanner =new Scanner(System.in);

        System.out.println("Pls input height");
        height= scanner.nextDouble();
        System.out.println("Pls input weight");
        weight= scanner.nextDouble();
        //tinh BMI
        BMI= weight / (height * 2);
        System.out.println(BMI+"" );

        if (BMI<18.5){
            System.out.println("Underweight");
        } else if (BMI<=24.9) {
            System.out.println("Normal weight");
        } else if (BMI<=29.9) {
            System.out.println("Overweight");
        } else{
            System.out.println("Obesity");
        }
    }

}
