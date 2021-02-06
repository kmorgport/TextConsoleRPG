import moves.Moves;
import pokemon.Bulbasaur;
import pokemon.Charmander;
import pokemon.Squirtle;

import java.util.Arrays;

public class main {
    public static void main(String[] args){
        int random = (int) Math.floor(Math.random()*15)+1;
        Bulbasaur bulbasaur = new Bulbasaur(5,random,random,random,random,random,random);
        Charmander charmander = new Charmander(5,random,random,random,random,random,random);
        Squirtle squirtle = new Squirtle(5,random,random,random,random,random,random);
        Moves[] bulbaMoves = bulbasaur.pullMoveList();
        Moves[] charMoves = charmander.pullMoveList();
        Moves[] squirtMoves = squirtle.pullMoveList();
        System.out.println(charmander.getHitPointsEV());
        System.out.println(charmander.getAttack());
        System.out.println(charmander.getBaseExp());
        System.out.println(charmander.getDefense());
        System.out.println(" ");
        System.out.println(squirtle.getName());
        System.out.println(squirtle.getAttack());
        System.out.println(squirtle.getBaseExp());
        System.out.println(squirtle.getDefense());
        for(Moves move:bulbaMoves){
            System.out.println(move.getName()+" "+move.getType()+" "+move.getPowerPoints());
        }
        System.out.println(" ");
        for(Moves move:charMoves){
            System.out.println(move.getName()+" "+move.getType()+" "+move.getPowerPoints());
        }
        System.out.println(" ");
        for(Moves move:squirtMoves){
            System.out.println(move.getName()+" "+move.getType()+" "+move.getPowerPoints());
        }

    }
}
