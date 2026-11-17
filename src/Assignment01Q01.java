public class Assignment01Q01 {
    public static void main(String[] args) {
        for (String str : args) {
            char firstChar = str.charAt(0);
            int charAsciiVal = (int) firstChar;
            if (charAsciiVal % 5 == 0) {
                System.out.println(firstChar);
            }
        }
    }
}
