import java.util.Iterator;

/**{{{
 * A {@link LinkedStack} is a stack that is implemented using
 * a Linked List structure to allow for unbounded size.
 * <p></p>
 * The {@code isEmpty} and {@code size} methods are provided,
 * on the house.
 * @param <T> the elements stored in the stack
 }}}*/
public class LinkedStack<T> implements StackInterface<T>, Iterable<T> {

    Node<T> top;
    int size;

    /**{{{
     * {@inheritDoc}.
	 }}}*/
    @Override
    public T pop() {
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

	/**
	 * Will destroy stack.
	 * Have fun >:)
	 */
	@Override
	public Iterator<T> iterator() {
		return new Iterator<T>() {

			@Override
			public boolean hasNext() {
				return !isEmpty();
			}

			@Override
			public T next() {
				return pop();
			}

		};
	}
}
