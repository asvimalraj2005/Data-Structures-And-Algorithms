package Day3;

public class In_PlacePrefixSum {
    public static void main(String[] args) {
        /*

        In-place Prefix Sum
        Problem Description
        Given an array A of N integers. Construct prefix sum of the array in the given array itself.
        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 103
        Input Format
        Only argument A is an array of integers.
        Output Format
        Return an array of integers denoting the prefix sum of the given array.
        Example Input
        Input 1:
        A = [1, 2, 3, 4, 5]
        Input 2:
        A = [4, 3, 2]
        Example Output
        Output 1:
        [1, 3, 6, 10, 15]
        Output 2:
        [4, 7, 9]
        Example Explanation
        Explanation 1:
        The prefix sum array of [1, 2, 3, 4, 5] is [1, 3, 6, 10, 15].
        Explanation 2:
        The prefix sum array of [4, 3, 2] is [4, 7, 9].
         */

        /* The program code for above statement

            public class Solution {
                public int[] solve(int[] A) {           -> The array is give an input
                    int N=A.length;                     -> N variable stores the lenght of the Array A
                    for(int i=1;i<N;i++){               -> we are updating the same array where we are leaving the first element of the array as it is and then we are summing up the first element and the second element and keeping them on the second index
                        A[i]=A[i-1]+A[i];               -> i.e   1 2 3 4 5 6
                    }                                            1          1  leaving the array as it is where we keeping the oth index element unchanged for the calculation purpose
                    return A;                                    1+2 > 3    1 3
                }                                                3+3 > 6    1 3 6
            }                                                    6+4 > 10   1 3 6 10
                                                                 10+5 > 15  1 3 6 10 15
                                                                 15+6 > 21  1 3 6 10 15 21
         */
    }
}
