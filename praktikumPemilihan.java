import java.util.Scanner;
public class praktikumPemilihan {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Program Menghitung Nilai Akhir");

        System.out.println("====================");

        System.out.print("Masukkan Nilai Tugas: ");
        double tugas = sc.nextDouble();
        System.out.print("Masukkan Nilai Kuis: ");
        double kuis = sc.nextDouble();
        System.out.print("Masukkan Nilai UTS: ");
        double uts = sc.nextDouble();
        System.out.print("Masukkan Nilai UAS: ");
        double uas = sc.nextDouble();

        System.out.println("====================");
        System.out.println("====================");

        if ((tugas < 0 || tugas > 100) || (kuis < 0 || kuis > 100) || (uts < 0 || uts > 100) || (uas < 0 || uas > 100)) {
            System.out.println("Nilai tidak valid");
            return;
        }
        
        double nilaiAkhir = (0.2 * tugas) + (0.2 * kuis) + (0.3 * uts) + (0.3 * uas);
        System.out.println("Nilai Akhir: " + nilaiAkhir);

        String status;

        if (nilaiAkhir >= 81 && nilaiAkhir <= 100) {
            System.out.println("Nilai Huruf: A");
            status = "Selamat Anda Lulus";
        } else if (nilaiAkhir >= 73 && nilaiAkhir <= 80) {
            System.out.println("Nilai Huruf: B+");
            status = "Selamat Anda Lulus";
        } else if (nilaiAkhir >= 66 && nilaiAkhir <= 73) {
            System.out.println("Nilai Huruf: B");
            status = "Selamat Anda Lulus";
        } else if (nilaiAkhir >= 61 && nilaiAkhir <= 65) {
            System.out.println("Nilai Huruf: C+");
            status = "Selamat Anda Lulus";
        } else if (nilaiAkhir >= 51 && nilaiAkhir <= 60) {
            System.out.println("Nilai Huruf: C");
            status = "Selamat Anda Lulus";
        } else if (nilaiAkhir >= 40 && nilaiAkhir <= 50) {
            System.out.println("Nilai Huruf: D");
            status = "Tidak Lulus";
        } else {
            System.out.println("Nilai Huruf: E");
            status = "Tidak Lulus";
        }

        System.out.println("====================");
        System.out.println("====================");

        System.out.println(status);

    }
    
}
