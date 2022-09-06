public class GameEntity {
    private int a;
    private int s;
    private  Weapons weapon;

    public GameEntity(int a, int s, Weapons weapon) {
        this.a = a;
        this.s = s;
        this.weapon = weapon;
    }

    public int getA() {
        return a;
    }

    public void setA(int a) {
        this.a = a;
    }

    public int getS() {
        return s;
    }

    public void setS(int s) {
        this.s = s;
    }

    public Weapons getWeapon() {
        return weapon;
    }

    public void setWeapon(Weapons weapon) {
        this.weapon = weapon;
    }
}
