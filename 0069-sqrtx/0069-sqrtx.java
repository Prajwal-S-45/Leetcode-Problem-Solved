class Solution {
    public int mySqrt(int x) {
        int l = 0, r = x;
        int result = 0;
        while(l <= r){
            int mid = l + (r - l)/2;
            long sqrt = (long)mid * mid;

            if(sqrt == x){
                return mid;
            }
            else if(sqrt < x){
                    result = mid;
                    l = mid + 1;
            }
            else
                r = mid - 1;
        }
        return result;
    }
}