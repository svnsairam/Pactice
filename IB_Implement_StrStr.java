class IB_Implement_StrStr{
    public static void main(String[] args) {
        System.out.println(new IB_Implement_StrStr().strStr("a", "a"));
    }
    int lsp[];
    public int strStr(final String A, final String B) {
        calculateLSP(B);
        int i=0;
        int j=0;
        
        while(i<A.length() && j<B.length()){
            if(A.charAt(i)==B.charAt(j)){
                i++;
                j++;
            }
            if(j==B.length()){
                // Found the occurence of substring starting at index i-j
                return i-j;
            }
            else if (i < A.length() && B.charAt(j) != A.charAt(i)) {
                if(j!=0){
                    j=this.lsp[j-1];
                }else{
                    i++;
                }
            }
        }
    // Found NO occurence of substring 
        return -1;
    }

    public void calculateLSP(final String pattern) {
        if(pattern.length()!=0){
            this.lsp = new int[pattern.length()];
            this.lsp[0] =0;
        }
        int len = 0;
        int i=1;
        while(i<pattern.length()){
            if(pattern.charAt(i)==pattern.charAt(len)){
                len++;
                this.lsp[i] = len;
                i++;
            }else{
                if(len != 0){
                    len = this.lsp[len-1];
                }else{
                    lsp[i]=0;
                    i++;
                }
            }
        }
    }
}