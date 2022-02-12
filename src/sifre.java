import java.util.Scanner;
public class sifre {
    public static void main(String[] args){
        String userName,password,secim,yeniSifre;
        Scanner sc = new Scanner(System.in);
        System.out.print("Kullanıcı adi: ");
        userName = sc.nextLine();
        System.out.print("Sifre girin: ");
        password = sc.nextLine();
        if(userName.equals("patika") && password.equals("java123")){
            System.out.println("Giris yapildi.");
        }
        else{
            System.out.print("Bilgiler yanlış!\nSifrenizi sifirlamak istermisiniz?(e/h): ");
            secim = sc.nextLine();
            if(secim.equals("e") || secim.equals("E")){
                System.out.print("yeni sifre gir: ");
                yeniSifre = sc.nextLine();
                if(yeniSifre.equals(password)){
                    System.out.println("sifre olusturulamadı tekrar deneyiniz");
                }else{
                    System.out.println("Sifre olusturuldu.");
                }
            }else{
                System.out.println("Cikiş yapiliyor...");
                System.exit(0);
            }
        }
    }
}
