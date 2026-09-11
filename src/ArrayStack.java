
import java.util.EmptyStackException;

public class ArrayStack implements SterfaceackInt {
    private int size;
    private Object[] array;
    private int top;
private int resize;

    @Override
    public void clear() {
        for (int i = 0; i <= top; i++) {
            array[i] = null;
        }
        top = -1;
        size = 0;
    }


    @Override
    public boolean isEmpty() {
        return size == 0;
    }
    @Override
    public Object peek() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        return array[top];
    }

    @Override
    public Object pop() {
        if (isEmpty()) {
            throw new EmptyStackException();
        }
        Object element = array[top];
        array[top] = null;
        top--;
        size--;
        return element;
    }

    @Override
    public boolean push(Object object) {
        if (top == array.length - 1) {
            resize();
        }
        array[++top] = object;
        size++;
        return true;
    }

    private void resize() {
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean search(Object object) {
        if (object == null) {
            for (int i = top; i >= 0; i--) {
                if (array[i] == null) {
                    return true;
                }
            }
        } else {
            for (int i = top; i >= 0; i--) {
                if (object.equals(array[i])) {
                    return true;
                }
            }
        }
        return false;
    }
}
