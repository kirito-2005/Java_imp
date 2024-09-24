//converting the birthday to days using their year;
import java.util.Scanner;
class Age{
    static int convertTodays(int age){
        return 365*age;
    }
    static int convertTodays(double age){
        return (int)Math.round(365.25*age);
    }
}
public class Days {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int age_i=sc.nextInt();
        double age_d=sc.nextFloat();
        System.out.printf("%d years is approximately %d days.\n",age_i,Age.convertTodays(age_i));
        System.out.printf("%.1f years is approximately %d days.",age_d,Age.convertTodays(age_d));
        sc.close();
    }
}
