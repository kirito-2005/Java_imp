import java.util.Scanner;
class Product{
    double price;
    Product(double p){
        this.price=p;
    }

}
class Subclass extends Product{
    private double discountRate;
    Subclass(double p,double rate ){
        super(p);
        this.discountRate=rate;
    }
    void calculatePrice(){
        if(discountRate<1)
        System.out.println(String.format("%.2f", (price * (1 - discountRate))));
        else{
            System.out.println("not applicable");
        }
    }
}
public class Shop{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        double price=sc.nextFloat();
        double rate=sc.nextFloat();
        Subclass s=new Subclass(price,rate);
        s.calculatePrice();
        sc.close();

    }
}
