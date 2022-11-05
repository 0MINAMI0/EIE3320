import java.util.*;
public class MyStack<E>
{
    ArrayList<E> list = new ArrayList<>();
    @Override
    public String toString() {
        return "stack: " + list.toString();

    }

    public int getSize() {
        return list.size();
    }

    public E peek(){
        int i = this.getSize();
        return list.get(i-1);
    }

    public E pop(){
        int i = this.getSize();
        E tem = list.get(i-1);
        list.remove(i-1);
        return tem;
    }
    public void push(E o){
        int i = list.size();
        list.add(i,o);
    }

    public boolean isEmpty() {
        if(list.isEmpty()){
            return true;
        }
        else return false;
    }
}
