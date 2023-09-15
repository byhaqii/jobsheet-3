public class Tes {
    public static void main (String[] args) {

        int Menu;
        char ulang;

        do {
        System.out.println("-----Selamat Datang-----");
        System.out.println("========================");
        System.out.println("1.Info Rekening");
        System.out.println("2.Transfer");
        System.out.println("3.Tarik Tunai");
        System.out.println("4.Setor Tunai");
        System.out.println("========================");
        System.out.println();

        System.out.println("Menu Nomor: ");
        Menu = input.nextInt();

        switch(Menu){
        case 1:
            System.out.println("Rekening Anda 12345");
            System.out.println("Saldo Anda : Rp 310.000.000");
            break;
        case 2:
            System.out.println("Tulis Nomor Rekening : ");
            System.out.println("Nominal Transfer : ");
            break;
        case 3:
            System.out.println("Saldo Yang Ingin Anda Tarik : ");
            break;
        case 4:
            System.out.println("Saldo Yang Anda Ingin Setorkan : ");
            break;
        default:
            System.out.println(Menu Tidak Tersedia);
        }
        System.out.println();

        System.out.println("Transaksi Lain?(y/t)");
        ulang = input.next().charAt(0);

        System.out.println();
    }
    while (ulang!= 't');
    System.out.println(Terimakasih...);
    }
}