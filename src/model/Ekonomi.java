package model;

public class Ekonomi extends Tiket{
    private double hargaParasut;    
    
    public Ekonomi(String noTiket, String namaPesawat, double jarakTempuhKm, double beratKg, double hargaParasut){
        super(noTiket, namaPesawat, jarakTempuhKm, beratKg);
        this.hargaParasut = hargaParasut;
    }    

    public double getHargaParasut() {
        return hargaParasut;
    }

    public void setHargaParasut(double hargaParasut) {
        this.hargaParasut = hargaParasut;
    }       
    
    
    public double hitungBiayaTiket(Ekonomi ekonomi){                                
        double totalHarga = 0;
        double hargaJarak = 0;
        double hargaBagasi = 0;

        hargaJarak = ekonomi.getJarakTempuhKm() * 7500;
        if(ekonomi.getBeratKg() >5){
            hargaBagasi = ekonomi.getBeratKg() * 1500;
        }
        totalHarga = hargaJarak + hargaBagasi + hargaParasut;
        return totalHarga;
    }
}
