public class Main {
    public static void main(String[] args) {
        City pistoia = new City("Pistoia", new Point(10, 20));
        City montecatini = new City("Montecatini", new Point(30, 50));
        City livorno = new City("Livorno", new Point(1, 2));

        Aereo a1 = new Aereo();
        Aereo a2 = new Aereo();

        a1.setStart(pistoia);
        a1.setDestination(montecatini);
    }
}
