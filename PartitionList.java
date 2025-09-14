public class PartitionList {
    public class ListNode {
        int val;
        ListNode next;

        ListNode() {
        }

        ListNode(int val) {
            this.val = val;
        }

        ListNode(int val, ListNode next) {
            this.val = val;
            this.next = next;
        }
    }

     public ListNode partition(ListNode head, int x) {
        ListNode left =new ListNode(-1);
        ListNode right =new ListNode(-1);
        ListNode temp1=left;
        ListNode temp2=right;
        ListNode temp=head;
        while(temp!=null){
            if(temp.val<x){
                temp1.next=temp;
                temp1=temp1.next;
            }else{
                temp2.next=temp;
                temp2=temp2.next;
            }
            temp=temp.next;
        }
        temp1.next=right.next;
        temp2.next=null;

        return left.next;
    }
    public static void main(String[] args) {
        
    }
}
