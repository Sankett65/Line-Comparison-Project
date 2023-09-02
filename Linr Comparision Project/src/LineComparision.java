import java.util.Scanner;

public class LineComparision {

    static double length(int x, int y){
        Scanner sc = new Scanner(System.in);
        int x1= 0;
        int y1=0;
        System.out.println("\nValue of X1 and Y1: ("+x1+","+y1+")");
        System.out.println("Value of X2 and Y2: ("+x+","+y+")");

        double xlength= Math.pow(x-x1,2);
        double ylength= Math.pow(y-y1,2);
        double xylength=xlength+ylength;
        double totallength=Math.sqrt(xylength);
        System.out.println("\nLength is : "+totallength);
        return totallength;
    }

    public  double compare(double length1, double length2) {
        double difference =Double.compare(length1,length2);
        System.out.println(difference);
        return difference;
    }

    public static void main(String[] args) {
        System.out.println("Welcome to Line Comparison Computation Program");
        LineComparision obj1= new LineComparision();
        double a=  obj1.length(2,3);
        LineComparision obj2= new LineComparision();
        double b=   obj2.length(6,5);
        System.out.println("To see whether the length of two line are equal or not: "+obj1.equals(obj2));

       LineComparision obj3= new LineComparision();
        System.out.println("-1 = Length 1 is less than length 2" +
                "\n 0 = Length 1 and length 2 is equal" +
                "\n 1 = Length 1 is greater than length 2");
       obj3.compare(a,b);



    }
}
