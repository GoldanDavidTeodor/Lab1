public class Main {

    public static void main(String[] args){

        Agentie a1= new Agentie("Gigel Turism","Iasi",5);
        cultural t1= new cultural("Tur cultural","Gigel","David Cosmin Gigel", 500);
        a1.add_tur(t1);
        aventura t2= new aventura("Tur cultural","Gigel","David Cosmin Gigel", 500);
        a1.add_tur(t2);
        System.out.println(t1.getGhid());
    }
}