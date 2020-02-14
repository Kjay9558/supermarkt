package de.ostfalia.practice.id568441;

public class Getraenk extends Ware {
    private double alkgehalt;
    private int kalorien;
    private double volumen;
    private boolean kohlensaeure;

    public Getraenk(String filialenname, double preis, int artikelnummer, String name, short altersfreigabe,
                    String hersteller, double alkgehalt, int kalorien, double volumen, boolean kohlensaeure) {
        super(filialenname, preis, artikelnummer, name, altersfreigabe, hersteller);
        this.alkgehalt = alkgehalt;
        this.kalorien = kalorien;
        this.volumen = volumen;
        this.kohlensaeure = kohlensaeure;
    }

    public double getAlkgehalt() {
        return alkgehalt;
    }

    public void setAlkgehalt(double alkgehalt) {
        this.alkgehalt = alkgehalt;
    }

    public int getKalorien() {
        return kalorien;
    }

    public void setKalorien(int kalorien) {
        this.kalorien = kalorien;
    }

    public double getVolumen() {
        return volumen;
    }

    public void setVolumen(double volumen) {
        this.volumen = volumen;
    }

    public boolean isKohlensaeure() {
        return kohlensaeure;
    }

    public void setKohlensaeure(boolean kohlensaeure) {
        this.kohlensaeure = kohlensaeure;
    }

    @Override
    public String toString() {
        return super.toString() +
                "Getraenk{" +
                "alkgehalt=" + alkgehalt +
                ", kalorien=" + kalorien +
                ", volumen=" + volumen +
                ", kohlensaeure=" + kohlensaeure +
                '}';
    }
}
