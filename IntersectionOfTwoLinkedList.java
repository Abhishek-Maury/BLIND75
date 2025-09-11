public class IntersectionOfTwoLinkedList {
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

    public int length(ListNode head) {
        int count = 0;
        ListNode temp = head;
        while (temp != null) {
            count++;
            temp = temp.next;
        }
        return count;
    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        int length1 = length(headA);
        int length2 = length(headB);

        if (length1 > length2) {
            int diff = length1 - length2;
            return collision(diff, headA, headB);
        } else {
            int diff = length2 - length1;
            return collision(diff, headB, headA);
        }
    }

    public ListNode collision(int diff, ListNode head1, ListNode head2) {
        ListNode curr1 = head1;
        ListNode curr2 = head2;

        for (int i = 0; i < diff; i++) {
            if (curr1 == null) {
                return null;
            }
            curr1 = curr1.next;
        }

        while (curr1 != null && curr2 != null) {
            if (curr1 == curr2) {
                return curr1;
            }
            curr1 = curr1.next;
            curr2 = curr2.next;
        }
        return null;
    }

    public static void main(String[] args) {

    }
}
