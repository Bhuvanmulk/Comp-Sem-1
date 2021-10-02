import java.util.*;
public class roundsqrt {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a,b;
        double c;
        System.out.println("Enter the number to find its square root and round it off: ");
        a = sc.nextInt();
        c = Math.sqrt(a);
        b = Math.round((int)c);
        sc.close();
        System.out.println("The square root of "+a+ " is "+ c + " and the rounded of sqrt is "+b);
    }
}
