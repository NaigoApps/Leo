public class City {

    private final String name;
    private final Point position;

    public City(String name, Point position){
        this.name = name;
        this.position = position;
    }

    public String getName(){
        return this.name;
    }

    public Point getPosition(){
        return this.position;
    }

    @Override
    public String toString() {
        return this.name;
    }
}
