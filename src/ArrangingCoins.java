public class ArrangingCoins {
        public int arrangeCoins(int n) {

            //sum of 1 to m = m(m+1)/2
            // which means if 2 rows then 2*3/2 is the number of coins = 3

            long left = 1;
            long right = n;

            long k;
            long curr;
            while(left<= right){
                k = left + (right-left)/2;   // mid row
                curr = k*(k+1)/2;            // number of coins used till mid row

                if(curr==n){
                    return (int)k;
                }
                if(n<curr){             // which means the sum of coins needed for that row is more than actual coins available, so we move to the previous row
                    right = k-1;
                }
                else {
                    left = k+1;
                }
            }
            return (int)right;   // doubt on what to return
        }
}

/*
You have n coins and you want to build a staircase with these coins. The staircase consists of k rows where the ith row has exactly i coins. The last row of the staircase may be incomplete.

Given the integer n, return the number of complete rows of the staircase you will build.

Input: n = 5
Output: 2
Explanation: Because the 3rd row is incomplete, we return 2.

*/

