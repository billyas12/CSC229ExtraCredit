public class Triangle {
    public static long countNonDivisible(int numRows) {
        long[][] triang = new long[numRows][numRows];
        long count = 0;

        for (int i = 0; i < numRows; i++) {
            triang[i][0] = 1;
            triang[i][i] = 1;

            for (int j = 1; j < i; j++) {
                triang[i][j] = triang[i - 1][j - 1] + triang[i - 1][j];
                if (triang[i][j] % 7 != 0) {
                    count++;
                }
            }
        }

        return count;
    }

    public static void main(String[] args) {
        int numRows = 1000000000;
        long result = countNonDivisible(numRows);
        System.out.println("Number of entries that are not divisible by 7: " + result);
    }
}
//Time: O(n^2)
//Space: O(n^2)