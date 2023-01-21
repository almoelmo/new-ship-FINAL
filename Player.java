package kirill.battle_of_sea;

final public class Player {

    private String name;
    private int points = 0;
    private GameField field;
    private int[] ships;


    public void setName(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public String shoot(int x, int y){
        return "Игрок " + this.name + " решил ударить по ячейке " + x + " " + y;
    }

    public void setPoints() {
        this.points++;
    }

    public int getPoints() {
        return points;
    }

    public void setField(GameField field) {
        this.field = field;
    }


    public Player(String name, int points) {
        this.name = name;
        this.points = points;
        this.ships = new int[countShips()];
    }

    public Player(String name) {
        this.name = name;
        this.ships = new int[countShips()];
    }

    public Player(int points) {
        this.points = points;
        this.ships = new int[countShips()];
    }

    private int countShips(){
        int count = 0;
        for (int i = 0; i < GameField.rules.length; i++) {
            count += GameField.rules[i];
        }
        return count;
    }

    public void setShips(int[] ships) {
        this.ships = ships;
    }
}