import java.util.Scanner;
public class Solution4{

    public static class ListNode {
        int val;
        ListNode next;
        ListNode(int x) { val = x; }
    }
    public static ListNode deleteNode(ListNode head, int val) {
        if (head == null) {
            return null; // 如果链表为空，直接返回null
        }

        // 处理首节点为待删除节点的情况
        if (head.val == val) {
            return head.next;
        }

        ListNode prev = head;
        ListNode current = head.next;

        // 查找待删除节点，并更新前驱节点的next指针
        while (current != null) {
            if (current.val == val) {
                prev.next = current.next;
                break;
            }
            prev = current;
            current = current.next;
        }

        return head;
    }

    public static void main(String[] args) {
        ListNode head=null;
        ListNode tail=null;
        String line;
        Scanner sc=new Scanner(System.in);
        while(!(line = sc.nextLine()).isEmpty()){
            int index=Integer.parseInt(line);
            ListNode newnode=new ListNode(index);
            if(head==null){
                head=newnode;
                tail=newnode;
            }else{
                 tail.next=newnode;
                 tail=tail.next;
            }
        }
        int num=sc.nextInt();
        ListNode p=deleteNode(head,num);
        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}
