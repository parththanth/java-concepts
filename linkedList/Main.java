public class Main
{
     public static class Node{
         // Node properties
         int data;
         Node next;
         Node prev;
         // constructor;
         Node(int data){
             this.data=data;
             
         }
         
     }
     public static void display(Node head){
         Node temp=head;
         while(temp!=null){
             System.out.print(temp.data+ " ");
             temp=temp.next;
         }
     }
	public static void main(String[] args) {
		Node a =new Node(5);
		Node b =new Node(6);
		Node c =new Node(7);
		Node d =new Node(8);
		a.next =b;
		b.prev=a;
		
		b.next=c;
		c.prev=b;
		
		c.next=d;
		d.prev=c;
		
	
		d.next=null;
		
		display(a);
		
		
	}
}