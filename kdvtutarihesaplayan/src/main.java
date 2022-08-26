import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        double tutar,kdvOran = 0.18, kdvTutar, kdvliTutar;
        Scanner in = new Scanner(System.in);
        System.out.print("Ücret tutarıni giriniz : ");
        tutar = in.nextDouble();

        kdvTutar = tutar * kdvOran;
        kdvliTutar = tutar + kdvTutar;

        kdvOran = (tutar <= 1000)? 0.18 : 0.08;

        System.out.println("KDV'siz tutar : " + tutar);
        System.out.println("KDV Orani :" + kdvOran);
        System.out.println("KDV tutari :" + kdvTutar);
        System.out.println("KDV'li tutar :" + kdvliTutar);

    }
}
