import java.util.ArrayList;

public class Pizza {
    String isim;
    double fiyat;
    ArrayList<String> malzemeler = new ArrayList<>();

    public Pizza(String isim, ArrayList<String> malzemeler, double fiyat) {
        this.isim = isim;
        this.malzemeler = malzemeler;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public void setIsim(String isim) {
        this.isim = isim;
    }

    public ArrayList<String> getMalzemeler() {
        return malzemeler;
    }

    public void setMalzemeler(ArrayList<String> malzemeler) {
        this.malzemeler = malzemeler;
    }

    public double getFiyat() {
        return fiyat;
    }

    public void setFiyat(double fiyat) {
        this.fiyat = fiyat;
    }
}
