package Ex2;

public class main {
    public static void main(String[] args) {
        MyPolynomial p1 = new MyPolynomial(1.1, 2.2, 3.3);
        double[] coeffs = {1.2, 3.4, 5.6, 7.8};
        MyPolynomial p2 = new MyPolynomial(coeffs);

        System.out.println(p1);
        System.out.println(p2.evaluate(3));

        System.out.println(p1.add(p2));
        System.out.println(p2.multiply(p1));
    }
}
