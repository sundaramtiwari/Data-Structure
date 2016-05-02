package list;

public class SinglyLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		list.add(new Node(5));
		list.add(new Node(4));
		list.add(new Node(12));
		list.add(new Node(7));
		list.add(new Node(89));
		System.out.println(list);
		
		list.add(new Node(23), 1);
		System.out.println(list);
	}

}

class LinkedList {
	private Node head;
	private Node tail;
	private int size;

	public LinkedList() {
		head = new Node();
		tail = new Node();
		size = 0;
	}
	
	public boolean add(Node node) {
		boolean updated = false;
		Node temp = head;
		try {
			while (temp.getNext() != null)
				temp = temp.getNext();
			node.setNext(null);
			temp.setNext(node);
			tail.setNext(node);
			size++;
			updated = true;
		} catch (Exception e) {
			System.out.println("Error occured in adding node: " + e.getMessage());
		}
		return updated;		
	}

	public boolean add(Node node, int index) {
		if (index > size)
			throw new IllegalArgumentException("Specified index: " + index + " is not valid for Linked list of size: " + size);

		boolean updated = false;
		Node temp = head;
		try {
			for (int i=0; i < index; i++) 
				temp = temp.getNext();
			node.setNext(temp.getNext());
			temp.setNext(node);
			size++;
			updated = true;
		} catch (Exception e) {
			System.out.println("Error occured in adding node: " + e.getMessage());
		}
		return updated;		
	}

	public Node getHead() {
		return head;
	}

	public void setHead(Node head) {
		this.head = head;
	}

	public Node getTail() {
		return tail;
	}

	public void setTail(Node tail) {
		this.tail = tail;
	}

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}

	@Override
	public String toString() {
		return "LinkedList [head=" + head + ", tail=" + tail + ", size=" + size + "]";
	}

}

class Node {
	private Object data;
	private Node next;
	
	public Node() {
		
	}

	public Node(Object data) {
		super();
		this.data = data;
	}

	public Node(Object data, Node next) {
		super();
		this.data = data;
		this.next = next;
	}

	public Object getData() {
		return data;
	}

	public void setData(Object data) {
		this.data = data;
	}

	public Node getNext() {
		return next;
	}

	public void setNext(Node next) {
		this.next = next;
	}

	@Override
	public String toString() {
		return "Node [data=" + data + ", next=" + next + "]";
	}
}
