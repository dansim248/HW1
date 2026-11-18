import java.util.Arrays;

public class Assignment01Q04 {
    public static int[] rightShift(int[] array) {
        int last = array[array.length - 1];

        for (int i = array.length - 1; i >= 1; i--) {
            array[i] = array[i - 1];
        }
        array[0] = last;

        return array;
    }

    public static int[] shiftArrayCyclic(int[] array, int move, char direction) {
        if ((direction != 'L' && direction != 'R') || array.length == 0) {
            return array;
        }

        int n = array.length;

        // shifting left by move is identicle to shifting right by -move 
        int shift = (direction == 'R' ? move : -move) % n;
        if (shift < 0) {
            shift += n;
        }

       int[] copy = array.clone();

        for (int i = 0; i < n; i++) {
            array[(i + shift) % n] = copy[i];
        }

        return array;
    }

    public static void main(String[] args) {
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -1, 'R'))); // [2, 3, 4, 5, 1]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'R'))); // [5, 1, 2, 3, 4]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 1, 'r'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -2, 'g'))); // [1, 2, 3, 4, 5]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, 3, 'L'))); // [4, 5, 1, 2, 3]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{1, 2, 3, 4, 5}, -3, 'L'))); // [3, 4, 5, 1, 2]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{0, 8, 9, 5, 6}, 6, 'L'))); // [8, 9, 5, 6, 0]
        System.out.println(Arrays.toString(
            shiftArrayCyclic(new int[]{}, 3, 'R'))); // []
    }
}