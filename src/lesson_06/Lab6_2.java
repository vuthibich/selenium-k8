import java.util.Scanner;

public class Lab6_2 {
    public static void main(String[] args) {
        String myPassword = "password123";
        int t = 3;
        Scanner sc = new Scanner(System.in);
        System.out.println("Plead Enter Password");
        while (t-- > 0) {
            String pass = sc.nextLine();
            if (pass.trim().equals(myPassword)) {
                System.out.println("Password Correct!");
                t = 0;
                break;
            } else if (t == 0) {
                System.out.println("you have entered more than the allowed number of times!");
                break;
            }
            System.out.println("Password not correct. Plead enter again !");
        }

    }
}
