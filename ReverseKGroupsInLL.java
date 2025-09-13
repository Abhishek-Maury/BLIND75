public class ReverseKGroupsInLL {
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
       public ListNode reverseKGroup(ListNode head, int k) {
        //check if k node exists
        ListNode temp=head;
        int cnt=0;
        while(cnt<k){
            if(temp==null){
                return head;
            }
            temp=temp.next;
            cnt++;
        }

        //recusivelsy find that k node is present
        ListNode prevNode=reverseKGroup(temp,k);

        //reverse current group
        temp=head;cnt=0;
        while(cnt<k){
            ListNode next=temp.next;
            temp.next=prevNode;
            prevNode=temp;
            temp=next;
            cnt++;
        }
        return prevNode;
    }
    public static void main(String[] args) {
        
    }
}
