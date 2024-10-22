package Ex1;
import java.util.*;
public class main {
    public static void main(String[] args) {
        System.out.print("\033[H\033[2J");//clear console
        System.out.flush();
        Scanner scanner = new Scanner(System.in);
        MyComplex c1 = new MyComplex();
        MyComplex c2 = new MyComplex();
        System.out.print("Enter complex number 1 (real and imaginary part): ");
        c1.setValue(scanner.nextDouble(), scanner.nextDouble());
        System.out.print("Enter complex number 2 (real and imaginary part): ");
        c2.setValue(scanner.nextDouble(), scanner.nextDouble());
        System.out.println("Number 1 is: "+ c1);
        // pure real or imag

        if(c1.isReal()){
            System.out.println(c1+"  is a pure real number");
        }else {
            System.out.println(c1+" is NOT a pure real number");
        }

        if (c1.isImaginary())  {
            System.out.println(c1+" is a pure imaginary number");
        }else {
            System.out.println(c1+" is NOT a pure imaginary number");
        }
        System.out.println();
        
        System.out.println("Number 2 is: "+c2);
        if(c2.isReal()){
            System.out.println(c2+"  is a pure real number");
        }else {
            System.out.println(c2+" is NOT a pure real number");
        }

        if (c2.isImaginary())  {
            System.out.println(c2+" is a pure imaginary number");
        }else {
            System.out.println(c2+" is NOT a pure imaginary number");
        }
        System.out.println();
        //equal
        if (c1.equals(c2)) {
            System.out.println(c1+" is equal to "+c2);
        }else {
            System.out.println(c1+ " is NOT equal to "+c2);
        }
        
        MyComplex c3 = c1.addNew(c2);
        System.out.println(c1+ " + "+c2+" = "+c3);
        System.out.println(c1);
    }
}
