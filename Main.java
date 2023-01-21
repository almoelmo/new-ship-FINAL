package kirill.battle_of_sea;

public class Main {
    public static void main(String[] args) {
        Player playerOne = new Player("Kirill");
        Player playerTwo = new Player("Michael", 10);
        GameField fieldPlayerOne = new GameField(playerOne.getName());
        GameField fieldPlayerTwo = new GameField(playerTwo.getName());
        System.out.println(playerOne.shoot(7,9));
        playerOne.setName("Petr");
        playerTwo.setPoints();

        Ship shipOne = new Ship(3,"ThreeFloor", playerOne.getName());
        Ship shipTwo = new Ship(4, "FourFloor", playerTwo.getName());
        System.out.println(shipOne.getName());
        System.out.println(shipTwo.getSize());
        Ship shipThree = new Ship(2, Ship.two);

        //
        fieldPlayerOne.printField();
        fieldPlayerOne.changeStatusAddShip(7, 2);
        fieldPlayerOne.printField();
    }
}
