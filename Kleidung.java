package de.ostfalia.practice.id568441;

public class Kleidung extends Ware {
    private enum groesse {XS,S,M,L,XL,XXL};

    public Kleidung(double preis, int artikelnummer, String name, short altersfreigabe, String hersteller) {
        super(preis, artikelnummer, name, altersfreigabe, hersteller);
    }


}
