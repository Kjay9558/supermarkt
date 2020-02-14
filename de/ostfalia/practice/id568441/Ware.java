package de.ostfalia.practice.id568441;

public abstract class Ware {
    private double preis;
    private int artikelnummer;
    private String name;
    private short altersfreigabe;
    private String hersteller;

    public Ware(double preis, int artikelnummer, String name, short altersfreigabe, String hersteller) {
        this.preis = preis;
        this.artikelnummer = artikelnummer;
        this.name = name;
        this.altersfreigabe = altersfreigabe;
        this.hersteller = hersteller;
    }

    public double getPreis() {
        return preis;
    }

    public void setPreis(double preis) {
        this.preis = preis;
    }

    public int getArtikelnummer() {
        return artikelnummer;
    }

    public void setArtikelnummer(int artikelnummer) {
        this.artikelnummer = artikelnummer;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public short getAltersfreigabe() {
        return altersfreigabe;
    }

    public void setAltersfreigabe(short altersfreigabe) {
        this.altersfreigabe = altersfreigabe;
    }

    public String getHersteller() {
        return hersteller;
    }

    public void setHersteller(String hersteller) {
        this.hersteller = hersteller;
    }

    @Override
    public String toString() {
        return  "Ware{" +
                "preis=" + preis +
                ", artikelnummer=" + artikelnummer +
                ", name='" + name + '\'' +
                ", altersfreigabe=" + altersfreigabe +
                ", hersteller='" + hersteller + '\'' +
                '}';
    }
}
