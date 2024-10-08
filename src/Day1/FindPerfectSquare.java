package Day1;

public class FindPerfectSquare {
    public static void main(String[] args) {
        /*

        Find Perfect Numbers
        Problem Description
        You are given an integer A. You have to tell whether it is a perfect number or not.
        Perfect number is a positive integer which is equal to the sum of its proper positive divisors.   (Read this line carefully)
        A proper divisor of a natural number is the divisor that is strictly less than the number.        (Read this line carefully)
        Problem Constraints
        1 <= A <= 106
        Input Format
        First and only argument contains a single positive integer A.
        Output Format
        Return 1 if A is a perfect number and 0 otherwise.
        Example Input
        Input 1:
        A = 4
        Input 2:
        A = 6
        Example Output
        Output 1:
        0
        Output 2:
        1
        Example Explanation
        Explanation 1:
        For A = 4, the sum of its proper divisors = 1 + 2 = 3, is not equal to 4.
        Explanation 2:
        For A = 6, the sum of its proper divisors = 1 + 2 + 3 = 6, is equal to 6.
        */

        /*
            public class Solution {
                public int solve(int A) {
                    int Sum=0;
                    for(int i=1;i<A;i++){            from i=1 to i<A
                        if(A%i==0){                  where each A%i==0 will makes the sum=sum+i
                            Sum=Sum+i;
                        }
                    }
                    if(Sum==A){                      if Sum==A return 1 otherwise 0
                        return 1;
                    }else{
                        return 0;
                   }
                }
            }
         */
    }
}
