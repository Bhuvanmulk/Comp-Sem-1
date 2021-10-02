import java.util.Scanner;
public class prob3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double tot;
        int a,b,c;
        System.out.println("Enter the Value of a, b and c: ");
        a = sc.nextInt();
        b = sc.nextInt();
        c = sc.nextInt();
        sc.close();
        tot = (1/Math.pow(a, 2)) + (2/Math.pow(b, 2)) + (3/Math.pow(c, 2));
        System.out.println("The value of this is "+tot);
    }
}