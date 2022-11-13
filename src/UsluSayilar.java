import java.util.Scanner;

public class UsluSayilar {
    public static void main(String[] args) {
        int taban, kuvvet;
        int sonuc = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban : ");
        taban = inp.nextInt();
        System.out.print("Us : ");
        kuvvet = inp.nextInt();

        for (int i = 1; i <= kuvvet; i++) {
            sonuc *= taban;
        }
        System.out.println("Sonuc : " + sonuc);
    }
}
