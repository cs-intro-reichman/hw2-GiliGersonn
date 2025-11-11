public class CalcPi {
    public static void main(String [] args) { 
        int num = Integer.parseInt(args[0]);
        int denominator1 = 1;
        int denominator2 = 3;
        int numerator = 1;
        double totalSum = 0.0;

        for (int i = 1; i < num; i += 2) {
            totalSum += (double) numerator / denominator1;
            denominator1 += 4;
        }

        for (int i = 0; i < num; i += 2) {
            totalSum -= (double) numerator / denominator2;
            denominator2 += 4;
        }

        double finalSum = ( totalSum) * 4;

        System.out.println("pi according to Java: " + Math.PI);
        System.out.println("pi, approximated: " + finalSum);
    }
}






