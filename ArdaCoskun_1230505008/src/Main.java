public class Main {

    public static void main(String[] args) {
        //Veriler
        Durak[] Duraklar = {
                new Durak("Üniversite", new double[]{3.5, 8.2, 1.0, 9.9, 0.8}),
                new Durak("Belediye", new double[]{4.8, 6.6, 2.5, 5.6, 3.4}),
                new Durak("Otogar", new double[]{7.2, 1.0, 4.2, 4.5, 8.5})
        };

        // En uygun güzergahı bul
        Durak[] enUygunGuzergah = TopluTasimaPlanlama.enUygunGuzergah(Duraklar);

        // Sonucu yazdır
        System.out.println("\nEn uygun güzergah: ");
        for (Durak mahalle : enUygunGuzergah) {
            System.out.print(mahalle.getAd() + " -> ");
        }
    }
}