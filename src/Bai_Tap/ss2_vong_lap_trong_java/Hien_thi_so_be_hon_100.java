package Bai_Tap.ss2_vong_lap_trong_java;

public class Hien_thi_so_be_hon_100 {
    public static void main(String[] args) {
        for (int i = 2; i < 100; i++) {
            int j = 2;
            boolean isPrime = true;
            while(j < i) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
                j++;
            }
            if(isPrime) {
                System.out.print(i + " ");
            }
        }
    }
}
