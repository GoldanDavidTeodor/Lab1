
abstract class tur {
    private String name;
    private String Ghid;
    private int price;
    private String participanti;

    abstract void set_price(int price);

    public tur(String nume, String Ghid, String participanti) {
        this.Ghid = Ghid;
        this.name = nume;
        this.participanti = participanti;
    }

    public void add_participanti(String participanti) {
        this.participanti = this.participanti + ", " + participanti;
    }

    public String getName() {
        return name;
    }

    public String getGhid() {
        return Ghid;
    }

    public String getParticipanti() {
        return participanti;
    }

  
}

