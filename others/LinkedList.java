package others;

class ListNodes
{
	public static void main (String [] args)
	{
		Node header;
		Node one;
		Node two;
		Node three;
		Node four;
		Node five = new Node (5); //creates node where .next references null
		
		four = new Node (44, five);
		three = new Node (356, four);
		two = new Node (92, three);
		one = new Node (1, two);
		header = one;
		
		one = null;
		two = null;
		three = null;
		four = null;
		five = null;
		
		printList (header);
		
		System.exit (0);
	}
	
//  This is the recursive print
/*
 	public static void printList (Node n)
	{
		if (n != null)
		{
			System.out.println ("The value is " + n);
			printList (n.next);
		}
	}
*/
	public static void printList (Node n)
	{
		while (n != null)
		{
			System.out.println ("The value is " + n);
			n = n.next;
		}
	}

}

class Node
{
	private int data;
	Node next;
	
	public Node ()
	{
		this (0,null);
	}
	
	public Node (int data)
	{
		this (data, null);
	}
	
	public Node (int data, Node next)
	{
		this.data = data;
		this.next = next;
	}
	
	public String toString ()
	{
		return "" + data;
	} 
}