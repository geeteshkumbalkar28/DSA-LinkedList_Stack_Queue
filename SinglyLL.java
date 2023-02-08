import java.lang.*;
import java.util.*;

public class SinglyLL
{
	public static void main(String arg[])
	{
		Scanner scan = new Scanner(System.in);
		SinglyLinkedList obj = new SinglyLinkedList();
		/*while(true)
		{
			System.out.println("Insert First : Press 1");
			System.out.println("Insert Last : Press 2");
			System.out.println("Insert At Position : Press 3");
			System.out.println("Delete First : Press 4");
			System.out.println("Delete Last : Press 5");
			System.out.println("Delete At Position : Press 6");
			System.out.println(" Display Linked List: Press 7");
			System.out.println("Count Number of Element : Press 8");
			
			int checkCondition = scan.nextInt();
			switch(checkCondition)
			{
				case 1:
				System.out.println("Enter the element that you want to linked list : ");
				String element = scan.next();
				obj.insertFirst(element);
				break;
				case 2:
				System.out.println("Enter the element that you want to linked list : ");
				String element = scan.next();
				obj.insertLast(element);
				break;
				case 3:
				System.out.println("Enter the element that you want to linked list : ");
				String element = scan.next();
				System.out.println("Enter the position that you want to store the element : ");
				int pos = scan.nextInt();
				obj.insertFirst(element);
				break;
				case 4:
				obj.deleteFirst();
				System.out.println("Delete the element successfully !!!!");
				
				break;
				case 5:
				obj.deleteLast();
				System.out.println("Delete the element successfully !!!!");
				
				break;
				case 6:
				System.out.println("Enter the position that you want to delete the element : ");
				int pos = scan.nextInt();
				obj.deleteLast(element);
				System.out.println("Delete the element successfully !!!!");
				break;
				case 7:
					obj.display();
				break;
				case 8:
				System.out.println("Number of elemnts in linked list : "+obj.countNode());
				break;
			}
			
			
			
		}*/
		obj.insertFirst(10);
		obj.insertLast(20);
		
		obj.insertLast(30);
		obj.insertLast(40);
		obj.display();
		obj.deleteFirst();
		obj.display();
		obj.deleteLast();
		obj.display();
		obj.insertAtPos(11.1,1);
		obj.insertAtPos("Geetesh",2);
		System.out.println("Element in linked list :"+obj.countNode());
		obj.display();
		obj.insertAtPos(5.2222,2);
		System.out.println("Element in linked list :"+obj.countNode());
		obj.display();
		obj.deleteAtPos(2);
		System.out.println("Element in linked list :"+obj.countNode());
		obj.display();
		
	}
}
class Node<E>
{
	public E data;
	public Node next;
}
class SinglyLinkedList<E>
{
	public Node head;
	public int count;
	
	public SinglyLinkedList()
	{
		head = null;
		count =0;
	}
	//obj.insertFirst(10);
	
	//obj.insertFirst(11);
	public <E> void insertFirst(E no)
	{
		Node newn = new Node();
		
		newn.data=no;
		newn.next=null;
		
		if(head == null)
		{
			head = newn;
		}
		else
		{
			newn.next=head;
			head=newn;
		}
		count++;
	}
	
	public <E> void insertLast(E no)
	{
		Node newn = new Node();
		
		newn.data=no;
		newn.next=null;
		
		if(head == null)
		{
			head = newn;
		}
		else
		{
			Node temp = head;
			while(temp.next != null)
			{
				temp = temp.next;
			}
			temp.next = newn;
		}
		count++;
	}
	public void display()
	{
		Node temp = head;
		
		System.out.println("Elements of Linked list are : ");
		while(temp!=null)
		{
			System.out.print("|"+temp.data+"|->");
			temp = temp.next;
		}
		System.out.println("NULL");
	}
	public void deleteFirst()
	{
		if(count == 0)
		{
			return;
		}
		else if(count == 1)
		{
			head = null;
		}
		else
		{
			Node temp = head;
			head = head.next;
			temp = null;
		}
		count--;
	}
	public void deleteLast()
	{
		if(count == 0)
		{
			return;
		}
		else if(count == 1)
		{
			head =null;
		}
		else
		{
			Node temp = head;
			while(temp.next.next != null)
			{
				temp = temp.next;
			}
			temp.next = null;
		}
		count--;
	}
	public int countNode()
	{
		return count;
	}
	public <E> void insertAtPos(E no,int pos)
	{
		
		if((pos < 1) || (count+1 < pos))
		{
			System.out.println("Your position doesn't exist");
			return;
		}
		if(pos == 1)
		{
			insertFirst(no);
		}
		else if(pos == count+1)
		{
			insertLast(no);
		}
		else
		{
			Node newn = new Node();
			newn.data = no;
			newn.next=null;
			
			Node temp = head;
			
			for(int i=1;i<pos-1;i++)
			{
				temp = temp.next;
			}
			newn.next=temp.next;
			temp.next=newn;
			
			count++;
		}
	}
	public void deleteAtPos(int pos)
	{
		
		if((pos < 1) || (count < pos))
		{
			return;
		}
		if(pos == 1)
		{
			deleteFirst();
		}
		else if(pos == count)
		{
			deleteLast();
		}
		else
		{	
			Node temp = head;
			
			for(int i=1;i<pos-1;i++)
			{
				temp = temp.next;
			}
			temp.next=temp.next.next;
			
			count--;
		}
	}
}