package lesson_06;

public class Lab6_4 {

    public static void main(String[] args) {
        String url = "https://google.com";
        String str1 = url.substring(0, url.indexOf(":"));
        String str2 = url.substring(url.indexOf("//") + 2, url.indexOf("."));
        String str3 = url.substring(url.indexOf("."));
        if (str1.equals("https")) {
            System.out.println("is https");
        } else if (str1.equals("http")) {
            System.out.println("is http");
        } else {
            System.out.println("unKnown");
        }
        System.out.println(str2);
        if (str3.equals(".com")) {
            System.out.println("is .com");
        } else if (str3.equals(".net")) {
            System.out.println("is .net");
        } else {
            System.out.println("unKnown");
        }
    }
}