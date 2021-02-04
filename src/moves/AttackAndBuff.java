package moves;

public class AttackAndBuff extends Moves{
    protected int power;
    protected int buffDebuffInteger;
    protected String buffDebuffType;
    protected int buffDebuffChance;

    public AttackAndBuff(String name, String type, String category, int powerPoints, int accuracy, int power, int buffDebuffInteger, String buffDebuffType, int buffDebuffChance) {
        super(name, type, category, powerPoints, accuracy);
        this.power = power;
        this.buffDebuffInteger = buffDebuffInteger;
        this.buffDebuffType = buffDebuffType;
        this.buffDebuffChance = buffDebuffChance;
    }
}
