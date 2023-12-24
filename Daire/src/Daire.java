// Daire sınıfı, Konut sınıfından türetilmiştir ve daire özelliklerini temsil eder.
public class Daire extends Konut {
    private int daireNumarası; // Daire numarası
    private int katNumarası; // Dairenin bulunduğu kat numarası

    // Daire sınıfının yapıcı metodu
    public Daire(String ad, int daireNo, int katNo) {
        super(ad);
        this.daireNumarası = daireNo;
        this.katNumarası = katNo;
    }

    // Daire bilgilerini gösteren metod
    public void bilgileriGöster() {
        super.bilgileriGöster();
        System.out.println("Daire Numarası: " + daireNumarası);
        System.out.println("Kat Numarası: " + katNumarası);
    }

    // Daire numarasını döndüren metod
    public int getDaireNumarası() {
        return daireNumarası;
    }
}
