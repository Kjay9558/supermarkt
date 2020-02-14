package de.ostfalia.practice.id568441;

public class Lebensmittel extends Ware {
    private int kalorien;
    private double gewicht;

    public Lebensmittel(String filialenname, double preis, int artikelnummer,
                        String name, short altersfreigabe, String hersteller,
                        int kalorien, double gewicht) {
        super(filialenname, preis, artikelnummer, name, altersfreigabe, hersteller);
        this.kalorien = kalorien;
        this.gewicht = gewicht;
    }

    public int getKalorien() {
        return kalorien;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }

    public double getGewicht() {
        return gewicht;
    }

    public void setGewicht(double gewicht) {
        this.gewicht = gewicht;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Lebensmittel{" +
                "kalorien=" + kalorien +
                ", gewicht=" + gewicht +
                '}';
    }
}
