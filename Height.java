import java.util.Scanner;
public class Height{
     static void matrix(int a[],int no){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<no;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
    }
     static int check(int a[],int no){
        int count=1;
        int max=a[0];
        for (int i = 1; i < no; i++) {
            if (a[i] > max) {
                count++;
                max = a[i];  // Update max to the current building's height
            }
        }
        return count;
    }
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int no = sc.nextInt();
        int[] height=new int[no];
        matrix(height,no);
        int count=check(height,no);
        System.out.printf("%d",count);
        sc.close();
    }
}