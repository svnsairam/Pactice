class IB_Length_of_Last_Word{
    public static void main(String[] args) {
        
    }
    public int lengthOfLastWord(final String A) {
        String arr[] = A.trim().split(" ");
        if(arr.length>0){
            return arr[arr.length-1].length();
        }else{
            return 0;
        }
    }
}