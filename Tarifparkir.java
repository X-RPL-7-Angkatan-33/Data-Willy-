import java.util.Scanner;

public class Tarifparkir {
public static void main(String[] args) {
    String platNomor;
    int jumlahjam;
    double harga;
    
    Scanner s = new Scanner(System.in);
    System.out.println("Masukan Nomor Plat: ");
    platNomor = s.nextLine();
    System.out.println("Jumlah jam");
    jumlahjam = s.nextInt();

    if (jumlahjam >0 && jumlahjam <=1) {
        harga=3000;
    }else if (jumlahjam >1 && jumlahjam<=4) {
        harga=7000;
    }else if (jumlahjam > 4) {
        harga = 0; 
    }else {
        harga = 0;
        System.out.println("ERORR BODOHHHH");
    }
    System.out.println(platNomor);
    System.out.println("Tarif Parkir "+harga);   
   }
}
