import java.lang.*;
import java.util.*;

public class Stack
{
	public static void main(String arg[])
	{
		SinglyLinkedList obj = new SinglyLinkedList();
		obj.push(10);
		obj.display();
		obj.pop();
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
	
	public void push(E no)
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

	public void pop()
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
	
}