package task3;

import task1.Stack;

public class Queue<E>
{

    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();
    private int limit;

    public Queue()
    {
        limit = Integer.MAX_VALUE;
    }

    public Queue(int limit)
    {
        this.limit = limit;
    }

    public void queue(E item) throws Exception
    {
        if (size() >= limit) {
            throw new Exception("over flow");
        }
        inbox.push(item);
    }

    public E dequeue() throws Exception
    {
        if (size() <= 0) {
            throw new Exception("under flow");
        }
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }

    public int size()
    {
        return inbox.size() + outbox.size();
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

    public boolean isEmpty(){
        return inbox.isEmpty() & outbox.isEmpty();
    }
    
    public void clear(){
        inbox.clear();
        outbox.clear();
    }
}
