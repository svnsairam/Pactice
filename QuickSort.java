import java.util.Scanner;

class QuickSort{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int sizeOfArray = sc.nextInt();
        int arr[] = new int[sizeOfArray];
        for(int i=0;i<sizeOfArray;i++){
            arr[i] = sc.nextInt();
        }
        int result[] = qSort(arr,0,sizeOfArray-1);
        System.out.println("---------Sorted Array-------");
        for(int i=0;i<result.length;i++){
            System.out.print(result[i]+" ");
        }
    }

    public static int[] qSort(int[] arr, int low, int high){
        if(low<high){
            int partitionIndex = partition(arr,low,high);
            qSort(arr, low, partitionIndex-1);
            qSort(arr, partitionIndex+1, high);
            return arr;
        }else{
            return arr;
        }
    }

    private static int partition(int[] arr, int low, int high) {
        int partitionVal = arr[low];
        int partitionIndx = low;
        for(int i=low+1;i<=high;i++){
            if(arr[i]<partitionVal){
               // swap(partitionIndx+1,i);
               int temp = arr[partitionIndx+1];
               arr[partitionIndx+1] = arr[i];
               arr[i]= temp;
               // swap(partitionIndx, partitionIndx+1);
               temp = arr[partitionIndx+1];
               arr[partitionIndx+1] = arr[partitionIndx];
               arr[partitionIndx] = temp;

               partitionIndx++;
            }
        }
        return partitionIndx;
    }
}