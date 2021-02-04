package pokemon;

import moves.Attack;
import moves.BuffDeBuff;
import moves.Moves;

public class BulbasaurMoves {
    public static Moves[] findBulbasaurMoves(){
        return new Moves[]{
                new Attack("Tackle","Normal","Physical",35,95,35),
                new BuffDeBuff("Growl","Normal","Status",40,100,-1,"attack",100),
                new Attack("Vine Whip","Grass","Physical",25,100,45)
        };
    }
}
