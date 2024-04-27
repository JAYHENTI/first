import java.util.Scanner;

class Solution5 {
    public static class ListNode {
        int val;
        ListNode next;
        ListNode() {}
        ListNode(int val) { this.val = val; }
        ListNode(int val, ListNode next) { this.val = val; this.next = next;}
    }
    public static ListNode trainningPlan(ListNode head) {
        int num;
        if(head==null){
            return head;
        }else {
            ListNode pre = head;
            ListNode last = head.next;
            while(pre.next!=null){
                while(last!=null){
                    if(pre.val<last.val){
                        num=pre.val;
                        pre.val=last.val;
                        last.val=num;
                        pre=pre.next;
                        last=last.next;
                    }else{
                        pre=pre.next;
                        last=last.next;
                    }
                }
            }
            return head;
        }

    }

    public static void main(String[] args) {
        ListNode head=null;
        ListNode tail=null;
        Scanner sc=new Scanner(System.in);
        String line;
        while(!(line=sc.nextLine()).isEmpty()){
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

        ListNode p=trainningPlan(head);

        while(p!=null){
            System.out.println(p.val);
            p=p.next;
        }
    }
}

