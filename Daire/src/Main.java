public class Main {
    public static void main(String[] args) {
        Bina bina = new Bina("Kırcalı Apartmanı", 5);

        Daire daire1 = new Daire("Daire 1", 1, 1);
        Daire daire2 = new Daire("Daire 2", 2, 2);

        bina.daireEkle(daire1);
        bina.daireEkle(daire2);
        bina.daireleriSırala();

        EvSahibi evSahibi = new EvSahibi("Ahmet Yılmaz", "Atatürk Caddesi");
        evSahibi.binaEkle(bina);

        Kiraci kiraci = new Kiraci("Ayşe Güneş", "122 Sokak", evSahibi);

        bina.bilgileriGöster();
        evSahibi.bilgileriGöster();
        kiraci.bilgileriGöster();
    }
}
