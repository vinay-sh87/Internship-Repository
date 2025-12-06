import java.util.Scanner;

public class FifthActivity{
    public static void main(String args[]){
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the number of rows: ");
        int rows = scan.nextInt();
        System.out.println("Enter the number of cols: ");
        int cols = scan.nextInt();
        
        int first[][] = new int[rows][cols];
        int second[][] = new int[rows][cols];
        int sum[][] = new int[rows][cols];
        
        System.out.println("Enter the elements of the first matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                first[i][j] = scan.nextInt();
            }
        }
        
        System.out.println("Enter the elements of the second matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                second[i][j] = scan.nextInt();
            }
        }
        
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                sum[i][j] = first[i][j] + second[i][j];
            }
        }

        System.out.println("Sum of both the matrix: ");
        for(int i=0;i<rows;i++){
            for(int j=0;j<cols;j++){
                System.out.print(sum[i][j] + " ");
            }
            System.out.println();
        }
    }
}