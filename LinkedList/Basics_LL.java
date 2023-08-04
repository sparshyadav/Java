public class Basics_LL{

    public static class Node{
        int data;
        Node next;
        Node(int data){
            this.data=data;
        }
    }

    public static void Display(Node head){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }

    public static void recursiveDisplay(Node head){
        Node temp=head;
        if(temp==null){
            return;
        }
        System.out.print(temp.data+" ");
        recursiveDisplay(temp.next); 
    }
    
    public static int length(Node head){
        Node temp=head;
        int len=0;
        while(temp!=null){
            len++;
            temp=temp.next;
        }
        return len;
    }

    public static void main(String[] args) {
        Node a=new Node(1);
        Node b=new Node(2);
        Node c=new Node(3);
        Node d=new Node(4);
        Node e=new Node(5);
        System.out.println(a.next);
        a.next=b;
        b.next=c;
        c.next=d;
        d.next=e;
        System.out.println(a.next);
        System.out.println(b);
        System.out.println(c.next.data);
        Display(a);
        System.out.println();
        recursiveDisplay(a);
        int size=length(a);
        System.out.println(size);
    }
}