import java.util.*;
public class DonguOdevi {
    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int k,toplam=0,indis=0;
        System.out.print("Bir Sayi Giriniz:");
        k=in.nextInt();
        System.out.println("0'dan "+k+"'a/e/ye "+"kadar olan 3 ve 4'e bolunun sayilarin ortalamasi:");
        for(int i=0;i<=k;i++){

            if(i%3==0&&i%4==0)
            {
                toplam+=i;
                ++indis;
            }
        }
        System.out.print(toplam/indis);
    }
}