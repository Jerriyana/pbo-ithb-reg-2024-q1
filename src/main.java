import controller.MainController;
import view.MainMenuView;

public class main {
    public static void main(String[] args) {
        // hitung biaya tiket pake fungsi hitungBiayaTiket()
        // opsi menghitung biaya total paket sekaligus
        /* 
         * class tiket -> class ekonomi, class bisnis, class first class
         * ekonomi : 50 km
         * bisnis : 100 km
         * first class : 150 km
         * bagasi lebih dari lima ada perhitungannya : 
         * 1. Ekonomi 
         * HargaPerJarak = km * 7500 
         * berat lebih dari 5 kg
         * HargaPerBagasi = kg * 1500
         * bayar parasut seharga 5000 
         * 
         * 2. Business 
         * Sama aja kek atas, bedanya ini aja : 
         * HargaPerJarak = km * 10000
         * HargaPerBagasi = kg * 2500 (>5kg)
         * Mau beli makan ga ? Kalo mau bayar 10% dari total pembelian kok
         * 
         * 3. First Class 
         * HargaPerJarak = km * 15000
         * HargaPerBagasi = none
         * Menu makan hanya 2 menu, bebas makannya sebanyak apa, bebas biaya, wih gg
         * Mau bayar asuransi ga? cuma 10% dari total pembelian kok         
         */
        MainMenuView view = new MainMenuView();
        MainController controller = new MainController(view);
        controller.run();
    }
}
