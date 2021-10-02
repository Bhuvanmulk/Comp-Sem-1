import java.util.*;
public class coord
{
    public static void main(String[] args) {    
    }
    {
        Scanner in = new Scanner(System.in);
        int x1,x2,y1,y2;
        double p,d;
        System.out.println("Enter the value of x1,x2,y1 and y2");
        x1 = in.nextInt();
        x2 = in.nextInt();
        y1 = in.nextInt();
        y2 = in.nextInt();
        in.close();
        p = Math.pow((y2-y1),2)+Math.pow((x2-x1), 2);
        d = Math.sqrt(p);
        System.out.println("The distance between two points is "+d);

    }
}