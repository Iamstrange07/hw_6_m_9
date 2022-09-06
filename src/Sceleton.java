public class Sceleton extends Boss{
    private int sumOfArrows;
    public Sceleton(int a, int s,Weapons weapon) {
        super(a, s,weapon);
    }

    public Sceleton(int a, int s, int f,Weapons weapon) {
        super(a, s, f,weapon);
    }
    public Sceleton(int a, int s,Weapons weapon, int sumOfArrows) {
        super(a, s,weapon);
        this.sumOfArrows=sumOfArrows;
    }
    public int getSumOfArrows() {
        return sumOfArrows;
    }

    public void setSumOfArrows(int sumOfArrows) {
        this.sumOfArrows = sumOfArrows;
    }

    @Override
    public String printlnInfo() {
        return super.printlnInfo()+" Arrows: "+getSumOfArrows();
    }
}
