import moves.Moves;
import pokemon.Bulbasaur;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int random = (int) Math.floor(Math.random()*15)+1;
        Bulbasaur bulbasaur = new Bulbasaur(5,random,random,random,random,random,random);
        Moves[] bulbaMoves = bulbasaur.pullMoveList();
        for(Moves move:bulbaMoves){
            System.out.println(move.getName()+" "+move.getType()+" "+move.getPowerPoints());
        }

    }
}
