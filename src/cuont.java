import java.util.Scanner;

public class Min {
    public static void main(String[] args) {
        String s;
        Scanner scanner = new Scanner(System.in);
        System.out.println("nhap chuoi ki tu");
        s=scanner.nextLine();
        System.out.println("nhap ki tu ban muon kiem tra");
        char c;
        c=scanner.next().charAt(0);
        int count=0;
        for(int i =0; i<s.length();i++){
            if(s.charAt(i)==c){
                count++;
            }
        }
        System.out.println("so lan xuat hien cua"+" "+c+" "+"la"+" "+count);
    }
}
