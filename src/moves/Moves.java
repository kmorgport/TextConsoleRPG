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

    public String getName(){
        return this.name;
    }

    public String getType(){
        return this.type;
    }

    public String getCategory(){
        return this.category;
    }

    public int getPowerPoints(){
        return this.powerPoints;
    }

    public int getAccuracy(){
        return this.accuracy;
    }

    abstract public int getPower();
}
