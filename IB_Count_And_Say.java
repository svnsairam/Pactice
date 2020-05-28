/**
 The count-and-say sequence is the sequence of integers beginning as follows:

1, 11, 21, 1211, 111221, ...
1 is read off as one 1 or 11.
11 is read off as two 1s or 21.

21 is read off as one 2, then one 1 or 1211.

Given an integer n, generate the nth sequence.

Note: The sequence of integers will be represented as a string.

Example:

if n = 2,
the sequence is 11.
 */

class IB_Count_And_Say{
    public String countAndSay(int A) {
        StringBuilder str = new StringBuilder("1");
        while(A-->1){
            str = new StringBuilder(generateNextString(str));
        }
        return str.toString();
    }

    public StringBuilder generateNextString(StringBuilder str) {
        StringBuilder nextStr = new StringBuilder("");
        int count = 1;
        if(str.length()==1){
            return new StringBuilder("11");
        }
        for(int i=0;i<str.length()-1;i++){
            if(str.charAt(i)==str.charAt(i+1)){
                count++;
                if(i+1==str.length()-1){
                    nextStr = nextStr.append(count);
                    nextStr = nextStr.append(str.charAt(i));
                }
            }
            else{
                nextStr = nextStr.append(count);
                nextStr = nextStr.append(str.charAt(i));
                count = 1;
                if(i+1==str.length()-1){
                    nextStr = nextStr.append(count);
                    nextStr = nextStr.append(str.charAt(i+1));
                }
            }
        }
        return nextStr;
    }
}