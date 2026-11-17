public class Assignment01Q02 {
    public static void main(String[] args) {
        double actualPi = Math.PI;
        double approxPi = 0;
        int sign = 1;

        for (int i = 1; i < Integer.parseInt(args[0]) * 2; i += 2) {
            approxPi = approxPi + ((sign * 1.0) / i); 
            sign = -sign;
        }
        
        System.out.println((4 * approxPi) + " " + actualPi);
    }
}
