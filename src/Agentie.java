import java.util.ArrayList;

public class Agentie {
    private String name;
    private int rating;
    private ArrayList<tur> tururi;
    private String locatie;

    public String get_name() {
        return this.name;
    }

    public int get_rating() {
        return this.rating;
    }

    public String get_locatie() {
        return this.locatie;
    }

    public void Agentie() {
        this.name = "Empty";
        this.rating = 0;
        this.locatie = "Empty";
        this.tururi = new ArrayList<>();
    }

    public Agentie(String nume, String locatie, int rating) {
        this.name = nume;
        this.rating = rating;
        this.locatie = locatie;
        this.tururi = new ArrayList<>();
    }

    public void add_tur(tur turul) {
        this.tururi.add(turul);
    }

    public ArrayList<tur> get_tururi() {
        return this.tururi;
    }
}