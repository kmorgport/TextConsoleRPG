package pokemon;

public class Battle {
    Battle(){

    }

    public double grassTypeMultiplier(String type){
        switch (type){
            case "Flying":
            case "Poison":
            case "Bug":
            case "Steel":
            case "Fire":
            case "Grass":
            case "Electric":
            case "Dragon":
                return .5;
            case "Ground":
            case "Rock":
            case "Water":
                return 2;
            default:
                return 1;
        }
    }

    public double fireTypeMultiplier(String type){
        switch(type){
            case "Rock":
            case "Fire":
            case "Water":
            case "Dragon":
                return .5;
            case "Bug":
            case "Steel":
            case "Grass":
            case "Ice":
                return 2;
            default:
                return 1;

        }
    }

    public double waterTypeMultiplier(String type){
        switch(type){
            case "Water":
            case "Grass":
            case "Dragon":
                return .5;

            case "Ground":
            case "Rock":
            case "Fire":
                return 2;
            default:
                return 1;
        }
    }

    public double normalTypeMultiplier(String type){
        switch(type){
            case "Ghost":
                return 0;
            case "Rock":
            case "Steel":
                return .5;
            default:
                return 1;
        }
    }
}
