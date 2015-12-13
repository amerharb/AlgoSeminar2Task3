package task3;

import task1.Stack;

public class Queue<E>
{

    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();
    private int size = 0;
    
    public void queue(E item)
    {
        inbox.push(item);
        size++;
    }

    public E dequeue()
    {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        size--;
        return outbox.pop();
    }
    
    public int size(){
        return size;
    }

    public E peek()
    {
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.peek();
    }

}
