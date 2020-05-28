import java.util.ArrayList;

class IB_Prime_Sum{
    public static void main(String[] args) {
        
    }
    public ArrayList<Integer> primesum(int A) {
        int primeArray[] = primeArray(A);
        ArrayList<Integer> primeNumArray = new ArrayList<>();
        for(int i=0;i<primeArray.length;i++){
            if(primeArray[i]==0){
                primeNumArray.add(i+1);
            }
        }
        ArrayList<Integer> resultPrimes = new ArrayList<>();
        int numA=0;
        int numB=0;
        for(int i=0;i<primeNumArray.size();i++){
            numA = primeNumArray.get(i);
            if(primeArray[A-numA-1]==0){
                numB = A-numA;
                break;
            }
        }
        resultPrimes.add(numA);
        resultPrimes.add(numB);
        return resultPrimes;
    }

    public int[] primeArray(int input){
        int arr[] = new int[input];
        arr[0]=1;
        for(int i=2;i<=input/2;i++){
            for(int j=2;j<input;j++){
                if(i*j<=input){
                    arr[i*j-1]=1;
                }else{
                    break;
                }
            }
        }
        return arr;
    }

}