package LingkaranKalkulator;

public class Lingkaran {
    public double Jari2;

    public Lingkaran(double r){
        this.Jari2 = r;
    }
    public void SetJari2(double r){
        Jari2 = r;
    }
    public double getJari2(){
        return Jari2;
    }
    public double getDiameter() {
        double Diameter = Jari2*2;
        return Diameter;
    }
    public double getKeliling() {
        return 3.14*getDiameter();
    }
    public double getLuas() {
        return 3.14*Jari2*Jari2;
    }
    public void Display(){
       System.out.println("======LINGKARAN======");
       System.out.println("Jari-Jari: "+getJari2());
       System.out.println("Diameter : "+getDiameter());
       System.out.println("Luas     : "+getLuas());
       System.out.println("Keliling : "+getKeliling());

}} 
