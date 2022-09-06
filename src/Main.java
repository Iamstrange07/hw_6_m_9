public class Main {
    public static void main(String[] args) {
        Boss boss=new Boss(1500,75,150,Weapons.SWORD);
        System.out.println(boss.printlnInfo());
        Sceleton sceleton=new Sceleton(750,50,Weapons.BOW,7);
        System.out.println(sceleton.printlnInfo());
        Sceleton sceleton1=new Sceleton(725,45,Weapons.BOW,9);
        System.out.println(sceleton1.printlnInfo());

    }
}