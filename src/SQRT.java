public class SQRT {

        public int mySqrt(int x) {

            if(x<2){
                return x;   // the square root of 1 is 1
            }

            int mid;
            int left = 2;
            int right = x/2;  // for x>=2, the square root is always smaller than x/2, therefore search before x/2

            while(left<=right){
                mid = left + (right-left)/2;
                long square=(long)mid*mid;   // storing square of mid -- USE LONG, otherwise will fail in case of long interger inputs

                if(square>x){
                    right=mid-1;
                }
                else if(square<x){
                    left=mid+1;
                }
                else return mid;
            }
            return right;
        }
}


/*
Given a non-negative integer x, compute and return the square root of x.

Since the return type is an integer, the decimal digits are truncated, and only the integer part of the result is returned.

Note: You are not allowed to use any built-in exponent function or operator, such as pow(x, 0.5) or x ** 0.5.
*/

