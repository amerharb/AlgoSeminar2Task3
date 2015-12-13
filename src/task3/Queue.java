package task3;

import task1.Stack;

public class Queue<E>
{

    private Stack<E> inbox = new Stack<E>();
    private Stack<E> outbox = new Stack<E>();
    
    public void queue(E item)
    {
        inbox.push(item);
    }

    public E dequeue() throws Exception
    {
        if (size() <= 0){
            throw new Exception("under flow");
        }
        if (outbox.isEmpty()) {
            while (!inbox.isEmpty()) {
                outbox.push(inbox.pop());
            }
        }
        return outbox.pop();
    }
    
    public int size(){
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

}
