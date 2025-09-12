public class SwapNodesInPair {
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

    public ListNode swapPairs(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode first = head;
        ListNode sec = head.next;
        ListNode prev = null;
        while (first != null && sec != null) {
            ListNode third = sec.next;
            sec.next = first;
            first.next = third;
            if (prev != null) {
                prev.next = sec;
            } else {
                head = sec;
            }

            // update
            prev = first;
            first = third;
            if (third != null) {
                sec = third.next;
            } else {
                sec = null;
            }

        }
        return head;
    }

    public static void main(String[] args) {

    }
}
