class IB_Pallendrome_Integer{
    public static void main(String[] args) {
        
    }

    // Method 1 using string
    public int isPalindrome(int A) {

        String original = ""+A;
        StringBuilder rev = new StringBuilder();
        for(int i=0;i<original.length();i++){
            rev.append(original.charAt(original.length()-i-1));
        }
        if(original.equalsIgnoreCase(rev.toString())){
            return 1;
        }else{
            return 0;
        }
    }

    // Method 2 without string
    public int isPalindrome2(int A) {
        if(A==0){
            return 1;
        }
        if(A>0){
            int numberOfDigits = calculateNumberOfDigits(A);
            long result = 0;
            int originalNumber = A;
            while(numberOfDigits>0){
                numberOfDigits--;
                result = (long) (result + (A % 10) * Math.pow(10, numberOfDigits));
                A=A/10;
            }
            if(result == originalNumber){
                return 1;
            }else{
                return 0;
            }
        }else{
            return 0;
        }
    }

    public int calculateNumberOfDigits(int a) {
        int count = 0;
       while(a>0){
            a=a/10;
            count++;
       }
       return count;
    }
    
}