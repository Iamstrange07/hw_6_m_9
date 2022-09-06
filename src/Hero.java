import java.util.Random;

public class Hero  extends GameEntity{
    public Hero(int a, int s,Weapons weapon) {
        super(a, s,weapon);
    }
    private int g;


    public Hero(int a, int s, int g,Weapons weapon) {
        super(a, s,weapon);
        this.g = g;

    }

    public int getG() {
        return g;
    }

    public void setG(int g) {
        this.g = g;
    }
}
