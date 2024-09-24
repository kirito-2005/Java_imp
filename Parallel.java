import java.util.Scanner;
class ParallelUniverse{
    private double energylevel1;
    private double energylevel2;
    public void setlevel(double e1,double e2){
        energylevel1=e1;
        energylevel2=e2;
    }
    public void energytransfered(){
        double transfer=Math.sqrt(energylevel1*energylevel2)*.1;
        energylevel1=energylevel1-transfer;
        energylevel2=energylevel2+transfer;
        System.out.printf("Energy Transfered:%.2f\n",transfer);
        System.out.printf("Universe 1 Energy: %.2f\n",energylevel1);
        System.out.printf("Universe 2 Energy: %.2f\n",energylevel2);
    }
}
public class  Parallel{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        //energy
        double level1=sc.nextFloat();
        double level2=sc.nextFloat();
        ParallelUniverse p=new ParallelUniverse();
        p.setlevel(level1,level2);
        p.energytransfered();
        sc.close();

    }
}