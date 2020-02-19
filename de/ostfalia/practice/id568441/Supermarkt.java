package de.ostfalia.practice.id568441;

import java.util.ArrayList;

public class Supermarkt {
    private String filialenname;
    private ArrayList<Ware> waren;

    public Supermarkt(String filialenname) {
        this.filialenname = filialenname;
        this.waren = new ArrayList<>();
    }

    public String getFilialenname() {
        return filialenname;
    }

    public void setFilialenname(String filialenname) {
        this.filialenname = filialenname;
    }
     public ArrayList<Ware> getWaren() {
        return waren;
    }

      public void setWaren(ArrayList<Ware> waren) {
        this.waren = waren;
    }

    public void addWare(Ware w){
        waren.add(w);
    }

    public Ware getWare(int i){
        return waren.get(i);
    }
}
