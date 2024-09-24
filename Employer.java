 import java.util.Scanner;
 class Employee {
    String name;
    int employeeID;
    Employee(String name,int id){
        this.name=name;
        this.employeeID=id;
    }
    
}
class Manager extends Employee{
    double monthly_salary;
    Manager(String name,int id,double salary){
        super(name,id);
        this.monthly_salary=salary;
    }
    double calculate_AnualSalary(){
        return (monthly_salary*12);
    }
    void Display(double p){
        System.out.println("Name: "+name);
        System.out.printf("Annual Salary: Rs. %.2f",p);
    }

}
public class Employer{
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        String name=sc.nextLine();
        int id=sc.nextInt();
        double salary_month=sc.nextFloat();
        Manager manager=new Manager(name,id,salary_month);
        double anual=manager.calculate_AnualSalary();
        manager.Display(anual);
        sc.close();

    }
}

