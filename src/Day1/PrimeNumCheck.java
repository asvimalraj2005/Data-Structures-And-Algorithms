package Day1;

public class PrimeNumCheck {
    public static void main(String[] args) {
        /*
        IsPrime
        Problem Description
        Given a number A. Return 1 if A is prime and return 0 if not.
        Note :
        The value of A can cross the range of Integer.
        Problem Constraints
        1 <=A <= 109
        Input Format
        The first argument is a single integer A.
        Output Format
        Return 1 if A is prime else return 0.
        Example Input
        Input 1:
        A = 5
        Input 2:
        A = 10
        Example Output
        Output 1:
        1
        Output 2:
        0
        Example Explanation
        Explanation 1:
        5 is a prime number.
        Explanation 2:
        10 is not a prime number.
        */

        /* For every prime number the factors will be 2 right ?
           1 and the number itself
           eg: 17
           1 and 17 the number itself can be divided by same number to get the remainder as 0 right ?
           17%1==0 True
           17%17==0 True
        */

        /*

            public class Solution {
                public int countFactor(int I) {             /* countFactor method is initialized here where A is passed as I in here
                    int ans = 0;                            /* ans variable type of int has been initialized as 0 to count the factors
                    for (int i = 1; i * i <= I; i++) {      /* i=1 i*i<=A or I same as countFactors but in here
                    if (I % i == 0) {                       /* i*i==I will be assumed as perfect square so ans=ans+1
                        if (i * i == I) {                   /* Otherwise ans=ans+2 because the condition i and I/i are both the factors of the given number
                            ans += 1; // Perfect square case/* perfect square num won't be prime
                        } else {
                            ans += 2; // i and I/i are both factors
                        }
                    }
                }
                return ans;
            }

            public int solve(int A) {
                if (countFactor(A) == 2) {                   /* The given number A is passed in where countFactor is the function to check whether the given number is prime or not by checking the condition ==2 if the given number is has factors of 2 then it is prime right ? if not ? then return false or return 0 accordingly
                    return 1; // Prime number
                } else {
                    return 0; // Not a prime number
            }
            }
            }


        */
    }
}
