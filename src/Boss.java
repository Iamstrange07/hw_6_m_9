public class Boss extends GameEntity{
    private int f;
    public String printlnInfo(){
        return "Weapon -"+this.getWeapon()+" Damage: "+getS()+" Health: "+getA()+" Defence: "+getF();

    }


    public Boss(int a, int s,Weapons weapon) {
        super(a, s,weapon);
    }

    public Boss(int a, int s, int f,Weapons weapon) {
        super(a, s,weapon);
        this.f = f;
    }

    public int getF() {
        return f;
    }

    public void setF(int f) {
        this.f = f;
    }
}
