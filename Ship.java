package kirill.battle_of_sea;

final public class Ship{//final добавили в класс чтобы от него никто не наследовался

    final static public String one = "oneFloor"; // тип короблей всегда один и тот же
    final static public String two = "twoFloor";
    final static public String three = "threeFloor";
    final static public String four = "fourFloor";

    private int size;
    private String name;
    private String player;

    public String getName() {
        return name;
    }

    public int getSize() {
        return size;
    }

    public Ship(int size, String name, String player) {
        this.size = size;
        this.name = name;
        this.player = player;
    }

    public Ship(int size, String player) {
        this.size = size;
        this.player = player;
    }

    public Ship(String name, String player) {
        this.name = name;
        this.player = player;
    }
}
