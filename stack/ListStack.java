package stack;
import java.util.ArrayList;

import stack.StackInterface;

public class ListStack<X> implements StackInterface<X> {
    
    private ArrayList<X> data;
    private int stackPointer;

    public ListStack(){
        data = new ArrayList<X>();
        stackPointer = 0;
    }

    @Override
    public void push(X newItem) {
        data.add(newItem);
        stackPointer++;
    }

    @Override
    public X pop() {
        stackPointer--;
        return data.remove(stackPointer);
    }

    @Override
    public X access(X item) {        
        while(stackPointer>0){
            X tmpItem = pop();
            if(item.equals(tmpItem)){
                return tmpItem;
            }
        }

        throw new IllegalArgumentException("Could not find item on the stack "+item);
    }

    @Override
    public boolean contains(X item) {
        return data.contains(item);
    }

    @Override
    public int size() {
        return stackPointer;
    }

}
