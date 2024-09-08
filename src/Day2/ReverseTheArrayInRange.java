package Day2;

public class ReverseTheArrayInRange {
    public static void main(String[] args) {
        /*

        Problem Description
        Given an array A of N integers and also given two integers B and C. Reverse the elements of the array A within the given inclusive range [B, C].
        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 109
        0 <= B <= C <= N - 1
        Input Format
        The first argument A is an array of integer.
        The second and third arguments are integers B and C
        Output Format
        Return the array A after reversing in the given range.
        Example Input
        Input 1:
        A = [1, 2, 3, 4]
        B = 2
        C = 3
        Input 2:
        A = [2, 5, 6]
        B = 0
        C = 2
        Example Output
        Output 1:
        [1, 2, 4, 3]
        Output 2:
        [6, 5, 2]
        Example Explanation
        Explanation 1:
        We reverse the subarray [3, 4].
        Explanation 2:
        We reverse the entire array [2, 5, 6].

         */

        /* The program code for the above problem statement is

            public class Solution {
                public int[] solve(int[] A, int B, int C) {            int[] A is the array passed in - B is the starting range and C is the ending range
                    while(B<C){                                        B<C        where B increments until it is less than c and c is decremented until it is greater than B
                        int temp=A[B];                                 It's like swapping method where we use temp to store the A[B] the first B index element of the array
                        int temp1=A[C];                                temp1 stores the A[C] the last index element
                        A[B]=temp1;                                    Assigning the temp1 where the last element is stored, is assigned to A[B] the first index
                        A[C]=temp;                                     Assigning the temp where the first element is stored, is assigned to A[C] the last index and so on
                        B++;                                           B++ after each swap the B pointer moves to the right side
                        C--;                                           C-- after each swap the C pointer moves to the left side
                    }
                    return A;                                           After swapping we are returning the Array A
                }
            }

         */

    }


}
