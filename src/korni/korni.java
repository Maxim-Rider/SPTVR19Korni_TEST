package korni;
import java.util.Scanner;

public class korni {
public static double[] calc(double a, double b, double c) {
    double d = b * b - 4 * a * c;
    System.out.println();
    System.out.println("Дискриминант: " + d);
    if (d > 0) {
            return new double[]
            {(-b + Math.sqrt(d)) / (2 * a),
            (-b - Math.sqrt(d)) / (2 * a)};
    } 
    else 
        if (d == 0) {
            return new double[]
            {(-b / (2 * a)),
              (-b / (2 * a))};
    } 
        else {
            return null;
        }  
}

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        boolean running = true;
        while(running){
            try {
                String s;
                System.out.println("Введите A ");
                s=scan.next(); 
                double A=Double.parseDouble(s);
                System.out.println("Введите B ");
                s=scan.next();
                double B=Double.parseDouble(s);
                System.out.println("Введите C ");
                s=scan.next(); 
                double C=Double.parseDouble(s);
                double[] result = calc(A,B,C);
                if (result!=null)
                    System.out.println("Корни: x1="+result[0] +"; " + "x2= "+result[1]);
                else
                    System.out.println("Корней нет ");
                }
                catch (NumberFormatException e) {
                    System.out.println("Неправильный формат ввода, повторите ещё");
               // continue;
                }
            }
        }
    }
