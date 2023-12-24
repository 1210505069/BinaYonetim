import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

// Bina sınıfı, Konut sınıfından türetilmiştir ve bina özelliklerini temsil eder.
public class Bina extends Konut {
    private int katSayısı; // Bina kat sayısı
    private List<Daire> daireListesi; // Bina içindeki dairelerin listesi

    // Bina sınıfının yapıcı metodu
    public Bina(String ad, int katlar) {
        super(ad);
        this.katSayısı = katlar;
        daireListesi = new ArrayList<>();
    }

    // Bina ve içindeki dairelerin bilgilerini gösteren metod
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Kat Sayısı: " + katSayısı);
        for (Daire daire : daireListesi) {
            daire.bilgileriGöster();
        }
    }

    // Bina içine yeni daire eklemek için metod
    public void daireEkle(Daire daire) {
        daireListesi.add(daire);
    }

    // Daireleri daire numarasına göre sıralayan metod
    public void daireleriSırala() {
        Collections.sort(daireListesi, Comparator.comparingInt(Daire::getDaireNumarası));
    }
}
