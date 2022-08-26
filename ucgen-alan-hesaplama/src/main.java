import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        Scanner girdi = new Scanner(System.in);

        System.out.println("Kenarin uzunlugu: ");
        int a=girdi.nextInt();

        System.out.println("diger kenarin uzunlugu: ");
        int b=girdi.nextInt();

        System.out.println("hipotunus uzunlugu: ");
        int c=girdi.nextInt();

        int cevre= a+b+c;
        int u=cevre/2;
        int alan_karesi=u*(u-a)*(u-b)*(u-c);

        double alan=Math.sqrt(alan_karesi);
        System.out.println(alan_karesi);
        System.out.println("Alan: " +alan);



    }
}
