public class praktikumFungsi {

    static int hargaAglonema = 75000;
    static int hargaKeladi   = 50000;
    static int hargaAlocasia = 60000;
    static int hargaMawar    = 10000;

    public static int hitungPendapatan(int aglonema, int keladi, int alocasia, int mawar) {
        return (aglonema * hargaAglonema) +
               (keladi * hargaKeladi) +
               (alocasia * hargaAlocasia) +
               (mawar * hargaMawar);
    }

    public static String statusCabang(int pendapatan) {
        if (pendapatan > 1500000) {
            return "Sangat Baik";
        } else {
            return "Perlu Evaluasi";
        }
    }

    public static void main(String[] args) {

        int[][] stok = {
            {10, 5, 15, 7},   // RoyalGarden 1
            {6, 11, 9, 12},   // RoyalGarden 2
            {2, 10, 10, 5},   // RoyalGarden 3
            {5, 7, 12, 9}     // RoyalGarden 4
        };

        String[] cabang = {
            "RoyalGarden 1",
            "RoyalGarden 2",
            "RoyalGarden 3",
            "RoyalGarden 4"
        };

        for (int i = 0; i < stok.length; i++) {
            int pendapatan = hitungPendapatan(
                stok[i][0],
                stok[i][1],
                stok[i][2],
                stok[i][3]
            );

            System.out.println(cabang[i]);
            System.out.println("Pendapatan : Rp" + pendapatan);
            System.out.println("Status     : " + statusCabang(pendapatan));
            System.out.println();
        }
    }
}
