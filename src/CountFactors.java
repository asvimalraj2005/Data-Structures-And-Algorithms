public class CountFactors {
    public static void main(String[] args) {
        /*Problem Description
        Given an integer A, you need to find the count of it's factors.
        Factor of a number is the number which divides it perfectly leaving no remainder.
        Example : 1, 2, 3, 6 are factors of 6
        Problem Constraints
        1 <= A <= 109
        Input Format
        First and only argument is an integer A.
        Output Format
        Return the count of factors of A.
        Example Input
        Input 1:
        5
        Input 2:
        10
        Example Output
        Output 1:
        2
        Output 2:
        4
        Example Explanation
        Explanation 1:
        Factors of 5 are 1 and 5.
        Explanation 2:
        Factors of 10 are 1, 2, 5 and 10.*/

       /* public class Solution {
            public int solve(int A) {
                int cont=0;
                for(int i=1;i*i<=A;i++){
                    if(A%i==0){
                        if(i*i==A){
                            cont=cont+1;
                        }else{
                            cont=cont+2;
                        }
                    }
                }
                return cont;

            }
        }                    */

        /*   https://airlock-on-edge.woolf.university/?url=https%3A%2F%2Fscaler-production-new.s3.ap-southeast-1.amazonaws.com%2Fattachments%2Fattachments%2F000%2F199%2F557%2Foriginal%2FIntrotoproblemsolving.pdf%3FX-Amz-Algorithm%3DAWS4-HMAC-SHA256%26X-Amz-Credential%3DAKIAIDNNIRGHAQUQRWYA%252F20240907%252Fap-southeast-1%252Fs3%252Faws4_request%26X-Amz-Date%3D20240907T160449Z%26X-Amz-Expires%3D561600%26X-Amz-SignedHeaders%3Dhost%26X-Amz-Signature%3Dc593d28680186340d8bf2666f8cccf42cad0395444c7766c9088c8d0d9136f0b&resourceId=b3f244dd-0916-4fc7-b591-c3c70f5b7a55&studentId=386ab523-1b82-458d-b199-5c0db15b82ac&token=eyJhbGciOiJIUzI1NiJ9.eyJpZCI6IjM4NmFiNTIzLTFiODItNDU4ZC1iMTk5LTVjMGRiMTViODJhYyIsImlzcyI6InVybjpXb29sZlVuaXZlcnNpdHk6c2VydmVyL3NlcnZpY2UvYWNjZXNzIiwiaXNWZXJpZmllZCI6dHJ1ZSwia2luZCI6Im9hdXRoIiwib3JnIjp7Imdyb3VwcyI6W10sImlkIjoiOWIxN2Y1Y2UtMTA3OC00ZmRmLWFlYzAtMDJiZjRlY2ZiMGE2In0sInNjb3BlIjoiKiJ9.VERfiE0i5BwCKYFS52KY8QtDX-x-MT_vVQW7lfpGsxY */
        /*   View the above notes to get an inside about the above code */
        /*   Yes we can use naive for the given problem where you can check for the all the given number is divisible or not but the naive solution will O(n) which will be a worst case
        /*   The above code makes the O(n) to O(sqrt(n)) it optimizes the code
        /*   i*i<=A    from 1 to the number itself where it is lesser than A
             like A=25
             1*1=1 1<=25 25%1==0 i*i==25 no else cont=2
             2*2=4 4<=25 25%2==0 no condition fails
             3*3=9 9<=25 25%3==0 no condition fails
             4*4=16 16<=25 25%4==0 no condition fails
             5*5=25 25<=25 25%5==0 condition becomes true 5*5==25 cont=2 + 1 now cont will become 3
             i.e 1 is divisor of 25 , 5 is divisor of 25 and 25 itself is the divisor of 25.
             So there will be 3 factors for the number 25
         */






    }
}
