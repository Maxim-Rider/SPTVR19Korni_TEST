
package korni;

import java.util.Scanner;

public class korni {

public static double[] arvutus(double a, double b, double c) {
    double d = b * b - 4 * a * c;
    if (d > 0) {
            return new double[]//возвращает массив из 2-х зн-й
            {(-b + Math.sqrt(d)) / 2 / a,
            (-b - Math.sqrt(d)) / 2 / a};
    } 
    else 
        if (d == 0) {
            return new double[] //возвращает массив из 1-го зн-я
            {(-b / 2 / a),
              (-b / 2 / a)};
            
    } 
        else {
            return null; //возвращает пустое значение
        }
}
    
    public static void main(String[] args) {
       Scanner scan=new Scanner(System.in);
       String s;
                System.out.println("Введите A ");
          s=scan.next(); //ввод с клавиатуры открыт
        double A=Double.parseDouble(s);  //string -> integer
        
        System.out.println("Введите B ");
          s=scan.next(); //ввод с клавиатуры открыт
       
       double B=Double.parseDouble(s);  //string -> integer
       
      
          System.out.println("Введите C ");
          s=scan.next(); //ввод с клавиатуры открыт
      
       double C=Double.parseDouble(s);  //string -> integer
    
        double tulemus[] = arvutus(A,B,C);
        if (tulemus!=null)
        System.out.println("x1="+tulemus[0]+"  x2= "+tulemus[1]);
        else
            System.out.println("Корней нет ");
    }
    
}
