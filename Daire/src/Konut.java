// Konut sınıfı, genel konut özelliklerini temsil eder.
public class Konut {
    private String konutAdı; // Konutun adı

    // Konut sınıfının yapıcı metodu
    public Konut(String ad) {
        this.konutAdı = ad;
    }

    // Konut bilgilerini gösteren metod
    public void bilgileriGöster() {
        System.out.println("Konut Adı: " + konutAdı);
    }
}
