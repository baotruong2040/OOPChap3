package Ex2;
public class MyPolynomial {
    private double[] coeffs;

    public MyPolynomial(double... coeffs) {
        this.coeffs = coeffs;
    }
    public int getDegree() {
        return coeffs.length -1;
    }
    public String toString() {
        StringBuilder sb = new StringBuilder();

        for (int i = coeffs.length-1; i>= 0; i--) {
            if (coeffs[i] != 0) {
                if (i != coeffs.length-1  && coeffs[i] >0){
                    sb.append("+");
                }
                sb.append(coeffs[i]);
                if (i>0) {
                    sb.append("x");
                    if (i>1) {
                        sb.append("^").append(i);
                    }
                }
                sb.append(" ");
            }
        }
        return sb.toString().trim();
    }
    public double evaluate(double x) {
        double result = 0;
        for (int i = 0; i< coeffs.length; i++) {
            result += coeffs[i]*Math.pow(x, i);
        }
        return result;
    }
    //copilot
    public MyPolynomial add(MyPolynomial right) {
        int maxDegree = Math.max(this.getDegree(), right.getDegree());
        double[] resultCoeffs = new double[maxDegree+1];
        for (int i = 0; i < maxDegree; i++) {
            double thisCoeff = (i <= this.getDegree()) ? this.coeffs[i] : 0;
            double rightCoeff = (i <= right.getDegree()) ? right.coeffs[i] : 0;
            resultCoeffs[i] = thisCoeff + rightCoeff;
            }
            return new MyPolynomial(resultCoeffs);

    }
    //copilot
    public MyPolynomial multiply(MyPolynomial right) {
        int newDegree = this.getDegree() + right.getDegree();
        double[] resultCoeffs = new double[newDegree + 1];

        for (int i = 0; i <= this.getDegree(); i++) {
            for (int j = 0; j <= right.getDegree(); j++) {
                resultCoeffs[i + j] += this.coeffs[i] * right.coeffs[j];
            }
        }

        return new MyPolynomial(resultCoeffs);
    }
}