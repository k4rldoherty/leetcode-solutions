public class DoubleItNOTCOMPLETE {
    public static void main(String[] args) {
        ListNode head = new ListNode(1);
        head.next = new ListNode(8);
        head.next.next = new ListNode(9);
        // LinkedList = 189 so 189 * 2 = 378
        doubleIt(head);
    }

    public static ListNode doubleIt(ListNode head) {
        ListNode answer = new ListNode();
        String strAns = "";
        ListNode ptr = head;
        
        while (ptr != null) {
            strAns+= ptr.val;
            ptr = ptr.next;
        }
        
        String newStrAns = Integer.parseInt(strAns) * 2 + "";
        ListNode ansPtr = answer;
        for (int i = 0; i < newStrAns.length(); i++) {
            int digit = Character.getNumericValue(newStrAns.charAt(i));
            answer = new ListNode(digit, ansPtr.next);
        }
        
        ListNode loopPtr = answer;
        while (loopPtr != null) {
            System.out.println(loopPtr.val);
            loopPtr = loopPtr.next;
        }

        return answer;
    }
}