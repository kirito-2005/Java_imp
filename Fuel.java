import java.util.Scanner;
class FuelEfficiency{
     private double distance;
     private double fuelconsumed;
    public void setFuelDetails(double dict,double fuel){
        distance=dict;
        fuelconsumed=fuel;
    }
    public void calculateEfficiency(){
        System.out.printf("%.2f Km/l\n",distance/fuelconsumed);
    }

}
public class Fuel{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        FuelEfficiency f=new FuelEfficiency();
        double distance=sc.nextFloat();
        double fuelcon=sc.nextFloat();
        f.setFuelDetails(distance,fuelcon);
        f.calculateEfficiency();
        sc.close();
    }
}
