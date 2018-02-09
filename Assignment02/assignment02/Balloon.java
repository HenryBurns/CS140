package assignment02;

public class Balloon {
    private double radius = 0.0;
    public void inflate(double amount){
        radius += amount;
    }
    public void inflatePct(double amount){
        radius += (radius/100.0)* amount;
    }
    public double getVolume(){
        return (4* Math.PI * radius * radius *radius/3);
    }
    public void doubleVolume(){
        radius = Math.cbrt(2*getVolume()/4*3/Math.PI);
    }
}
