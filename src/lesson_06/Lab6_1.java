package lesson_06;

public class Lab6_1 {
    public static void main(String[] args) {
        int hrs=0;
        int minutes=0;
        String input="2hrs and 5 minutes";
        String[]lst= input.split("and");
                for(int i=0; i< lst.length;i++){
                    if(lst[i].contains("hrs")){
                        hrs = Integer.parseInt(lst[i].replaceAll("[^0-9]", ""));
                    }
                    if (lst[i].contains("minutes")){
                        minutes=Integer.parseInt(lst[i].replaceAll("[^0-9]", ""));// ép kiểu
                    }
                }
        System.out.println("total: " + (hrs * 60 + minutes));
    }
}
