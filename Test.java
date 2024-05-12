package baitap1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Test {
    //Tìm số lớn nhất và số lớn nhất thứ 2 của mảng
    public static void main(String[] args) {
        int[] mang1 = {10,100,-101,-101,-70,-90,-30};
        int max=mang1[0];
        int max2=mang1[0];
        for (int i = 0; i < mang1.length ; i++) {
            if (mang1[i]>max){
                max2 = max;
                max=mang1[i];
            } else if (max == max2){
                if(i == mang1.length-1){
                    max2 = mang1[i-1];

                }else {
                    max2 = mang1[i+1];
                }
            }
            else if(mang1[i] < max && mang1[i] >max2){
                max2 = mang1[i];
            }

        }

        System.out.println(" Giá trị lớn nhất: " + max);
        System.out.println(" Giá trị lớn nhất thứ 2: "+ max2 );
    }
}
