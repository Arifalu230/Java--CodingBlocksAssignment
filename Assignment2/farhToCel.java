import java.util.Scanner;
public class farhToCel {
    public static void main(String[] args) {
        
    
    Scanner sc = new Scanner(System.in);
    int n1 = sc.nextInt();
    int n2 = sc.nextInt();
    int n3 = sc.nextInt();
    for (int i = n1; i <= n2; i += n3) {
        System.out.println(i + "\t" + (int)((5d / 9d)*(i - 32)));
    }
}
}