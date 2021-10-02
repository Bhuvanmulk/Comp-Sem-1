import java.util.*;
public class pythogoreantrip {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the value of 'm' to find the pythagorean triplet: ");
        double a,b,c,m;
        m = sc.nextInt();
        a = 2 * m;
        b = Math.pow(m, 2) + 1;
        c = Math.pow(m, 2) - 1;
        sc.close();
        System.out.println("The digits "+a+", "+b+" and "+c + " form a pythagorean triplet...");
    }
}
