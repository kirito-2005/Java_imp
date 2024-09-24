import java.util.Scanner;
public class Moves {
     static  void get_input(int a[], int no){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<no;i++){
            a[i]=sc.nextInt();
        }
        sc.close();
    }
    public static void  main(String[] args){
    Scanner sc=new Scanner(System.in);
    int no=11;
    int[] array={1, 3, 5, 8, 9, 2, 6, 7, 6, 8, 9};
    //get_input(array,no);
    int i=0;
    int count=0;
    while(i<no){
        if(array[i]!=0){
        i+=array[i];
        count++;
        }
        else{
            break;
        }
        if(i>=no-1){
            break;
        }
    }
    System.out.println(count);
    sc.close();





}
}
