/* Alfarel Abhipraya - 245150707111041

   ###    ##       ########    ###    ########  ######## ##       
  ## ##   ##       ##         ## ##   ##     ## ##       ##       
 ##   ##  ##       ##        ##   ##  ##     ## ##       ##       
##     ## ##       ######   ##     ## ########  ######   ##       
######### ##       ##       ######### ##   ##   ##       ##       
##     ## ##       ##       ##     ## ##    ##  ##       ##       
##     ## ######## ##       ##     ## ##     ## ######## ######## 

*/

package utp.mains;
import java.util.Scanner;
import utp.shapes.*;

public class main {
    static String BLUE = "\u001B[94m";
    static String WHITE = "\u001B[0m";     
    static String YELLOW = "\u001B[33m";
    static String GREEN = "\u001B[32m";

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println(WHITE + "=============================================");
        System.out.println("Kalkulator Bangun Ruang");
        System.out.print("NAMA LENGKAP: ");
        String namaLengkap = input.nextLine();
        System.out.print("NIM: ");
        long nim = input.nextLong();
        System.out.println("=============================================");

        // Prisma Segitiga Sama Kaki
        PrismaSegitigaSamaKaki prisma = new PrismaSegitigaSamaKaki(10, 13, 12);
        System.out.println(BLUE + prisma.getNama());
        System.out.println("=============================================");
        System.out.print("Isikan alas     : ");
        double alas = input.nextDouble();
        System.out.print("Isikan kaki     : ");
        double kaki = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiPrisma = input.nextDouble();
        System.out.println("=============================================");
        prisma.printInfo();

        // Limas 
        LimasPersegi limas = new LimasPersegi(10, 12);
        System.out.println(YELLOW + "=============================================");
        System.out.println(limas.getNama());
        System.out.println("=============================================");
        System.out.print("Isikan sisi     : ");
        double sisi = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiLimas = input.nextDouble();
        System.out.println("=============================================");
        limas.printInfo();

        // Tabung
        Tabung tabung = new Tabung();
        System.out.println(GREEN + "=============================================");
        System.out.println(tabung.getNama());
        System.out.println("=============================================");
        System.out.print("Isikan radius   : ");
        double radius = input.nextDouble();
        System.out.print("Isikan tinggi   : ");
        double tinggiTabung = input.nextDouble();
        System.out.println("=============================================");
        tabung.setRadius(radius);
        tabung.setTinggi(tinggiTabung);
        tabung.printInfo();
        System.out.println("=============================================");
    }
}