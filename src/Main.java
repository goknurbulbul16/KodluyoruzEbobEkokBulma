import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.print("m1 sayısını giriniz: ");
        int m1 = input.nextInt();

        System.out.print("m2 sayısını giriniz: ");
        int m2 = input.nextInt();
        int ebob = 1;

        if (m1 < m2){
            for (int i =1; i <= m1; i++ ){
                if (m1 % i == 0 && m2 % i == 0){
                    ebob = i;
                }
            }
        }
        System.out.println("Sayıların EBOB 'u" + ebob);

        for (int k =1; k >= m1; k-- ){
            if (m1 % k == 0 && m2 % k == 0){
                ebob = k;
                System.out.println(ebob);
                break;
            }
        }


    }
}