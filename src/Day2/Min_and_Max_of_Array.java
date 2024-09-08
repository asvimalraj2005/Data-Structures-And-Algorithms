package Day2;

public class Min_and_Max_of_Array {
    public static void main(String[] args) {
        /*

        Max Min of an Array
        Problem Description
        Given an array A of size N. You need to find the sum of Maximum and Minimum element in the given array.
        Problem Constraints
        1 <= N <= 105
        -109 <= A[i] <= 109
        Input Format
        First argument A is an integer array.
        Output Format
        Return the sum of maximum and minimum element of the array
        Example Input
        Input 1:
        A = [-2, 1, -4, 5, 3]
        Input 2:
        A = [1, 3, 4, 1]
        Example Output
        Output 1:
        1
        Output 2:
        5
        Example Explanation
        Explanation 1:
        Maximum Element is 5 and Minimum element is -4. (5 + (-4)) = 1.
        Explanation 2:
        Maximum Element is 4 and Minimum element is 1. (4 + 1) = 5.
        */

        /* The program code for the above problem statement


            public class Solution {
                public int solve(int[] A) {
                    int Max=A[0];                            Max int variable will have the A[0] value that is first oth index value of the Array A
                    for(int i=0;i<A.length;i++){             From i=0 from first index we are checking to the A.length which is the total length (1-based indexing i.e length)
                        if(Max<A[i]){                        If condition checking whether the Max variable is smaller than the iteration elements if Max variable is smaller than the iterating elements
                            Max=A[i];                        then we are assigning the interated element which is smaller than the Max element to the Max element itself
                        }
                    }

                    int Min=A[0];                            Min variable does have assigned value of the A[0] i.e first 0th element of the array A
                    for(int i=0;i<A.length;i++){             from i=0 to i<A.length
                        if(Min>A[i]){                        Min variable does the first element of array A > Iterating element
                            Min=A[i];                        if the iterating element is smaller than the Min, then we are assigning the iterating element to the Min itself
                        }
                    }
                    return Max+Min;
                }
            }






         */
    }
}
