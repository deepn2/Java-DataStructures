
public class LinkedQueue <T> implements DequeInterface <T> 
{

	private Node<T> firstNode;
	private Node<T> lastNode;
	
	public void WaitLine()
	{
		firstNode = lastNode = null;
	}
	
	public void enqueue(T newEntry)
	{
		
	}
	
	public T getFront()
	{
		T tmp = null;
		
		if(!isEmpty())
		{
			tmp = firstNode.getData();
			//firstNode = firstNode.getNextNode();
		}
		return tmp;
	}
	
	public T dequeue()
	{
		T tmp = null;
		
		if(!isEmpty())
		{
			tmp = firstNode.getData();
			firstNode = firstNode.getNextNode();
			if(firstNode == null)
				lastNode = null;
		}
		return tmp;
	}
	
	public boolean isEmpty()
	{
		return firstNode == null;
	}
	
	
	public String toString()
	{
		Node<T> tmp = firstNode;
		String str = "";
		
		while(tmp!=null)
		{
			str += tmp.getData() + "  ";
			tmp = tmp.getNextNode();
		}
		return str;
	}


	public void addToFront(T newEntry) {
		if(firstNode == null)
		{
			firstNode = new Node<T>(newEntry);
			lastNode = firstNode;
		}
		else
		{
			Node<T> new_node = new Node<T>(newEntry);
			lastNode.setNextnode(new_node);
			lastNode = lastNode.getNextNode();
		}
	}


	public void addToBack(T newEntry) {
		if(firstNode == null)
		{
			firstNode = new Node<T>(newEntry);
			lastNode = firstNode;
		}
		else
		{
			Node<T> new_node = new Node<T>(newEntry);
			lastNode.setNextnode(new_node);
			lastNode = lastNode.getNextNode();
		}
	}


	public T removeFront() {
T tmp = null;
		
		if(!isEmpty())
		{
			tmp = firstNode.getData();
			firstNode = firstNode.getNextNode();
			if(firstNode == null)
				lastNode = null;
		}
		return tmp;
	}


	public T removeBack() {
		// TODO Auto-generated method stub
		return null;
	}

	public T getBack() {
		// TODO Auto-generated method stub
		return null;
	}

	public void clear() {
		// TODO Auto-generated method stub
		
	}
}
