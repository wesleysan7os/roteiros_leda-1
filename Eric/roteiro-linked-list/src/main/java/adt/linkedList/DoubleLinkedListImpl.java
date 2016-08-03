package adt.linkedList;

public class DoubleLinkedListImpl<T> extends SingleLinkedListImpl<T> implements DoubleLinkedList<T> {

	protected DoubleLinkedListNode<T> last;

	@Override
	public void insert(T element) {
		if (element != null) {
			DoubleLinkedListNode<T> newElem = new DoubleLinkedListNode<>(element, null, last);
			if (isEmpty()) {
				head = last = newElem;
			} else {
				last.setNext(newElem);
				last = newElem;
			}
			size++;
		}
	}

	@Override
	public void insertFirst(T element) {
		if (element != null) {
			DoubleLinkedListNode<T> oldHead = (DoubleLinkedListNode<T>) this.head;
			DoubleLinkedListNode<T> newHead = new DoubleLinkedListNode<>(element, oldHead, null);
			if (isEmpty()) {
				last = newHead;
			} else {
				oldHead.setPrevious(newHead);
			}
			this.head = newHead;
			size++;
		}
	}

	@Override
	public void removeFirst() {
		if (!isEmpty()) {
			if (size > ONE) {
				DoubleLinkedListNode<T> secondElement = (DoubleLinkedListNode<T>) this.head.getNext();
				secondElement.setPrevious(null);
				this.head = secondElement;
			} else {
				this.head = null;
				this.last = null;
			}
			size--;
		}
	}

	@Override
	public void removeLast() {
		if (!isEmpty()) {
			if (size == ONE) {
				this.head = null;
				this.last = null;
			} else if (size > ONE) {
				DoubleLinkedListNode<T> newLast = this.last.getPrevious();
				newLast.setNext(null);
				this.last = newLast;
			}
			size--;
		}
	}
}