package Day3;

public class EquilibriumIndex {
    /*

    Equilibrium index of an array
    Problem Description
    You are given an array A of integers of size N.
    Your task is to find the equilibrium index of the given array
    The equilibrium index of an array is an index such that the sum of elements at lower indexes is equal to the sum of elements at higher indexes.
    If there are no elements that are at lower indexes or at higher indexes, then the corresponding sum of elements is considered as 0.
    Note:
    Array indexing starts from 0.
    If there is no equilibrium index then return -1.
    If there are more than one equilibrium indexes then return the minimum index.
    Problem Constraints
    1 <= N <= 105
    -105 <= A[i] <= 105
    Input Format
    First arugment is an array A .
    Output Format
    Return the equilibrium index of the given array. If no such index is found then return -1.
    Example Input
    Input 1:
    A = [-7, 1, 5, 2, -4, 3, 0]
    Input 2:
    A = [1, 2, 3]
    Example Output
    Output 1:
    3
    Output 2:
    -1
    Example Explanation
    Explanation 1:
    i   Sum of elements at lower indexes    Sum of elements at higher indexes
    0                   0                                   7
    1                  -7                                   6
    2                  -6                                   1
    3                  -1                                  -1
    4                   1                                   3
    5                  -3                                   0
    6                   0                                   0
    3 is an equilibrium index, because:
    A[0] + A[1] + A[2] = A[4] + A[5] + A[6]
    Explanation 1:
    i   Sum of elements at lower indexes    Sum of elements at higher indexes
    0                   0                                   5
    1                   1                                   3
    2                   3                                   0
    Thus, there is no such index.

         */

    /*
    public class Solution {
        public int solve(int[] A) {
            int N = A.length;
            if (N < 3) return -1; // Not enough elements to have any valid index

            int[] pf = new int[N]; // Prefix sum array       -> Prefix sum where we are summing up the elements from 1st index to Nth index
            int[] bf = new int[N]; // Suffix sum array       -> Suffix sum where we are summing up the elements from Nth index to 0th index

            // Compute prefix sums                           -> Prefix sum computing method what i can say think about it like 1st over 2nd over 3rd over 4th over 5th over 6th over okay
            pf[0] = A[0];                                                                                                       0 runs   10 runs  15 runs  30 runs  30 runs  35 runs
            for (int i = 1; i < N; i++) {                                                                                       i need the runs scored in 4 th over so at the end of the third over-(minus)fourth over runs i.e 15-30= 15 runs has been scored in 4th over
                pf[i] = pf[i - 1] + A[i];                                                                                       i need the runs scored between 4 and 6 th over only   ->  the scores from 4th over to over 6 th over is 35 is already calculated right ? so we have to subtract the 3rd over runs scored to the score of the sixth over
            }                                                                                                                   35-15=20 runs

            // Compute suffix sums                           -> 7 6 4 6 5
            bf[N - 1] = A[N - 1];                            -> 5+6 at N-2 and so on
            for (int i = N - 2; i >= 0; i--) {
                bf[i] = bf[i + 1] + A[i];
            }

            // Find the equilibrium index
            for (int i = 0; i < N; i++) {
                int Lsum = (i > 0) ? pf[i - 1] : 0; // Sum of elements to the left of i     -> Usage of ternary operator Condition ? Value_if_true : Value_if_false
                int Rsum = (i < N - 1) ? bf[i + 1] : 0; // Sum of elements to the right of i

                if (Lsum == Rsum) {
                    return i;
                }
            }

            return -1; // No equilibrium index found
        }
    }



     */
}
