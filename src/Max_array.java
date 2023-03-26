import java.util.Arrays;
import java.util.Scanner;

public class Max_array {

    public static void main(String[] args) {
        int cord;
        int row;
        Scanner scanner= new Scanner(System.in);
        System.out.println("nhap so cot");
        cord=scanner.nextInt();
        System.out.println("nhap so dong");
        row=scanner.nextInt();
        int [][]arr=new int[cord][row];
        System.out.println("nhap so cot so dong");
        for(int i = 0 ;i<cord; i++){
            for (int j = 0; j<row;j++){
                System.out.println("A[" + i + "]["+ j + "] = ");
                arr[i][j]=scanner.nextInt();

            }
        }int max =arr[0][0];
        for(int i = 0; i<cord;i++){
            for( int j = 0; j<row;j++){
                if(max<arr[i][j]){
                    max=arr[i][j];
                }
            }
        }
         System.out.println(Arrays.toString(arr));
    }
}
