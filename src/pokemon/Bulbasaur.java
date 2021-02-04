package pokemon;

public class Bulbasaur extends Pokemon{
    protected final static int baseHP = 45;
    protected final static int baseAttack = 49;
    protected final static int baseDefense = 49;
    protected final static int baseSpecialAttack = 65;
    protected final static int baseSpecialDefense = 65;
    protected final static int baseSpeed = 45;
    protected final static String type1 = "Grass";
    protected final static String type2 = "Poison";

    Bulbasaur(int level, int hpIV, int attackIV, int defenseIV, int specAttIV, int specDefIV, int speedIV) {
        super(level, hpIV, attackIV, defenseIV, specAttIV, specDefIV, speedIV);
        this.expTotal = 0;
        this.hitPoints = findHP(baseHP,hpIV,0,5);
        this.attack = findStat(baseAttack,attackIV,0,5);
        this.defense = findStat(baseDefense,defenseIV,0,5);
        this.specialAttack = findStat(baseSpecialAttack,specAttIV,0,5);
        this.specialDefense = findStat(baseSpecialDefense,specDefIV,0,5);
        this.speed = findStat(baseSpeed,speedIV,0,5);
    }

}
