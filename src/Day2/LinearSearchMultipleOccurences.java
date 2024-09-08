package Day2;

public interface LinearSearchMultipleOccurences {
    public static void main(String[] args){
        /*
        Linear Search - Multiple Occurences
        Problem Description
        Given an array A and an integer B, find the number of occurrences of B in A.
        Problem Constraints
        1 <= B, Ai <= 109
        1 <= length(A) <= 105
        Input Format
        Given an integer array A and an integer B.
        Output Format
        Return an integer, number of occurrences of B in A.
        Example Input
        Input 1:
        A = [1, 2, 2], B = 2
        Input 2:
        A = [1, 2, 1], B = 3
        Example Output
        Output 1:
        2
        Output 2:
        0
        Example Explanation
        Explanation 1:
        Element at index 2, 3 is equal to 2 hence count is 2.
        Explanation 2:
        There is no element equal to 3 in the array.
        */


        /*
        public class Solution {
            public int solve(int[] A, int B) {            Array A is passed , and integer B
                int count=0;                              Count=0 is initialized to count the no of occurences in B
                for(int i=0;i<A.length;i++){              Loop is started from 1 to A.length
                    if(A[i]==B){                          A[i]==B   iterating elements of A is equal to B
                        count++;                          Then we increment the count
                    }
                }
                return count;                             return the count after the loop ends
            }
        }
         */
    }
}
