
package lesson_07_1;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;


public class Lab7_1 {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Employee empContract = new EmpContract();
        Employee empFullTime = new EmpFullTime();
        List<Employee> list = new ArrayList<Employee>();
        
        System.out.println("Nhập số nhân viên hợp đồng");
        int countContract = sc.nextInt();
        System.out.println("Nhập số nhân viên toàn thời gian");
        int countFullTime = sc.nextInt();
        for (int i = 0; i < countContract; i++) {
            list.add(empContract);
        }
        for (int i = 0; i < countFullTime; i++) {
            list.add(empFullTime);
        }
        float total = TotalSalary(list);
        System.out.println("Total Salary: " + total);
        
    }
    public static float TotalSalary(List<Employee> list){
        float total = 0;
        if(list.size() > 0){
            for (int i = 0; i < list.size(); i++) {
                total += list.get(i).getSalary();
            }
        }
        return total;
    }
}
