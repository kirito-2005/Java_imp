import java.util.Scanner;
public class Alternate {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        // get the no of 
        int no=sc.nextInt();
        int[] array=new int[no];
        for(int i=0;i<no;i++){
            array[i]=sc.nextInt();
        }
        //seperate the positive and negativ no 
        int[] pos=new int[100];
        int count_p=0;
        int[] neg=new int[100];
        int count_n=0;
        for(int i=0;i<no;i++){
            if(array[i]>0){
                pos[count_p++]=array[i];
            }
            else{
                neg[count_n++]=array[i];
            }
        }
        int count_fp=0;
       int  count_fn=0;
        for(int i=0;i<(no);i+=2){
            if(count_fp<count_p){
            array[i]=pos[count_fp++];
            }
            if(count_fn<count_n){
            array[i+1]=neg[count_fn++];
            }
        }
        for(int i=0;i<no;i++){
            System.out.printf("%d ",array[i]);
        }
        sc.close();


    }
    
}
