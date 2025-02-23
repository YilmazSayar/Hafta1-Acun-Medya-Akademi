import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String dogruSifre = "1212";


        System.out.println("ATM şifrenizi giriniz: ");
        String kullaniciSifre = scanner.nextLine();


        if (kullaniciSifre.equals(dogruSifre)) {
            double hesapBakiyesi = 100000;
            int kullaniciSecim;


                // Menü
                System.out.println("\n"+"Hesabınıza hoşgeldiniz");
                System.out.println("Hesabınızda yapabileceğiniz işlemler aşağıda belirtilmiştir:");
                System.out.println("1. Bakiye Görüntüleme");
                System.out.println("2. Para Yatırma");
                System.out.println("3. Para Çekme");
                System.out.println("4. Çıkış");
                System.out.print("Lütfen yapmak istediğiniz işlemi seçiniz: ");
            do {
                kullaniciSecim = scanner.nextInt();

                switch (kullaniciSecim) {
                    case 1:
                        System.out.println("Hesabınızdaki bakiye: " + hesapBakiyesi + " TL");
                        break;

                    case 2:
                        System.out.print("Yatırmak istediğiniz para miktarını giriniz: ");
                        double yatirmaMiktar = scanner.nextDouble();
                        hesapBakiyesi += yatirmaMiktar;
                        System.out.println("Yatırma işleminiz tamamlanmıştır.");
                        System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL");
                        break;

                    case 3:
                        System.out.print("Çekmek istediğiniz para miktarını giriniz: ");
                        double cekmeMiktar = scanner.nextDouble();
                        if (cekmeMiktar > hesapBakiyesi) {
                            System.out.println("Yetersiz bakiye! Çekmek istediğiniz tutar mevcut bakiyenizden fazla.");
                        } else {
                            hesapBakiyesi -= cekmeMiktar;
                            System.out.println("Çekme işleminiz tamamlanmıştır.");
                            System.out.println("Yeni bakiyeniz: " + hesapBakiyesi + " TL");
                        }
                        break;

                    case 4:
                        System.out.println("Çıkış yapılıyor...");
                        break;

                    default:
                        System.out.println("Geçersiz işlem! Lütfen tekrar deneyin.");
                        break;
                }
            } while (kullaniciSecim != 4);

        } else {
            System.out.println("Hatalı Şifre.");
        }

        scanner.close();
    }
}

