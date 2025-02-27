public class cultural extends tur {
    private int price;

    public cultural(String name, String Ghid, String participanti, int price) {
        super(name, Ghid, participanti);
        this.price = price;
    }

    @Override
    public void set_price(int price) {
        this.price = price;
    }

    public int getPrice() {
        return price;
    }

    public int getPrice(int discount){
        return price - discount;
    }

}
