package week5;

 class ListNode {
     int val;
     ListNode next;
     ListNode() {}
     ListNode(int val) { this.val = val; }
     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 }

public class MergeTwoSortedLists_21 {

    public static void main(String[] args) {
        MergeTwoSortedLists_21 a = new MergeTwoSortedLists_21();
        ListNode list1 = new ListNode(1,new ListNode(2, new ListNode(4)));
        ListNode list2= new ListNode(1,new ListNode(3, new ListNode(4)));
        a.mergeTwoLists(list1, list2);
    }
    public ListNode mergeTwoLists(ListNode list1, ListNode list2) {
        ListNode dummly = new ListNode();
        ListNode tail = dummly;

        while(list1 !=null || list2 != null){

            if(list1 == null ) {
                tail.next = list2;
                break;
            }
            if(list2 == null ) {
                tail.next = list1;
                break;
            }
            if(list1.val<= list2.val) {
                tail.next = list1;
                list1 = list1.next;
            }else {
                tail.next = list2;
                list2 = list2.next;
            }
            tail = tail.next;
        }
        return dummly.next;
    }
 }

