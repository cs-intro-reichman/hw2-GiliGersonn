public class CalcPi {
    public static void main(String [] args) {
        
        int numTerms = Integer.parseInt(args[0]);
        double sum = 0.0;

        for (int i = 0; i < numTerms; i++) {
            
            double denominator = 2 * i + 1;
            double term = 1.0 / denominator;

            if (i % 2 == 0) {
                sum += term;
            } else {
                sum -= term;
            }
        }

        double finalSum = sum * 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + finalSum);
    }
}