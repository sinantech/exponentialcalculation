import java.util.Scanner;

public class UsluSayilarWhileLoops {
    public static void main(String[] args) {
        int taban, kuvvet;
        int sonuc = 1;
        Scanner inp = new Scanner(System.in);
        System.out.print("Taban : ");
        taban = inp.nextInt();
        System.out.print("Us : ");
        kuvvet = inp.nextInt();

        int i = 1;
        while (i<=kuvvet){
            sonuc *= taban;
            i++;
        }
        System.out.println("Sonuc : " + sonuc);

    }
}
