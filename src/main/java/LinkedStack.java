/**{{{
 * A {@link LinkedStack} is a stack that is implemented using
 * a Linked List structure to allow for unbounded size.
 * <p></p>
 * The {@code isEmpty} and {@code size} methods are provided,
 * on the house.
 * @param <T> the elements stored in the stack
 }}}*/
public class LinkedStack<T> implements StackInterface<T> {

    Node<T> top;
    int size;

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public T pop() {
		Node<T> ret = top;
		top = (top == null) ? null : top.next;
		size--;
		return (ret == null) ? null : ret.element;
    }

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public T top() {
		return (top == null) ? null : top.element;
    }

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public void push(T elem) throws NullPointerException {
		Node<T> prev = top;
		if (elem == null) {
			throw new NullPointerException();
		}
		top = new Node<T>(elem);
		top.next = prev;
		size++;
    }

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public boolean isEmpty() {
        return size == 0;
    }

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public int size() {
        return size;
    }
}
