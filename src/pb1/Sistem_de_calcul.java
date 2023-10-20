package pb1;

public class Sistem_de_calcul extends Echipamente_electronice{

    public Sistem_de_calcul(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare) {
        super(denumire, nr_inv, pret, zona_mag, stare);
    }

    private String tip_mon;
    private int vit_proc;
    private int c_hdd;
    private Sistem_operare sistem_operare;

    public Sistem_de_calcul(String denumire, int nr_inv, float pret, String zona_mag, StareObiect stare, String tip_mon, int vit_proc, int c_hdd, Sistem_operare sistem_operare) {
        super(denumire, nr_inv, pret, zona_mag, stare);
        this.tip_mon = tip_mon;
        this.vit_proc = vit_proc;
        this.c_hdd = c_hdd;
        this.sistem_operare = sistem_operare;
    }
}
