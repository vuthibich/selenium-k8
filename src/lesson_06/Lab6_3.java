package lesson_06;

public class Lab6_3 {

    public static void main(String[] args) {
        String myStr = "100 minutes";
        char[] myListChar = myStr.toCharArray();
        String outPut = "";
        for (int i = 0; i < myListChar.length; i++) {
            if (Character.isDigit(myListChar[i])) {
                outPut += myListChar[i]; // outPut = outPut + myStr.charAt(i)
            }
        }
        System.out.println(outPut);
    }
}
