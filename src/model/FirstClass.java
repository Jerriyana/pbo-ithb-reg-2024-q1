package model;

public class FirstClass extends Tiket{
    private String pilihMenuMakan;
    private boolean mauAsuransi;
    private double hargaAsuransi;

    
    public double hitungBiayaTiket(){
        return 0;
    }

    public FirstClass(String noTiket, String namaPesawat, double jarakTempuhKm, double beratKg, String pilihMenuMakan,
            boolean mauAsuransi, double hargaAsuransi) {
        super(noTiket, namaPesawat, jarakTempuhKm, beratKg);
        this.pilihMenuMakan = pilihMenuMakan;
        this.mauAsuransi = mauAsuransi;
        this.hargaAsuransi = hargaAsuransi;
    }

    public String getPilihMenuMakan() {
        return pilihMenuMakan;
    }

    public void setPilihMenuMakan(String pilihMenuMakan) {
        this.pilihMenuMakan = pilihMenuMakan;
    }

    public boolean isMauAsuransi() {
        return mauAsuransi;
    }

    public void setMauAsuransi(boolean mauAsuransi) {
        this.mauAsuransi = mauAsuransi;
    }

    public double getHargaAsuransi() {
        return hargaAsuransi;
    }

    public void setHargaAsuransi(double hargaAsuransi) {
        this.hargaAsuransi = hargaAsuransi;
    }    
}
