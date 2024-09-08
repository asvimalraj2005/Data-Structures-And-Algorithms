package Day2;

public class CountOfElements {
    public static void main(String[] args) {
        /*
        Count of elements
        Problem Description
        Given an array A of N integers.
        Count the number of elements that have at least 1 elements greater than itself.
        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <= 109
        Input Format
        First and only argument is an array of integers A.
        Output Format
        Return the count of elements.
        Example Input
        Input 1:
        A = [3, 1, 2]
        Input 2:
        A = [5, 5, 3]
        Example Output
        Output 1:
        2
        Output 2:
        1
        Example Explanation
        Explanation 1:
        The elements that have at least 1 element greater than itself are 1 and 2
        Explanation 2:
        The elements that have at least 1 element greater than itself is 3
        */

        /*
        public class Solution {
            public int solve(int[] A) {
                int Min_Value=A[0];
                for(int i=0;i<A.length;i++){
                    if(A[i]>Min_Value){
                        Min_Value=A[i];
                    }
                }
                int count=0;
                for(int i=0;i<A.length;i++){
                    if(Min_Value>A[i]){
                        count++;
                    }
                }
                return count;
            }
        }
         */
    }
}
