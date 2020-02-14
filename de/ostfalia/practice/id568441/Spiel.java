package de.ostfalia.practice.id568441;

public class Spiel extends Ware {
    private enum typ {
        VIDEO,BRETT,KARTE
    }

    public Spiel(double preis, int artikelnummer, String name, short altersfreigabe, String hersteller) {
        super(preis, artikelnummer, name, altersfreigabe, hersteller);
    }
}
