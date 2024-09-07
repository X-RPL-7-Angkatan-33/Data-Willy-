import java.util.Scanner;

public class SeleksiPrakerin {
    public static void main(String[] args) {
        String nama,kelas,perilaku;
        int nilai;

        Scanner s = new Scanner(System.in);
        System.out.println("Jenengmu: ");
        nama = s.nextLine();
        System.out.println("Kelasmu ngendi? (X/XI/XX)");
        kelas = s.next();

        if (kelas.equalsIgnoreCase("XII")) {
            System.out.println("Perilakumu (APIK/ELEK)");
            perilaku = s.next();
        if (perilaku.equalsIgnoreCase("APIK")) {
            System.out.println("NILAI SISWA: ");
            nilai = s.nextInt();
            if (nilai >=85) {
                System.out.println(nama+ "HAHAHA KAMU PRAKERINN");   
            }else{
                System.out.println("NILAI LU KECIL BAT GOBLOK ");
            } 
        } else{
            System.out.println("KALO PERILAKU LU JELEK YA GAGAL DONGO");
        }     
     } else{
        System.out.println("KAN INI BUKAN KELASLU");
     }


    }
}
