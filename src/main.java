import pokemon.Bulbasaur;

public class main {
    public static void main(String[] args){
        int random = (int) Math.floor(Math.random()*15)+1;
        Bulbasaur bulbasaur = new Bulbasaur(5,random,random,random,random,random,random);
        System.out.println(bulbasaur.getLevel());
        System.out.println(bulbasaur.getHitPoints());
        System.out.println(bulbasaur.getAttack());
        System.out.println(bulbasaur.getDefense());
        System.out.println(bulbasaur.getSpecialAttack());
        System.out.println(bulbasaur.getSpecialDefense());
        System.out.println(bulbasaur.getSpeed());
        System.out.println(bulbasaur.getBaseExp());
        System.out.println(bulbasaur.getCurrentExpTotal());
        System.out.println(bulbasaur.getExpToNextLevel());

    }
}
