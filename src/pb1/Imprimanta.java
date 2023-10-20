package pb1;

public class Imprimanta extends Echipamente_electronice{

    public Imprimanta(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare) {
        super(denumire, nr_inv, pret, zona_mag, stare);
    }

    private int ppm;
    private String rezolutie;
    private int p_car;
    private Tiparire mod_tiparire;

    public Imprimanta(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare, int ppm, String rezolutie, int p_car, Tiparire mod_tiparire) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.ppm = ppm;
        this.rezolutie = rezolutie;
        this.p_car = p_car;
        this.mod_tiparire = mod_tiparire;
    }
}
