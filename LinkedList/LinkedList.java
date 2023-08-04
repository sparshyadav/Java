public class LinkedList {
    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static class linkedlist{
        Node head=null;
        Node tail=null;

        void insertAtEnd(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                tail.next=temp;
                tail=temp;
            }
        }
        
        void insertAtBeginning(int val){
            Node temp=new Node(val);
            if(head==null){
                head=temp;
                tail=temp;
            }
            else{
                temp.next=head;
                head=temp;
            }
        }

        void insertAt(int idx, int val){
            Node t=new Node(val);
            Node temp=head;
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
            t.next=temp.next;
            temp.next=t;
        }

        void getElement(int idx){
            Node temp=head;
            for(int i=0; i<idx; i++){
                temp=temp.next;
            }
            System.out.println(temp.data);
        }

        void deleteAt(int idx){
            Node temp=head;
            for(int i=0; i<idx-1; i++){
                temp=temp.next;
            }
            temp.next=temp.next.next;
        }

        void Display(){
            Node temp=head;
            while(temp!=null){
                System.out.print(temp.data+" ");
                temp=temp.next;
            }
            System.out.println();
        }

        int size(){
            Node temp=head;
            int count=0;
            while(temp!=null){
                count++;
                temp.next=temp;
            }
            return count;
        }
    }

    public static void main(String[] args) {
        linkedlist ll=new linkedlist();
        ll.insertAtEnd(1);
        ll.insertAtEnd(2);
        ll.insertAtEnd(3);
        ll.insertAtEnd(4);
        ll.insertAtEnd(5);
        ll.Display();
        // System.out.println(ll.size());
        ll.insertAtBeginning(10);
        ll.insertAtBeginning(11);
        ll.insertAtBeginning(12);
        ll.Display();
        ll.insertAt(3, 25);
        ll.insertAt(5, 50);
        ll.Display();
        System.out.println(ll.head.data);
        System.out.println(ll.tail.data);
        ll.getElement(4);
        ll.getElement(7);
        ll.deleteAt(2);
        ll.deleteAt(6);
        ll.Display();
    }
}
