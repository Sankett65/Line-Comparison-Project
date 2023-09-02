import java.util.Scanner;

public class LineComparision {



    static double length(int x, int y){
        System.out.println("Welcome to Line Comparison Computation Program");
        Scanner sc = new Scanner(System.in);
        int x1= 0;
        int y1=0;
        System.out.println("Value of X1 and Y1: ("+x1+","+y1+")");
        System.out.println("Value of X2 and Y2: ("+x+","+y+")");

        double xlength= Math.pow(x-x1,2);
        double ylength= Math.pow(y-y1,2);
        double xylength=xlength+ylength;
        double totallength=Math.sqrt(xylength);
        System.out.println("\nLength is : "+totallength);
        return totallength;
    }

    public static void main(String[] args) {
        LineComparision obj1= new LineComparision();
        obj1.length(2,3);
        LineComparision obj2= new LineComparision();
        obj2.length(6,5);
        System.out.println("To see whether the length of two line are equal or not: "+obj1.equals(obj2));



    }
}
