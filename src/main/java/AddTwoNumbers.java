public class AddTwoNumbers {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {
        int reminder = 0;
        int left;
        int right;
        ListNode result = new ListNode();
        ListNode current = result;
        while(l1 != null || l2 != null){
            if(l1 != null){
                left = l1.val;
                l1 = l1.next;
            }
            else left = 0;
            if(l2 != null){
                right = l2.val;
                l2 = l2.next;
            }
            else right = 0;
            int sum = left + right + reminder;
            ListNode newNode = new ListNode(sum % 10);
            reminder = sum /10 ;
            current.next = newNode;
            current = current.next;
        }
        if(reminder != 0){
            ListNode reminderNode = new ListNode(reminder);
            current.next = reminderNode;
        }
        return result.next;
    }

    public class ListNode {
      int val;
      ListNode next;
      ListNode() {}
      ListNode(int val) { this.val = val; }
      ListNode(int val, ListNode next) { this.val = val; this.next = next; }
  }
}
