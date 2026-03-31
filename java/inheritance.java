class Pokemeon{
    int power;
    String type;
    Pokemon(String type, int power){
        this.power = power;
        this.type = type;
    }Pokemon(){

    }
    void print(){// getter
        System.out.println(this.power+" "this.type);
    }
}
class LegendaryPokemon extends Pokemon{// child class
    
    String ability;
}
public class inheritance {
    public static void main(String[] args) {
        LegendaryPokemon mewtwo = new LegendaryPokemon();
        mewtwo.ability = "Pressure";
        Pokemon pikachu = new Pokemon();
    }

    
}
