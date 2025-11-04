import java.util.Scanner;

public class LatihanSoal1Ukl1 {
    public static void main(String[] args) {
        Scanner input = new Scanner (System.in);
        System.out.print("Jarak kurang dari 10 km : Rp.4250 per kg");
        System.out.print("Jarak lebih dari 10 km : Rp.6000 per kg");
        System.out.print("Volume paket melebihi 100 cm3 mendapatkan biaya tambahan Rp.50000");
        System.out.print("Masukkan jarak pengiriman (dalam km):");
        int jarak = input.nextInt();
        System.out.print("Masukkan berat paket (dalam kg):");
        double berat = input.nextDouble();
        System.out.print("Masukkan panjang paket (dalam cm):");
        int panjang = input.nextInt();
        System.out.print("Masukkan lebar paket (dalam cm):");
        int lebar = input.nextInt();
        System.out.print("Masukkan tinggi paket (dalam cm):");
        int tinggi = input.nextInt();
        int volume = panjang * lebar * tinggi;
        System.out.print("Volume paket adalah:" + volume + " cm3");
        double biayaPerKg;
        if (volume <= 100) {
            biayaPerKg = 4250;
        } else {
            biayaPerKg = 6000;
        }
        double totalBiaya = (biayaPerKg * berat) + (volume > 100 ? 50000 : 0);
        System.out.print("Total biaya pengiriman: Rp." + totalBiaya);

        input.close();
    }
}
