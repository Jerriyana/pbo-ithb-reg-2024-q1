package model;

import java.util.ArrayList;
import model.*;

public class Dummy {
    public static Ekonomi ekonomi1, ekonomi2;
    public static Bisnis bisnis1, bisnis2;
    public static FirstClass firstClass1, firstClass2;
    static {
        // Ekonomi instances
        ekonomi1 = new Ekonomi("E1", "Garuda Indonesia", 500.0, 0, 5000);
        ekonomi2 = new Ekonomi("E2", "Lion Air", 750.0, 0, 5000);

        // Bisnis instances
        bisnis1 = new Bisnis("B1", "Citilink", 1000.0, 0, false, 0);
        bisnis2 = new Bisnis("B2", "Sriwijaya Air", 1200.0, 0, false, 0);

        // FirstClass instances
        firstClass1 = new FirstClass("F1", "Emirates", 2000.0, 0, "Western", false, 150);
        firstClass2 = new FirstClass("F2", "Singapore Airlines", 2500.0, 0, "Asian", false, 150);
    }

    public static ArrayList<Tiket> getAllTikets() {
        ArrayList<Tiket> tikets = new ArrayList<>();
        tikets.add(ekonomi1);
        tikets.add(ekonomi2);
        tikets.add(bisnis1);
        tikets.add(bisnis2);
        tikets.add(firstClass1);
        tikets.add(firstClass2);
        return tikets;
    }
}
