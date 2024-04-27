import java.util.Scanner;
public class Solution3 {
    public static class ListNode {
        int indx;
        ListNode next;

        ListNode(int N) {
            indx = N;
        }
    }

    public static int[] reverseBookList(ListNode head) {
        ListNode current = head;
        int k = 0;
        while (current != null) {
            k++;
            current = current.next;
        }
        int[] num = new int[k];

        int i = 0;
        while (head != null) {
            num[num.length - 1 - i] = head.indx;
            head = head.next;
            i++;
        }

        return num;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        ListNode head = null;
        ListNode tail = null;

        String line;
        while (!(line = sc.nextLine()).isEmpty()) {
            int index = Integer.parseInt(line);
            ListNode newNode = new ListNode(index);

            if (head == null) {
                head = newNode;
                tail = newNode;
            } else {
                tail.next = newNode;
                tail = tail.next;
            }
        }

        int[] reversedList = reverseBookList(head);
        for (int i = 0; i < reversedList.length; i++) {
            System.out.println(reversedList[i]);
        }
    }
}