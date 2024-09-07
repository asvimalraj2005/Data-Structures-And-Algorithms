package Day1;

public class CountPrimes {
    public static void main(String[] args) {
        /*
        Count of primes
        Problem Description
        You will be given an integer n. You need to return the count of prime numbers less than or equal to n.
        Problem Constraints
        0 <= n <= 10^3
        Input Format
        Single input parameter n in function.
        Output Format
        Return the count of prime numbers less than or equal to n.
        Example Input
        Input 1:
        19
        Input 2:
        1
        Example Output
        Output 1:
        8
        Output 2:
        0
        Example Explanation
        Explanation 1:
        Primes <= 19 are 2, 3, 5, 7, 11, 13, 17, 19
        Explanation 2:
        There are no primes <= 1
         */

        /* Program for the above problem statement
            public class Solution {
                public int CountFactor(int I){
                int ans=0;
                for(int i=1;i*i<=I;i++){
                    if(I%i==0){
                        if(i*i==I){
                            ans+=1;
                        }else{
                            ans+=2;
                        }
                    }
                }
                return ans;
            }

            public int solve(int A) {
                int Count=0;
                for(int i=1;i<=A;i++){                                  /* same as PrimeNumcheck their we are checking if is prime or not but here we are checking from 1 to the given number N if any number is prime between those we are counting them by using count variable
                    if(CountFactor(i)==2){
                        Count++;
                    }
                }
                return Count;
             }
           }

         */
    }
}

