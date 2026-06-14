import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        List<Kullanici> kullaniciArrayList = new ArrayList<>();
        Scanner scanner = new Scanner(System.in);
        boolean devam = true;
        while (devam) {
            System.out.println("Giris yapmak icin : 1");
            System.out.println("Kayit olmak icin : 2");
            System.out.println("Cikis yapmak icin : 0");
            int tercih = scanner.nextInt();
            switch (tercih) {
                case 1: // GİRİŞ YAP
                    boolean girisBasarili = false;

                    scanner.nextLine(); // önceki nextInt'ten sonra satırı temizle

                    while (!girisBasarili) {
                        System.out.print("Kullanici adi giriniz: ");
                        String isim = scanner.nextLine();

                        System.out.print("Parola giriniz: ");
                        String parola = scanner.nextLine();

                        for (Kullanici k : kullaniciArrayList) {
                            if (k.kullaniciAdi.equals(isim) && k.parola.equals(parola)) {
                                System.out.println("Giris basarili, hos geldiniz " + k.kullaniciAdi + "!");
                                girisBasarili = true;
                                break;
                            }
                        }

                        if (!girisBasarili) {
                            System.out.println("Kullanici adi veya parola hatali.");
                            System.out.print("Tekrar denemek icin -> 1 \nCikmak icin -> 0 : ");
                            int secim = scanner.nextInt();
                            scanner.nextLine(); // yine satırı temizle
                            if (secim == 0) {
                                break;
                            }
                        }
                    }

                    // Eğer giriş başarılıysa sipariş ekranına geç:
                    if (girisBasarili) {
                        PizzaSiparisEkrani siparisEkrani = new PizzaSiparisEkrani();
                        siparisEkrani.siparisBaslat();
                    }

                    break;


                case 2: // KAYIT OL
                    scanner.nextLine(); // satırı temizle

                    System.out.print("Kullanici adi giriniz: ");
                    String yeniIsim = scanner.nextLine();

                    System.out.print("Parola giriniz: ");
                    String yeniParola = scanner.nextLine();

                    boolean zatenVar = false;

                    for (Kullanici k : kullaniciArrayList) {
                        if (k.kullaniciAdi.equals(yeniIsim)) {
                            zatenVar = true;
                            break;
                        }
                    }

                    if (zatenVar) {
                        System.out.println("Bu kullanici adi zaten alinmis. Baska bir isim deneyin.");
                    } else {
                        kullaniciArrayList.add(new Kullanici(yeniIsim, yeniParola));
                        System.out.println("Kaydiniz basariyla olusturuldu.");
                    }
                    break;

                case 0: // ÇIKIŞ
                    System.out.println("Cikis yapiliyor...");
                    devam = false;
                    break;

                default:
                    System.out.println("Gecersiz secim yaptiniz. Lutfen tekrar deneyin.");
                    break;
            }
        }
    }
}
