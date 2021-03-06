public class PantryTester4 {
    public static void main(String[] args){
        Jam goose = new Jam("Gooseberry", "7/4/86", 3);
        Jam apple = new Jam("Crab Apple", "9/30/99", 1);
        Jam rhub  = new Jam("Rhubarb", "10/31/99", 2);

        Pantry hubbard = new Pantry(goose, apple, rhub);
        System.out.println(hubbard);

        if (hubbard.select(3)){
            hubbard.spread(2);
        }

        hubbard.mixedFruit();
        System.out.println(hubbard);
    }
}