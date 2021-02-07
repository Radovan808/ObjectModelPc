package cz.rado.model;

public class Procesor {

    private String vyrobce;
    private String frekvence;

    public Procesor(String vyrobce, String frekvence) {
        this.vyrobce = vyrobce;
        this.frekvence = frekvence;
    }

    public String getVyrobce() {
        return vyrobce;
    }

    public String getFrekvence() {
        return frekvence;
    }

    @Override
    public String toString() {
        return "Procesor{" +
                "vyrobce='" + vyrobce + '\'' +
                ", frekvence='" + frekvence + '\'' +
                '}';
    }
}
