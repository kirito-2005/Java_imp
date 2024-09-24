import java.util.Scanner;
public class median {
    static void get_input(int m[][],int row,int column){
        Scanner sc=new Scanner(System.in);
        for(int i=0;i<row;i++){
            for(int j=0;j<column;j++){
                System.out.println("enter the no");
                m[i][j]=sc.nextInt();
            }
        }
        sc.close();
    }
    static void bubble_row(int m[][],int row,int column){
        for(int i=0;i<column-1;i++){
            for(int j=0;j<column-1-i;j++){
                if(m[row][j]>m[row][j+1]){
                    int temp=m[row][j+1];
                    m[row][j+1]=m[row][j];
                    m[row][j]=temp;
                }
            }
        }
    }
    static void acending_row(int m[][],int row,int column){
        for(int i=0;i<row;i++){
            //bubble sort
            bubble_row( m,i, column);
        }
    }
    static void median_print(int m[][],int row,int column){
        for(int i=0;i<row;i++){
            if(column%2==0){
            System.out.println((double)(m[i][(column-1)/2]+m[i][(((column-1)/2)+1)])/2.0);
            }
        else{
            System.out.println((double)m[i][((column-1)+1)/2]);
            }

        }
    }
    public static void main(String[] args){
        Scanner sc=  new Scanner(System.in);
        int row=sc.nextInt();
        int col=sc.nextInt();
        int[][] matrix=new int[row][col];
        get_input(matrix,row,col);
        acending_row(matrix,row,col);
        median_print(matrix,row,col);
        
        sc.close();

    }
    
}
