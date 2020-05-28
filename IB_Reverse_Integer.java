class IB_Reverse_Intege{
    public static void main(String[] args) {
        
    }
    public int reverse(int A) {
        if(A>0){
            int numOfDigits = calculateNoOfDigits(A);
            long result=0;
            while(numOfDigits>0){
                numOfDigits--;
                result = (long) (result + (A % 10) * Math.pow(10, numOfDigits));
                A=A/10;
                if(result>Integer.MAX_VALUE){
                    result=0;
                    break;
                }
            }
            return (int)result;
        }else{
            A=A*-1;
            int numOfDigits = calculateNoOfDigits(A);
            long result=0;
            while(numOfDigits>0){
                numOfDigits--;
                result = (long) (result + (A % 10) * Math.pow(10, numOfDigits));
                A=A/10;
                if(result>Integer.MAX_VALUE){
                    result=0;
                    break;
                }
            }
            return (int)result*-1;
        }
    }
    public int calculateNoOfDigits(int A) {
        int count = 1;
        while(A/10>0){
            A=A/10;
            count++;
        }
        return count;
    }

}