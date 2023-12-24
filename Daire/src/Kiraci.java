// Kiraci sınıfı, kiracı özelliklerini temsil eder.
public class Kiraci {
    private String kiraciAdı; // Kiracı adı
    private String kiraciAdresi; // Kiracı adresi
    private EvSahibi evSahibi; // Kiracının ev sahibi

    // Kiraci sınıfının yapıcı metodu
    public Kiraci(String ad, String adres, EvSahibi sahip) {
        this.kiraciAdı = ad;
        this.kiraciAdresi = adres;
        this.evSahibi = sahip;
    }

    // Kiracı ve bağlı olduğu ev sahibi bilgilerini gösteren metod
    public void bilgileriGöster() {
        System.out.println("Kiracı Adı: " + kiraciAdı);
        System.out.println("Kiracı Adresi: " + kiraciAdresi);
        evSahibi.bilgileriGöster();
    }

    // Kiracının ev sahibini değiştiren metod
    public void setEvSahibi(EvSahibi evSahibi) {
        this.evSahibi = evSahibi;
    }
}
