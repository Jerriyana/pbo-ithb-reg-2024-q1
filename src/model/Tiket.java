package model;

public abstract class Tiket {
    private String noTiket;    
    private String namaPesawat;
    private double jarakTempuhKm;
    private double beratKg;        

    public Tiket(String noTiket, String namaPesawat, double jarakTempuhKm, double beratKg) {
        this.noTiket = noTiket;
        this.namaPesawat = namaPesawat;
        this.jarakTempuhKm = jarakTempuhKm;
        this.beratKg = beratKg;
    }
  
    public String getNoTiket() {
        return noTiket;
    }

    public void setNoTiket(String noTiket) {
        this.noTiket = noTiket;
    }

    public String getNamaPesawat() {
        return namaPesawat;
    }

    public void setNamaPesawat(String namaPesawat) {
        this.namaPesawat = namaPesawat;
    }

    public double getJarakTempuhKm() {
        return jarakTempuhKm;
    }

    public void setJarakTempuhKm(double jarakTempuhKm) {
        this.jarakTempuhKm = jarakTempuhKm;
    }

    public double getBeratKg() {
        return beratKg;
    }

    public void setBeratKg(double beratKg) {
        this.beratKg = beratKg;
    }      

    
    public double hitungBiayaTiket(Tiket tiket){
        return 0;
    }  
}
