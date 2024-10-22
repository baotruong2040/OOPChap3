package Ex1;
public class TestMyComplex {
    public static void main(String[] args) {
        // Create instances of MyComplex
        MyComplex c1 = new MyComplex(5.0, 4.0);
        MyComplex c2 = new MyComplex(2.0, 3.0);
        MyComplex c3 = new MyComplex();

        // Test constructors
        System.out.println("c1: " + c1); // Expected: 5.0 + 4.0i
        System.out.println("c2: " + c2); // Expected: 2.0 + 3.0i
        System.out.println("c3: " + c3); // Expected: 0.0 + 0.0i

        // Test getters and setters
        c3.setReal(1.0);
        c3.setImag(1.5);
        System.out.println("c3 after setting values: " + c3); // Expected: 1.0 + 1.5i

        // Test setValue
        c3.setValue(3.0, 3.5);
        System.out.println("c3 after setValue: " + c3); // Expected: 3.0 + 3.5i

        // Test isReal and isImaginary
        System.out.println("c1 is real: " + c1.isReal()); // Expected: false
        System.out.println("c1 is imaginary: " + c1.isImaginary()); // Expected: false

        // Test equals
        System.out.println("c1 equals c2: " + c1.equals(c2)); // Expected: false
        System.out.println("c1 equals (5.0, 4.0): " + c1.equals(new MyComplex(5.0, 4.0))); // Expected: true

        // Test addInto
        c1.addInto(c2);
        System.out.println("c1 after addInto c2: " + c1); // Expected: 7.0 + 7.0i

        // Test addNew
        MyComplex c4 = c1.addNew(c2);
        System.out.println("c4 (result of addNew): " + c4); // Expected: 9.0 + 10.0i

        // Test subtract
        MyComplex c5 = c1.subtract(c2);
        System.out.println("c5 (result of subtract): " + c5); // Expected: 5.0 + 4.0i

        // Test subtractInto
        c1.subtractInto(c2);
        System.out.println("c1 after subtractInto c2: " + c1); // Expected: 5.0 + 4.0i

        // Test divide
        MyComplex c6 = c1.divide(c2);
        System.out.println("c6 (result of divide): " + c6); // Expected: 1.6923076923076923 - 0.5384615384615384i

        // Test magnitude
        System.out.println("Magnitude of c1: " + c1.magnitude()); // Expected: 6.4031242374328485
    }
}
