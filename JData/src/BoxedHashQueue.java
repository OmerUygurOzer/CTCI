import java.util.*;

/**
 * Created by Omer on 2/20/2017.
 */
public class BoxedHashQueue<T> implements Queue<T> {


    private int capacity;
    private BoxSelector<T> selector;
    private int size;
    private List<Box> boxes;
    private int curBox = -1;

    private BoxedHashQueue(int capacity,BoxSelector<T> selector){
        this.capacity = capacity;
        this.boxes    = new ArrayList<>();
        this.selector = selector;
        this.size = 0;
        for(int i = 0; i<capacity;i++){boxes.add(new Box());}
    }

    private int capacity(){
        return capacity;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public boolean isEmpty() {
        return size==0;
    }

    @Override
    public boolean contains(Object o) {
        T data = (T)o;
        int box = selector.getBox(data);
        return boxes.get(box).contains(data);
    }

    @Override
    public Iterator<T> iterator() {
        return new Iterator<T>() {
            @Override
            public boolean hasNext() {
                return false;
            }

            @Override
            public T next() {
                return null;
            }
        };
    }

    @Override
    public Object[] toArray() {
        return new Object[0];
    }

    @Override
    public <T1> T1[] toArray(T1[] a) {
        return null;
    }

    @Override
    public boolean add(T t) {
        int box = selector.getBox(t);
        Box b = boxes.get(box);
        if(!b.contains(t)){size++;b.add(t);return true;}
        return false;
    }

    @Override
    public boolean remove(Object o) {
        T data = (T)o;
        int box = selector.getBox(data);
        Box b = boxes.get(box);
        if(b.contains(data)){size--;b.remove(data);return true;}
        return false;
    }

    @Override
    public boolean containsAll(Collection<?> c) {
        for(Object o: c){if(!contains(o)){return false;}}
        return true;
    }

    @Override
    public boolean addAll(Collection<? extends T> c) {
        boolean flag = true;
        for(T t: c){flag &= add(t);}
        return flag;
    }

    @Override
    public boolean removeAll(Collection<?> c) {
        boolean flag = true;
        for(Object o: c){flag &= remove(o);}
        return flag;
    }

    @Override
    public boolean retainAll(Collection<?> c) {
        return false;
    }

    @Override
    public void clear() {
        for(Box b: boxes){b.clear();}
    }

    @Override
    public boolean offer(T t) {
        return add(t);
    }

    @Override
    public T remove() {
        return poll();
    }

    @Override
    public T poll() {
        if(isEmpty()){return null;}
        if(boxes.get(curBox).isEmpty()){getNextBox();}
        if(curBox==-1){return null;}
        return boxes.get(curBox).poll();
    }

    @Override
    public T element() {
        return null;
    }

    @Override
    public T peek() {
        if(isEmpty()){return null;}
        if(boxes.get(curBox).isEmpty()){getNextBox();}
        if(curBox==-1){return null;}
        return boxes.get(curBox).peek();
    }

    private int getNextBox(){
        for(int i = 0; i < capacity;i++){
            if(!boxes.get(i).isEmpty()){curBox = i;return i;}
        }
        return curBox=-1;
    }


    private  class Box{
        Map<T,Node> set = new HashMap<>();
        Node last;
        Node first;

        public void add(T data){
             Node node = new Node();
             node.data = data;
             set.put(data,node);
             if(first == null){first = node;}
             if(last == null){last=node;return;}
             last.next = node;
             node.prev = last;
             last = node;
        }

        public boolean contains(T data){
            return set.containsKey(data);
        }

        public void clear(){
            set.clear();
            last = null;
            first= null;
        }

        private void remove(T data){
            Node node = set.get(data);
            set.remove(data);
            if(node.prev!=null){node.prev.next = node.next;}
            if(node.next!=null){node.next.prev = node.prev;}
        }

        private T poll(){
            T data = last.data;
            set.remove(data);
            last = last.prev;
            return data;
        }

        private T peek(){
            return last.data;
        }

        private boolean isEmpty(){
            return set.isEmpty();
        }
    }

    private  class Node{
        T data;
        Node next;
        Node prev;

        @Override
        public int hashCode() {
            return data.hashCode();
        }

        @Override
        public boolean equals(Object obj) {
            Node inc = (Node)obj;
            return inc.data.equals(this.data);
        }
    }

    public interface BoxSelector<T>{
        int getBox(T o);
    }
}
