import java.util.*;
public class MyQueue<E>
{
      private LinkedList<E> list 
    = new LinkedList<E>();
    @Override
 public String toString() {
 return "stack: " + list.toString();}
 
  public void enqueue(E e) {
	  list.addLast(e);
  }
  
    public E dequeue() {
	  return list.removeFirst();
  }
  
    public int getSize() {
	  return list.size();
  }
 }

