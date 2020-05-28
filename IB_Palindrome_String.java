class IB_Palindrome_String{
    public static void main(String[] args) {
        System.out.println(new IB_Palindrome_String().isPalindrome("09A man, a plan, a canal: Panama90"));
    }
    public int isPalindrome(String A) {
        StringBuilder sb= new StringBuilder();
        for(int i=0;i<A.length();i++){
            if((A.charAt(i)-'a'>=0 && 'z'-A.charAt(i)>=0) || (A.charAt(i)-'A'>=0 && 'Z'-A.charAt(i)>=0) || (A.charAt(i)-'0'>=0 && '9'- A.charAt(i)>=0)){
                System.out.println(A.charAt(i)+" "+(int)A.charAt(i));
                sb.append(A.charAt(i));
            }
        }
        sb = new StringBuilder(sb.toString().toLowerCase());
        boolean isPallen = true;
        for(int i=0;i<sb.length();i++){
           if(sb.charAt(i)!=sb.charAt(sb.length()-1-i)){
               isPallen = false;
           }
        }
        
        if(isPallen){
            return 1;
        }else{
            return 0;
        }
    }
}