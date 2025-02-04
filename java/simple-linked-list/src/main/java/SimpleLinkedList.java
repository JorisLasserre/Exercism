import java.util.NoSuchElementException;

class SimpleLinkedList<T> {

    private Node<T> head;
    private int size;
    public SimpleLinkedList() {
        this.head = null;
        this.size = 0;
    }

    public SimpleLinkedList(T[] values) {
        for (T value : values) {
            push(value);
        }
    }
    void push(T value) {
        Node<T> newNode = new Node<>(value);
        newNode.next = head;
        head = newNode;
        size++;
    }

     public T pop() {
         if (head == null) {
             throw new NoSuchElementException();
         }
         Node<T> currentHead = this.head;
         this.head = this.head.next;
         T value = currentHead.data;
         currentHead.data = null;
         currentHead.next = null;
         this.size--;
         return value;
     }

     public void reverse() {
         Node<T> prev = null;
         Node<T> current = head;
         while (current != null) {
             Node<T> next = current.next;
             current.next = prev;
             prev = current;
             current = next;
         }
         head = prev;
     }

     public T[] asArray(Class<T> clazz) {
         T[] array = (T[]) java.lang.reflect.Array.newInstance(clazz, size);
         Node<T> current = head;
         for (int i = 0; i < size; i++) {
             array[i] = current.data;
             current = current.next;
         }
         return array;
     }
    int size() {
        return this.size;
    }
}
