import  java.util.Scanner;

public class main {
    public static void main(String[] args) {

        // Degisken tanittim

        int mat, fizik, kimya, turkce, tarih, muzik;

        // kullancidan input al

        Scanner in = new Scanner(System.in);

        System.out.print("Matemetik notu giriniz : ");
        mat = in.nextInt();

        System.out.println("Fizik notu giriniz :");
        fizik = in.nextInt();

        System.out.println("Kimya notu giriniz: ");
        kimya = in.nextInt();

        System.out.println("Türkçe notu giriniz: ");
        turkce = in.nextInt();

        System.out.println("Tarih notu giriniz: ");
        tarih = in.nextInt();

        System.out.println("Müzik notu giriniz: ");
        muzik = in.nextInt();

        int total = ( mat + fizik + kimya + turkce + tarih + muzik );
        double result = total / 6.0;
        System.out.println("Not ortalamanız: " + result);
        System.out.println(result >= 60 ? "Tebrikler! Sınıfı başarıyla tamamladınız." : "Sınıfta kaldınız!");


    }
}
