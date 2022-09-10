public class Aereo {

    private Point location;

    private City destination;

    private City start;

    public Aereo(){
        location = null;
        destination = null;
        start = null;
    }

    public Point getLocation(){
        return location;
    }

    public void setStart(City c){
        this.start = c;
        this.location = c.getPosition();
        System.out.println("Parto da " + c);
    }

    public void setDestination(City c){
        this.destination = c;
        System.out.println("Arrivo a " + c);

    }



}
