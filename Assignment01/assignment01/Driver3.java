package assignment01;

public class Driver3 {
    public static void main(String[] args){
        Balloon smiley = new Balloon();
        smiley.inflate(10);
        smiley.inflatePct(5.0);
        System.out.println(smiley.getVolume());
        smiley.doubleVolume();
        System.out.println(smiley.getVolume());
    }
}
