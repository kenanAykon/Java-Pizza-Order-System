import java.util.*;

public class PizzaSiparisEkrani {
    private List<EkstraUrun> ekstraUrunSepeti = new ArrayList<>();
    private List<Pizza> hazirPizzalar = new ArrayList<>();
    private List<Pizza> siparisSepeti = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public PizzaSiparisEkrani() {
        hazirPizzalariOlustur();
    }

    private void hazirPizzalariOlustur() {
        hazirPizzalar.add(new Pizza("Extravaganza", new ArrayList<>(Arrays.asList("Sucuk", "Mantar", "Zeytin", "Peynir")), 90));
        hazirPizzalar.add(new Pizza("Karışık", new ArrayList<>(Arrays.asList("Peynir", "Zeytin", "Mısır")), 80));
        hazirPizzalar.add(new Pizza("Pizza Mexicano", new ArrayList<>(Arrays.asList("Jalapeno", "Soğan", "Mozzarella")), 95));
    }

    public void siparisBaslat() {
        boolean devam = true;

        while (devam) {
            System.out.println("\nHazır Pizzalar:");
            for (int i = 0; i < hazirPizzalar.size(); i++) {
                Pizza p = hazirPizzalar.get(i);
                System.out.println((i + 1) + " - " + p.getIsim() + " (" + p.getFiyat() + " TL) -> Malzemeler: " + p.getMalzemeler());
            }
            System.out.println("0 - Çıkış");

            System.out.print("Bir pizza seçiniz: ");
            int secim = scanner.nextInt();

            if (secim == 0) {
                devam = false;
            } else if (secim > 0 && secim <= hazirPizzalar.size()) {
                Pizza secilenPizza = hazirPizzalar.get(secim - 1);

                double boyutEkFiyat = pizzaBoyutuSec();

                Pizza boyutluPizza = new Pizza(
                        secilenPizza.getIsim(),
                        secilenPizza.getMalzemeler(),
                        secilenPizza.getFiyat() + boyutEkFiyat
                );

                siparisSepeti.add(boyutluPizza);
                System.out.println(boyutluPizza.getIsim() + " sepete eklendi. (Toplam fiyat: " + boyutluPizza.getFiyat() + " TL)");
            } else {
                System.out.println("Geçersiz seçim, tekrar deneyiniz.");
            }
        }
        ekstraUrunSec();
        sepettekiToplamFiyatGoster();
    }

    private double pizzaBoyutuSec() {
        System.out.println("Pizza boyutunu seçiniz:");
        System.out.println("1 - Küçük (4 dilim, 1 kişi) [0 TL]");
        System.out.println("2 - Orta (6 dilim, 2 kişi) [+10 TL]");
        System.out.println("3 - Büyük (8 dilim, 3+ kişi) [+20 TL]");
        int secim = scanner.nextInt();

        switch (secim) {
            case 1: return 0;
            case 2: return 10;
            case 3: return 20;
            default:
                System.out.println("Geçersiz seçim, varsayılan Küçük boy seçildi.");
                return 0;
        }
    }

    private void sepettekiToplamFiyatGoster() {
        double toplam = 0;
        System.out.println("\nSipariş Özeti:");
        for (Pizza p : siparisSepeti) {
            System.out.println("- " + p.getIsim() + " : " + p.getFiyat() + " TL");
            toplam += p.getFiyat();
        }
        System.out.println("Toplam Tutar: " + toplam + " TL");
    }
    public void ekstraUrunSec() {
        Scanner scanner = new Scanner(System.in);
        List<EkstraUrun> urunler = new ArrayList<>();
        urunler.add(new EkstraUrun("Kola", 15));
        urunler.add(new EkstraUrun("Ayran", 10));
        urunler.add(new EkstraUrun("Limonata", 13));
        urunler.add(new EkstraUrun("Patates Kızartması", 20));
        urunler.add(new EkstraUrun("Soğan Halkası", 18));
        urunler.add(new EkstraUrun("Sufle", 25));
        urunler.add(new EkstraUrun("Dondurma", 22));

        System.out.println("Ekstra ürünler:");
        for (int i = 0; i < urunler.size(); i++) {
            System.out.println((i + 1) + ". " + urunler.get(i));
        }
        System.out.println("Siparişi bitirmek için 0'a basın.");

        while (true) {
            System.out.print("Bir ürün seçin (1-" + urunler.size() + "): ");
            int secim = scanner.nextInt();

            if (secim == 0) {
                break;
            } else if (secim >= 1 && secim <= urunler.size()) {
                EkstraUrun secilen = urunler.get(secim - 1);
                ekstraUrunSepeti.add(secilen);
                System.out.println(secilen.getIsim() + " sepete eklendi.");
            } else {
                System.out.println("Geçersiz seçim.");
            }
        }
    }

}
