import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        String userName,password;

        Scanner input = new Scanner(System.in);

        System.out.print("Kullanıcı Adı: ");
        userName  = input.nextLine();

        System.out.print("Şifre: ");
        password  = input.nextLine();

        if (userName.equals("patika") && password.equals("java123")) {
            System.out.println("Giriş Yaptınız!");
        } else if (!userName.equals("userName") && !password.equals("java123")) {
            System.out.println("Hatalı giriş yaptınız!\nŞifrenizi sıfırlamak ister misiniz? \n1-Evet \n2-Hayır");
            System.out.print("Seçiminiz:");

            int secim;
            secim = input.nextInt();
            if (secim == 1) {
                String newPassword;
                Scanner inp = new Scanner(System.in);
                System.out.print("Yeni Şifre:");
                newPassword = inp.nextLine();

                if (password.equals(newPassword)) {
                    System.out.print("Yeni şifreniz eski şifrenizle aynı olamaz! Şifre oluşturalamadı.\nTekrar deneyiniz.");
                    System.out.println("Yeni Şifre:");
                    newPassword=inp.nextLine();

                } else if (!password.equals(newPassword)) {
                    System.out.println("Yeni şifreniz oluşturuldu.");
                }
            }
        }

            }
        }



