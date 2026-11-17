public class Assignment01Q03 {
    public static void main(String[] args) {
        int x = Integer.parseInt(args[0]);
        System.out.println("The first " + x + " Fibonacci numbers are:");

        int prev = 1;
        int curr = 1;
        int next = 1;

        System.out.print("1 1 ");
        
        int numOdd = 2; // the sequence must start with 2 ones, which are odd 
        for (int i = 2; i < x; i++) {
            next = prev + curr;

            if (next % 2 == 1) {
                numOdd++;
            }

            System.out.print(next);
            if (i < x - 1) 
                System.out.print(" "); // Make sure we don't print a trailing space
            prev = curr;
            curr = next;
        }
        System.out.println();
        
        ////////////////////////////////////////////////////////////////
        
        System.out.println("The number of odd numbers is: " + numOdd);
    }
}
