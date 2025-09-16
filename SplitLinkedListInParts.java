public class SplitLinkedListInParts {
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

    public ListNode[] splitListToParts(ListNode head, int k) {
        ListNode[] ans = new ListNode[k];
        int len = 0;
        ListNode temp = head;
        while (temp != null) {
            len++;
            temp = temp.next;
        }

        int n = len / k, extra = len % k;

        temp = head;
        ListNode prev = null;

        for (int i = 0; temp != null && i < k; i++, extra--) {
            ans[i] = temp;

            for (int j = 0; j < n + (extra > 0 ? 1 : 0); j++) {
                prev = temp;
                temp = temp.next;
            }
            if (prev != null) {
                prev.next = null;
            }
        }
        return ans;

    }

    public static void main(String[] args) {

    }
}
