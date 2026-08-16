class MyLinkedList {

	private static class Node {

		private final int val;
		private Node next;
		private Node prev;

		public Node(int val) {
			this.val = val;
			this.next = null;
			this.prev = null;
		}

	}

	private int size;
	private Node head;
	private Node tail;

	public MyLinkedList() {
		size = 0;
		this.head = null;
		this.tail = null;
	}

	public int get(int index) {
		Node currNode = find(index);
		return currNode != null ? currNode.val : -1;
	}

	public void addAtHead(int val) {
		Node newNode = new Node(val);
		if (head == null) {
			head = newNode;
			tail = head;
		} else {
			newNode.next = head;
			head.prev = newNode;
			head = newNode;
		}
		size++;
	}

	public void addAtTail(int val) {
		if (head == null) {
			addAtHead(val);
			return;
		}
		Node newNode = new Node(val);
		tail.next = newNode;
		newNode.prev = tail;
		tail = newNode;
		size++;
	}

	private Node find(int index) {
		if (index < 0 || index >= size || head == null) {
			return null;
		}
		if (index == 0) {
			return head;
		}
		if (index == size - 1) {
			return tail;
		}
		Node currNode = head;
		for (int i = 0; i < index; i++) {
			currNode = currNode.next;
		}
		return currNode;
	}

	public void addAtIndex(int index, int val) {
		if (index == 0) {
			addAtHead(val);
			return;
		}
		if (index == size) {
			addAtTail(val);
			return;
		}
		Node currNode = find(index);
		if (currNode != null) {
			Node newNode = new Node(val);
			currNode.prev.next = newNode;
			newNode.prev = currNode.prev;
			currNode.prev = newNode;
			newNode.next = currNode;
			size++;
		}
	}

	public void deleteAtIndex(int index) {
		if (index < 0 || index >= size) {
			return;
		}
		if (index == 0) {
			if (size == 1) {
				head = null;
				tail = null;
			} else {
				head = head.next;
				head.prev.next = null;
				head.prev = null;
			}
			size--;
		} else if (index == size - 1) {
			tail.prev.next = null;
			tail = tail.prev;
			size--;
		} else {
			Node currNode = find(index);
			if (currNode != null) {
				currNode.prev.next = currNode.next;
				currNode.next.prev = currNode.prev;
				size--;
			}
		}
	}
}



/**
 * Your MyLinkedList object will be instantiated and called as such:
 * MyLinkedList obj = new MyLinkedList();
 * int param_1 = obj.get(index);
 * obj.addAtHead(val);
 * obj.addAtTail(val);
 * obj.addAtIndex(index,val);
 * obj.deleteAtIndex(index);
 */