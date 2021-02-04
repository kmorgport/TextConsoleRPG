package moves;

abstract public class Moves {
    protected String name;
    protected String type;
    protected String category;
    protected int powerPoints;
    protected int accuracy;

    public Moves(String name, String type, String category, int powerPoints, int accuracy){
        this.name = name;
        this.type = type;
        this.category = category;
        this.powerPoints = powerPoints;
        this.accuracy = accuracy;

    }
}
