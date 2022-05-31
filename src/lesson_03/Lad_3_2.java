package lesson_03;

public class Lad_3_2 {
    public static void main(String[] args) {
        int number[]=new int[]{1,2,3,4,5};
        int min=number[0];
        int max=number[0];
        for (int i = 0; i < number.length; i++) {
            if (number[i]<min){
                min=number[i];
            }
            if (number[i]>max){
                max=number[i];
            }

        }
        System.out.println("Gia tri nho nhat la " + min);
        System.out.println("Gia tri lon nhat la " + max);
    }
}
