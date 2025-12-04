/*OUTPUT:
Activity 0 -> (1, 2)
Activity 1 -> (3, 4)
Activity 3 -> (5, 7)
Activity 4 -> (8, 9) */
public class Greedy1 {
    public static void main(String[] args) {
        int[] start = {1, 3, 0, 5, 8, 7};
        int[] end   = {2, 4, 6, 7, 9, 9};
        int n = start.length;
        System.out.println("Activity 0 -> (" + start[0] + ", " + end[0] + ")");
        int lastEnd = end[0];
        for (int i = 1; i < n; i++) {
            if (start[i] >= lastEnd) {   
                System.out.println("Activity " + i + " -> (" + start[i] + ", " + end[i] + ")");
                lastEnd = end[i];
            }
        }
    }
}