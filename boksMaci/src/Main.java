public class Main {
    public static void main(String[] args) {
        Fighter marc = new Fighter("Marc" , 90 , 20, 90, 40);
        Fighter alex = new Fighter("Alex" , 100 , 10, 100, 30);
        Ring r = new Ring(marc,alex , 90 , 100);
        r.run();
    }
}