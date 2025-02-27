public class aventura extends tur {
    private int price;

    public aventura(String name, String Ghid, String participanti, int price) {
        super(name, Ghid, participanti);
        this.price = price;
    }

    @Override
    public void set_price(int price) {
        this.price = price*2;
    }

    public int getPrice() {
        return price/2;
    }

    public int getPrice(int discount){
        return (price - discount)/2;
    }

}
