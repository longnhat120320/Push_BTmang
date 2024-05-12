package baitap1;

import java.sql.SQLOutput;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class BaiTap1 {
    /*Viết chương trinh nhập vào 1 danh sách list sau đó
     1. Tạo ra 1 list mới bình phương các phần tử
    2. Xác định bao nhiêu phần tử lớn hơn 50
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println(" Mời nhập vào số phẩn tử của list: ");
        int  n = sc.nextInt();
        //cho nguoi dung nhap tung phan tu
        ArrayList<Integer> list = new ArrayList<>();
        for (int i = 0; i < n; i++) {
            System.out.println(" Mời nhập vào phần tử thứ " + (i + 1));
            int soNhap = sc.nextInt();
            list.add(soNhap);
        }
        System.out.println(list);
        // binh phuong cac phan tu cua mang moi
        ArrayList<Integer> binhPhuong = new ArrayList<>();
        for(int x : list){
            binhPhuong.add(x*x);

        }
        System.out.println("Danh sach moi la");
        System.out.println(binhPhuong);

        // Xác định bao nhiêu phần tử lớn hơn 50
        int count = 0;
        for(int y : binhPhuong){
            if(y > 50){
                count++;
            }

        }
        System.out.println("số phần tử lớn hơn 50 là:"+ count);

        // tim so lon thu
        int max = binhPhuong.get(0);
        int max1 =binhPhuong.get(0);
        for (int i = 0; i < binhPhuong.size(); i++) {
            if(binhPhuong.get(i) > max){
                max1 = max;
                max = binhPhuong.get(i);
                // khoo
            } else if (max1<max && binhPhuong.get(i) >max1) {
                max1 = binhPhuong.get(i);
            }
//            }

        }
        System.out.println("Số lớn nhất: " + max);
        System.out.println("Số lớn thứ 2: " + max1);


    }
}
