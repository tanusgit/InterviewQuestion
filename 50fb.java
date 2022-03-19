class Solution {
    public double myPow(double x, long n) {
        double res = 0.0;
        if(n == 0){
            return 1.0;
        }
        else if(n == 1){
            res = x;
            return res;
        }
        boolean neg = false;
        if(n < 0){
            n = n *-1;
            neg = true;
            /*if(n %2 == 0){
                res = myPow(x, n/2) * myPow(x, n/2);
                return 1/res;
            }else{
                 res = x *myPow(x, n/2) * myPow(x, n/2);
                 return 1/res;
            }*/
           
        }
        if(n % 2 == 0){
            double res1 = myPow(x, n/2);
            res = res1*res1;
            
        }
        else{
            double res1 = myPow(x, n/2);
            res = x * res1*res1;   
        }
        if(neg){
            return 1/res;
        }
        return res;
    }
}
