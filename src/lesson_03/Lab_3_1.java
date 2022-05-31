
package lesson_03;

import java.util.Scanner;

public class Lab_3_1 {
    public static void main(String [] args){

        int soLuongNguyenLe = 0;
        int soLuongNguyenChan = 0;
        int arrayLenhth = 5;
        int[] myInArray = new int[arrayLenhth];

        myInArray[0]=1;
        myInArray[1]=2;
        myInArray[2]=3;
        myInArray[3]=4;
        myInArray[4]=5;

        for (int i = 0; i < myInArray.length; i++){
            if(myInArray[i]%2==0){
                soLuongNguyenChan ++;
            } else {
                soLuongNguyenLe ++;
            }
        }
        System.out.println("Số lượng số nguyên chẵn trong mảng = " + soLuongNguyenChan);
        System.out.println("Số lượng số nguyên lẻ trong mảng = " + soLuongNguyenLe);
    }
        }



