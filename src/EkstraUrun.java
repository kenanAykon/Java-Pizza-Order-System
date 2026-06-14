public class EkstraUrun {
    private String isim;
    private double fiyat;

    public EkstraUrun(String isim, double fiyat) {
        this.isim = isim;
        this.fiyat = fiyat;
    }

    public String getIsim() {
        return isim;
    }

    public double getFiyat() {
        return fiyat;
    }

    @Override
    public String toString() {
        return isim + " - " + fiyat + " TL";
    }
}
