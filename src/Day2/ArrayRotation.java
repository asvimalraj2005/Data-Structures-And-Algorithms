package Day2;

public class ArrayRotation {
    public static void main(String[] args) {
        /*
        Array Rotation
        Problem Description
        Given an integer array A of size N and an integer B, you have to return the same array after rotating it B times towards the right.
        Problem Constraints
        1 <= N <= 105
        1 <= A[i] <=109
        1 <= B <= 109
        Input Format
        The first argument given is the integer array A.
        The second argument given is the integer B.
        Output Format
        Return the array A after rotating it B times to the right
        Example Input
        Input 1:
        A = [1, 2, 3, 4]
        B = 2
        Input 2:
        A = [2, 5, 6]
        B = 1
        Example Output
        Output 1:
        [3, 4, 1, 2]
        Output 2:
        [6, 2, 5]
        Example Explanation
        Explanation 1:
        Rotate towards the right 2 times - [1, 2, 3, 4] => [4, 1, 2, 3] => [3, 4, 1, 2]
        Explanation 2:
        Rotate towards the right 1 time - [2, 5, 6] => [6, 2, 5]






         */

        /*
        public class Solution {
            public int[] solve(int[] A, int B) {
                int n = A.length;
                // Handle cases where B is greater than the length of the array
                B = B % n;                                              /* if B=17 we can't rotate the array 17 times right ?   n is the length of the array where 17=17%n let's say n=5  0 1 2 3 4 (0-based indexing) 17=17%5  --> 2  if we rotate array 2 times then it will be counted as 17 times rotated >> 5 times of rotation makes the same array where another 5 times array makes the original array that's 10 rotation right remaining 7 rotations where another 5 times of rotation will takes place and 2 rotation so there will be 17 rotations but if we the formula B=B%n it minimizes the rotation

                // Reverse the entire array                             /* given array 1 2 3 4 5  after reverse 5 4 3 2 1
                reverse(A, 0, n - 1);
                // Reverse the first B elements                         /* first B elements reverse 5 4 3 2 1  -> 4 5 3 2 1
                reverse(A, 0, B - 1);
                // Reverse the remaining elements                       /* remaining n elements reverse 4 5 1 2 3
                reverse(A, B, n - 1);
                return A;
            }

            private void reverse(int[] A, int start, int end) {         /* This method normally reverse the array
                 while (start < end) {
                     int temp = A[start];
                     A[start] = A[end];
                     A[end] = temp;
                     start++;
                     end--;
                 }
            }
         }
         */
    }
}
