import java.util.*;
public class CiftSayi{
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k;
        System.out.print("Bir Sayi Giriniz:");
        k=in.nextInt();
        System.out.println("1'den "+k+"'a/e/ye "+"kadar olan cift sayilar:");
        for(int i=1;i<=k;i++){

            if(i%2==1)
            continue;
            else
                System.out.println(i);
        }

    }
}