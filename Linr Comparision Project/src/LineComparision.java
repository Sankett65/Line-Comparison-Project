import java.util.Scanner;

public class LineComparision {
    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter The value for X1: ");
        int x1= sc.nextInt();
        System.out.print("Enter The value for Y1: ");
        int y1= sc.nextInt();
        System.out.println("Value of X1 and Y1: ("+x1+","+y1+")");
        System.out.print("Enter The value for X2: ");
        int x2=sc.nextInt();
        System.out.print("Enter The value for Y2: ");
        int y2 = sc.nextInt();
        System.out.println("Value of X2 and Y2: ("+x2+","+y2+")");

        double xlength= Math.pow(x2-x1,2);
        double ylength= Math.pow(y2-y1,2);
        double xylength=xlength+ylength;
        double totallength=Math.sqrt(xylength);
        System.out.println("\nLength is : "+totallength);


    }
}
