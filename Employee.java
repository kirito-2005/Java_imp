import java.util.Scanner;
 class Emp {
    String name;
    double salary;
    void get_items(String k,double sal ){
        name=k;
        salary= sal;
    }
    double get_salary(){
        return salary;
    }
}
public  class Employee{
    public static void main(String[]args){
        Scanner sc= new Scanner(System.in);
        //no of times
        System.out.println("enter then no of ");
        int no=sc.nextInt();
        sc.nextLine();
        Emp[] e=new Emp[no];
        for(int i=0;i<no;i++){
            e[i]=new Emp();
            System.out.println("Enter the name and slary  ");
            String name= sc.nextLine();
            double salary=sc.nextFloat();
            sc.nextLine();
            e[i].get_items(name,salary);
        }
        //thresold
        System.out.println("enter the Threshold");
        double threshold =sc.nextFloat();
        double sum=0;
        int count=0;
        for(int i=0;i<no;i++){
            if(e[i].get_salary()>threshold){
            sum+=e[i].get_salary();
            count++;
            }
        }
        if(count==0){
            System.out.println("No employees earn more than the given threshold");
        }
        else{
            double fin=sum/count;
            System.out.printf("the average is %.2f",fin);
        }
        sc.close();
    }
}
