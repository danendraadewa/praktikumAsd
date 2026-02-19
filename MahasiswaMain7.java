public class MahasiswaMain7 {
    public static void main(String[] args) {

        String nama;

        Mahasiswa7 mhs1 = new Mahasiswa7();
        mhs1.nama = "Muhammad Ali Farhan";
        mhs1.nim = "2241720171";
        mhs1.kelas = "SI 2J";
        mhs1.ipk = 3.55;

        mhs1.tampilkanInformasi();
        mhs1.ubahKelas("SI 2K");
        mhs1.updateIPK(3.60);
        mhs1.tampilkanInformasi();

        Mahasiswa7 mhs2 = new Mahasiswa7("Annisa Nabila", "2141720160",3.25, "TI 2L");
        mhs2.updateIPK(3.30);
        mhs2.tampilkanInformasi();

        Mahasiswa7 mhsDewa = new Mahasiswa7("Danendra Dewa", "254107020114", 3.7, "TI 1D");
        mhsDewa.tampilkanInformasi();
    }
    
}
