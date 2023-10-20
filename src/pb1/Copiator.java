package pb1;

public class Copiator extends Echipamente_electronice{

    public Copiator(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare) {
        super(denumire, nr_inv, pret, zona_mag, stare);
    }

    private int p_ton;
    private Format format_de_copiere;

    public Copiator(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare, int p_ton, Format format_de_copiere) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.p_ton = p_ton;
        this.format_de_copiere = format_de_copiere;
    }
}
