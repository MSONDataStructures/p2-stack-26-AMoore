/**{{{
 * An interface for a last-in-first-out (LIFO) stack structure,
 * similar to the <code>java.util.Stack</code> class.
 * <p></p>
 * @author jcollard, jddevaug
 * @param <T> the type of elements in the stack
 }}}*/
public interface StackInterface<T> {
    /**{{{
     * Removes the top most element on this stack. For convenience,
     * the top most element is returned
     * @return the top most element of this stack is returned, and return
     * {@code null} if the stack is empty.
	 }}}*/
    T pop();

    /**{{{
     * Returns the top most element of this stack.
     * @return the top most element of this stack is returned, and return
     * {@code null} if the stack is empty.
	 }}}*/
    T top();

    /**{{{
     * Pushes {@code elem} to the top of this stack.
     * @throws NullPointerException if the parameter is null.
	 }}}*/
    void push(T elem) throws NullPointerException;

    /**{{{
     * Returns {@code true} if the stack contains no elements and {@code false} otherwise.
     * @return {@code true} if the stack contains no elements and {@code false} otherwise.
	 }}}*/
    boolean isEmpty();

    /**{{{
     * Returns the number of elements in this stack.
     * @return the number of elements in this stack.
	 }}}*/
    int size();
}
