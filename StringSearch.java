public class StringSearch {
    public static void main(String[] args) {

        String str = "abcdacbacabcdbcdabca";
        String target = "abc";

        int n = str.length();
        int m = target.length();

        for (int i = 0; i <= n - m; i++) {
            int j = 0;

            // Check each character
            while (j < m && str.charAt(i + j) == target.charAt(j)) {
                j++;
            }

            // If full match of target found
            if (j == m) {
                System.out.println("Found at index: " + i);
            }
        }
    }
}
