package pb1;

public class Echipamente_electronice {
    private String denumire;
    private int nr_inv;
    private float pret;
    private String zona_mag;
    private StareObiect stare;

    public Echipamente_electronice(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare) {
        this.denumire = denumire;
        this.nr_inv = nr_inv;
        this.pret = pret;
        this.zona_mag = zona_mag;
        this.stare = stare;
    }


    public StareObiect getStare() {
        return stare;
    }

    @Override
    public String toString() {
        return "Echipamente electronice{" + "denumire = " + denumire + ", nr_inv" + nr_inv + ", pret" + pret + ", zona_mag" + zona_mag + ", stare" + stare + "}";
    }

    public String getDenumire() {
        return denumire;
    }

    public void setStare(StareObiect stare) {
        this.stare = stare;
    }


}
