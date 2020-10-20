package stack;

/**
 * StackInterface
 */
public interface StackInterface<X> {

    public X pop();
    public void push(X newItem);
    public boolean contains(X item);
    public X access(X item);
    public int size();
}