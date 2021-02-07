package cz.rado.model;

import java.util.ArrayList;
import java.util.List;

public class Pc {
    private List<Pamet> pamet = new ArrayList<Pamet>();
    private Procesor procesor;
    private List<Karta> karty = new ArrayList<Karta>();

    private int pocetpameti;


    public int getPocetpameti() {
        return pocetpameti;
    }

    public Pc(int pocetpameti) {
        this.pocetpameti = pocetpameti;
    }

    public List<Pamet> getPamet() {
        return pamet;
    }

    public void setPamet(List<Pamet> pamet) {
        this.pamet = pamet;
    }

    public Procesor getProcesor() {
        return procesor;
    }

    public void setProcesor(Procesor procesor) {
        this.procesor = procesor;
    }

    public List<Karta> getKarty() {
        return karty;
    }

    public void setKarty(List<Karta> karty) {
        this.karty = karty;
    }

    @Override
    public String toString() {
        return "Pc{" +
                "pamet=" + pamet +
                ", procesor=" + procesor +
                ", karty=" + karty +
                ", pocetpameti=" + pocetpameti +
                '}';
    }
}
