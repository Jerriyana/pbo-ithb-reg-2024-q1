package controller;

import view.MainMenuView;
import model.*;
import java.util.ArrayList;

public class MainController {
    private MainMenuView view;
    private ArrayList<Tiket> tikets;
    private Ekonomi ekonomi;
    private Bisnis bisnis;
    private FirstClass firstClass;

    public MainController(MainMenuView view) {
        this.view = view;
        this.tikets = Dummy.getAllTikets();
    }

    public void run() {
        while (true) {
            int menuChoice = view.showMainMenu();
            switch (menuChoice) {
                case 0:
                    String nama = view.getInput("Pilih Pesawat : \n Garuda Indonesia (Ekonomi) \n" + 
                            " Lion Air (Ekonomi) \n" + 
                            " Citilink (Bisnis) \n" + 
                            " Sriwijaya Air (Bisnis) \n" + 
                            " Emirates (First Class) \n" + 
                            " Singapore Airlines (First Class)");
                    hitungTotalHargaTiket(nama);
                    break;
                default:
                    System.exit(0);
            }
        }
    }

    // Total Harga Tiket
    public void hitungHarga() {

    }

    public void hitungTotalHargaTiket(String nama) {        
        Tiket tiket = tikets.stream()
                .filter(t -> t.getNamaPesawat().equalsIgnoreCase(nama))
                .findFirst()
                .orElse(null);

        if(tiket instanceof Ekonomi){
            Ekonomi ekonomi = (Ekonomi) tiket;
            double totalHarga = ekonomi.hitungBiayaTiket(ekonomi);                        
            view.showMessage("Total Harga : " + totalHarga);
        } else if(tiket instanceof Bisnis){
            Bisnis bisnis = (Bisnis) tiket;
            double totalHarga = bisnis.hitungBiayaTiket();
        } else if(tiket instanceof FirstClass){
            FirstClass firstClass = (FirstClass) tiket;
            double totalHarga = firstClass.hitungBiayaTiket();
        } else{
            view.showMessage("tidak termasuk ke kelas apapun");
        }
    }
}