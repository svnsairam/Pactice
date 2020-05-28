class IB_Greatest_Common_Divisor{
    public static void main(String[] args) {
        
    }
    public int gcd(int A, int B) {
        int big = A;
        int small = B;
        if(A<B){
            big=B;
            small = A;
        }
        for(int i=small;i>=1;i--){
            if(big%i==0 && small%i==0){
                return i;
            }
        }
        // If small = 0;
        return big;
    }
}