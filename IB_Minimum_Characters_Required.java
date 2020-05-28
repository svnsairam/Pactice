class IB_Minimum_Characters_Required{
    public static void main(String[] args) {
       System.out.println( new IB_Minimum_Characters_Required().solve("aacecaaaa"));
    }

    // Using KMP_ALGO we calculate lsp[] array to find solution.
     public int solve(String A) {

        String revA = "";
        for(int i=0;i<A.length();i++){
            revA = revA + A.charAt(A.length()-i-1);
        }
        String resultString = A + '&' + revA;
        int i=1;
        int len = 0;
        int lps[] = new int[resultString.length()];
        lps[0]=0;

        // calculate lps[] array for resultString
        while(i < resultString.length()){
            if(resultString.charAt(i) == resultString.charAt(len)){
                len ++;
                lps[i] = len;
                i++;
            }else{
                if(len!=0){
                    len = lps[len-1];
                }else{
                    lps[i] = 0;
                    i++;
                }
            }
        }
        System.out.println(resultString);
        for(int k=0;k<lps.length;k++){
            System.out.print(lps[k]+" ");
        }
        System.out.println();
        return A.length()-lps[resultString.length()-1];
    }

    public int solveSolutionApproach2(String A) {
        int start = 0 , end = A.length()-1;
        int temp_end = end;
        /*Idea is to find longest palindrome length starting from index 0 . Differece of 
        this length from string length is the required value*/
        while(start<=temp_end)
        {
            if(A.charAt(start)==A.charAt(temp_end))
            {
                start++;
                temp_end--;
            }
            else
            {
                start = 0;
                temp_end = --end;
            }
        }
        return A.length()-(end+1);
    }
}