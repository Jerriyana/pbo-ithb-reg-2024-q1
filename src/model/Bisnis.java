package model;

public class Bisnis extends Tiket{
    private boolean mauPesanMakan;
    private double hargaMakanan;
    
    public double hitungBiayaTiket(){
        return 0;
    }

    public Bisnis(String noTiket, String namaPesawat, double jarakTempuhKm, double beratKg, boolean mauPesanMakan,
            double hargaMakanan) {
        super(noTiket, namaPesawat, jarakTempuhKm, beratKg);
        this.mauPesanMakan = mauPesanMakan;
        this.hargaMakanan = hargaMakanan;
    }

    public boolean isMauPesanMakan() {
        return mauPesanMakan;
    }

    public void setMauPesanMakan(boolean mauPesanMakan) {
        this.mauPesanMakan = mauPesanMakan;
    }

    public double getHargaMakanan() {
        return hargaMakanan;
    }

    public void setHargaMakanan(double hargaMakanan) {
        this.hargaMakanan = hargaMakanan;
    }           
}
