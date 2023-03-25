import java.util.Scanner;

public class Max {
    public static void main(String[] args) {

        int a;
        Scanner scanner= new Scanner(System.in);
        System.out.println("do dai cua mang");
        a=scanner.nextInt();
        int [] Arr=new int[a];
        Scanner scanner1=new Scanner(System.in);
        System.out.println("nhap cac phan tu cua mang");
        for(int i = 0; i <Arr.length;i++){
            Arr[i]=scanner1.nextInt();
        }

        System.out.println(Max(Arr));

    }
    public static int Max (int [] arr){
        int max=arr[0];
        int index=0;
        for(int i = 0; i<arr.length;i++ ){
            if (max<arr[i]){
                max=arr[i];
                index=i;
            }
        }
        return max;

    }
}
