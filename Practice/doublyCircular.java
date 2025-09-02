package Data_Structure.Practice;

 class Node{
    int value;
    Node next;
    Node prev;
}
class doublyCircularLinkedList{
     Node head;
     Node tail;
     int size;

     public Node createCDLL(int nodevalue){
         Node node = new Node();
         head = new Node();
         node.value = nodevalue;
         node.next = node;
         node.prev = node;
         head = node;
         tail = node;
         size =1;
         return head;
     }

     public void insertion(int nodevalue, int location){
         Node node = new Node();
         node.value = nodevalue;
         if(head == null){
             createCDLL(nodevalue);
             return;
         }
         else{
             if(location==0){
                 node.next = head;
                 node.prev =tail;
                 tail.next = node;
                 head.prev = node;
                 head = node;
                 size++;
             }
             else if(location>=size){
                 tail.next = node;
                 node.prev = tail;
                 node.next = head;
                 head.prev=node;
                 tail = node;
                 size++;
             }
             else{
                 Node tempnode = head;
                 for(int i =0; i<location-1; i++){
                     tempnode = tempnode.next;
                 }
                 Node nextnode = tempnode.next;
                 tempnode.next = node;
                 node.prev = tempnode;
                 node.next = nextnode;
                 nextnode.prev = node;
                 size++;
             }

         }
     }
     public void traverse(){
        Node tempnode = head;
         for(int i=0; i<size; i++){
             System.out.print(tempnode.value);
             tempnode = tempnode.next;
             if(i<size-1){
                 System.out.print("->");
             }
         }
         System.out.println();
     }
     public void deletion(int location){
         if(head==null){
             System.out.println("the cdll does not exist");
         }
         else{
             if(location==0){
                 head = head.next;
                 tail.next = head;
                 head.prev = tail;
                 size--;
             } else if (location >= size-1) {
                 Node tempnode = head;
                 for(int i =0; i< location-1; i++){
                     tempnode = tempnode.next;
                 }
                 tempnode.next = head;
                 head.prev = tempnode;
                 tail = tempnode;
                 size--;
             }

         }
     }

}
public class doublyCircular {
    public static void main(String[] args) {
        doublyCircularLinkedList linkedlist = new doublyCircularLinkedList();
        linkedlist.createCDLL(6);
       linkedlist.insertion(56,0);
        linkedlist.insertion(9,0);
        linkedlist.insertion(88,3);
        linkedlist.insertion(40,4);
        linkedlist.insertion(5,2);
        linkedlist.traverse();
        System.out.println(linkedlist.size);
        linkedlist.deletion(5);
        linkedlist.traverse();
        System.out.println(linkedlist.size);


    }

}
