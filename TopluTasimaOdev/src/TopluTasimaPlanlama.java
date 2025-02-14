import java.util.Arrays;

public class TopluTasimaPlanlama {

    // Softmax fonksiyonu
    public static double[] softmax(double[] scores) {
        double max = Arrays.stream(scores).max().getAsDouble();
        double sum = 0.0;

        // Exp hesapla
        for (int i = 0; i < scores.length; i++) {
            sum += Math.exp(scores[i] - max);
        }

        // Softmax değerlerini hesapla
        double[] softmaxScores = new double[scores.length];
        for (int i = 0; i < scores.length; i++) {
            softmaxScores[i] = Math.exp(scores[i] - max) / sum;
        }

        return softmaxScores;
    }

    // En uygun güzergahı hesapla
    public static Durak[] enUygunGuzergah(Durak[] duraklar) {
        double[] Puanlar = new double[duraklar.length];

        // Verilerin ağırlıkları
        double[] kriterAgirliklari = { 0.23, 0.15, 0.05, 0.3, 0.27 };

        // Her durak için Softmax uygulanarak puanları hesapla
        for (int i = 0; i < duraklar.length; i++) {
            double puan = 0.0;
            for (int j = 0; j < duraklar[i].getVeriler().length; j++) {
                puan += duraklar[i].getVeriler()[j] * kriterAgirliklari[j];
            }
            Puanlar[i] = puan;
        }

        // Softmax hesapla
        double[] softmaxPuanları = softmax(Puanlar);

        // Durakları softmax puanlarına göre sırala
        for (int i = 0; i < softmaxPuanları.length; i++) {
            for (int j = i + 1; j < softmaxPuanları.length; j++) {
                if (softmaxPuanları[i] < softmaxPuanları[j]) {

                    double bos = softmaxPuanları[i];
                    softmaxPuanları[i] = softmaxPuanları[j];
                    softmaxPuanları[j] = bos;


                    Durak bos2 = duraklar[i];
                    duraklar[i] = duraklar[j];
                    duraklar[j] = bos2;
                }
            }
        }

        // Sıralanmış durakları yazdır
        for (int i = 0; i < duraklar.length; i++) {
            System.out.println(duraklar[i].getAd() + ":" + softmaxPuanları[i]);
        }


        return duraklar;  // Sıralı mahalle dizisini döndürüyoruz
    }
}
