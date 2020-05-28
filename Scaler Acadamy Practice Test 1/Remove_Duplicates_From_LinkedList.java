class Remove_Duplicates_From_LinkedList{
    public static void main(String[] args) {
        
    }
    public ListNode deleteDuplicates(ListNode A) {
        if(A==null || A.next == null){
            return A;
        }
        ListNode headValue = A;
        int preVal = A.val;
        ListNode nxtNode = A.next;
        while(nxtNode!=null){
            if(preVal == nxtNode.val){
                nxtNode = nxtNode.next;
            }else{
                A.next = nxtNode;
                nxtNode = nxtNode.next;
                A=A.next;
                preVal = A.val;
            }
        }
        A.next = nxtNode;
        return headValue;
    }

 
class ListNode {
    public int val;
    public ListNode next;
    ListNode(int x) { val = x; next = null; }
} 

}



