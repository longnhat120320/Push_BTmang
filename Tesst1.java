package baitap1;

public class Tesst1 {
    public static void main(String[] args) {
        int num = 789;
        int i = 0;
        int n =0;
        while (num >0) {
            i = num % 10;
            n = n * 10 + i;
            num = num / 10;
        }
        System.out.println(n);
    }
}
