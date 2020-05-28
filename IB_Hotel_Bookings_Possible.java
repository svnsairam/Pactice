import java.util.ArrayList;

class IB_Hotel_Bookings_Possible{
    public static void main(String[] args) {
    }
    public boolean hotel(ArrayList<Integer> arrive, ArrayList<Integer> depart, int K) {
        int currentGuests =0;
        int maxCurrentGuests = 0;
        int arr[]=new int[Integer.MAX_VALUE];
        for(int i=0;i<arrive.size();i++){
            arr[arrive.get(i)]=arr[arrive.get(i)]+1;
        }
        for(int i=0;i<depart.size();i++){
            arr[depart.get(i)]=arr[depart.get(i)]-1;
        }
        for(int i=0;i<arr.length;i++){
            if(arr[i]!=0){
                currentGuests = currentGuests + arr[i];
                if(currentGuests>maxCurrentGuests){
                    maxCurrentGuests = currentGuests;
                }
            }
        }
        if(maxCurrentGuests>K){
            return false;
        }else
     return true;   
    }
}