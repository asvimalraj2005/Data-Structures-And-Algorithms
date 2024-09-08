package Day2;

public class SecondLargestElement {
    public static void main(String[] args) {


        /*

        Second Largest
        Problem Description
        You are given an integer array A. You have to find the second largest element/value in the array or report that no such element exists.
        Problem Constraints
        1 <= |A| <= 105
        0 <= A[i] <= 109
        Input Format
        The first argument is an integer array A.
        Output Format
        Return the second largest element. If no such element exist then return -1.
        Example Input
        Input 1:
        A = [2, 1, 2]
        Input 2:
        A = [2]
        Example Output
        Output 1:
        1
        Output 2:
        -1
        Example Explanation
        Explanation 1:
        First largest element = 2
        Second largest element = 1
        Explanation 2:
        There is no second largest element in the array.
         */
        /*

        public class Solution {
            public int solve(int[] A) {
                int Max=A[0];                   -> Assigning the first element of the array to the Max variable
                int index=0;                    -> index variable is used to get the index of the Max element
                if(A.length==1){                Unwanted lines 1
                    return -1;                                 2
                }                                              3
                for(int i=0;i<A.length;i++){    -> Initializing the for loop
                    if(Max<A[i]){               -> To check if the Max element is lesser than the iterating element than we should update the Max element
                        Max=A[i];               -> Update is done here
                        index=i;                -> Assigning the index variable the Max element index
                    }
                }
                int SecondMax=0;                -> Initializing the second max = 0
                boolean found=false;            -> Initializing the boolean found = false
                for(int i=0;i<A.length;i++){    -> For loop again
                    if(SecondMax<A[i] &&  A[i]<Max && index!=i){    -> Condition checks if SecondMax is < A[i] (iterating elements) and A[i] (iterating elements) < Max element and the index variable is not equal to i index ( the same num does not to be considered as secondmax
                        SecondMax=A[i];         -> Assigning the secondMax=A[i]
                        found=true;             -> found=true -- exiting the loop

                    }
                }
                if(!found){                     -> !found returning -1
                    return -1;
                }
                return SecondMax;               -> else conditioning >> returning SecondMax
            }
        }

         */
    }
}
