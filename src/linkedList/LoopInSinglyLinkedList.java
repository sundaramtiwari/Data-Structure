package linkedList;

public class LoopInSinglyLinkedList {

	public static void main(String[] args) {
		LinkedList list = new LinkedList();
		Node node1 = new Node("1", null);
		Node node2 = new Node("2", null);
		Node node3 = new Node("3", null);
		Node node4 = new Node("4", node2);
		Node node5 = new Node("5", null);
		
		System.out.println(list);
		list.addNode(node1);
		System.out.println(list);
		list.addNode(node2);
		System.out.println(list);
		list.addNode(node3);
		System.out.println(list);
		list.addNode(node4);
		System.out.println(list);
		list.addNode(node5, 2);
		System.out.println(list);
	}

}

class LinkedList extends Node {
	private Node head;
	private Node tail;
	private int length;

	public LinkedList() {
		super();
		this.head = null;
		this.tail = null;
		this.length = 0;
	}

	public boolean addNode(Node node) {
		if (head == null) {
			head = new Node(null, node);
			node.setNext(tail);
			
		} else {
			Node pointer = head;
			while (pointer.next != tail) {
				pointer = pointer.next;
			}
			pointer.next = node;
			node.next = tail;
		}
		this.length++;
		return true;
	}

	public boolean addNode(Node node, int index) {
		if (index > length+1) {
			return false;
		} else if (index == length+1) {
			return addNode(node);
		} else {
			Node pointer = head;
			for (int i=1; i<index; i++) {
				if (pointer.next != null) {
					pointer = pointer.next;
				} else {
					return false;
				}
			}
			node.next = pointer.next;
			pointer.next = node;
			return true;
		}
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

	@Override
	public String toString() {
		StringBuilder sbr = new StringBuilder("LinkedList [head=" + head);
		Node pointer = head;
		if (head != null) {
			while (pointer.next != null) {
				sbr.append(", " + pointer.next);
				pointer = pointer.next;
			}
		}
		sbr.append(", tail=" + tail + "]");
		return sbr.toString();
	}

}

class Node {
	
	protected Object data;
	protected Node next;

	public Node() {
		super();
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
		return String.valueOf(data);
		//return "Node [data=" + data + ", next=" + next + "]";
	}
	
}
