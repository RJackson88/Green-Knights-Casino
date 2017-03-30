package jackson.rick.util;

import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.lang.reflect.Array;
import java.util.*;
import java.util.function.Consumer;

/**
 * Created by rickjackson on 2/24/17.
 */
public class HybridLinkedList<E> implements List<E>, Deque<E>, Cloneable,
                                            Serializable
        // extends AbstractSequentialList<E>
{
    protected transient int modCount = 0;
    transient int size = 0;
    transient Node<E> first;
    transient Node<E> last;
    
    public HybridLinkedList() {
        
    }
    
    public HybridLinkedList(Collection<? extends E> c) {
        this();
        addAll(c);
    }
    
    private void linkFirst(E e) {
        final Node<E> first = this.first;
        final Node<E> newNode = new Node<>(null, e, first);
        this.first = newNode;
        
        if (first == null) {
            this.last = newNode;
        } else {
            first.prev = newNode;
        }
        size++;
        modCount++;
    }
    
    void linkLast(E e) {
        final Node<E> last = this.last;
        final Node<E> newNode = new Node<>(last, e, null);
        this.last = newNode;
        
        if (last == null) {
            this.first = newNode;
        } else {
            last.next = newNode;
        }
        size++;
        modCount++;
    }
    
    void linkBefore(E e, Node<E> succ) {
        final Node<E> pred = succ.prev;
        final Node<E> newNode = new Node<>(pred, e, succ);
        succ.prev = newNode;
        
        if (pred == null) {
            first = newNode;
        } else {
            pred.next = newNode;
        }
        size++;
        modCount++;
    }
    
    private E unlinkFirst(Node<E> first) {
        final E element = first.item;
        final Node<E> next = first.next;
        first.item = null;
        first.next = null;
        this.first = next;
        
        if (next == null) {
            this.last = null;
        } else {
            next.prev = null;
        }
        size--;
        modCount++;
        return element;
    }
    
    private E unlinkLast(Node<E> last) {
        final E element = last.item;
        final Node<E> prev = last.prev;
        last.item = null;
        last.prev = null;
        this.last = prev;
        
        if (prev == null) {
            this.first = null;
        } else {
            prev.next = null;
        }
        size--;
        modCount++;
        return element;
    }
    
    E unlink(Node<E> node) {
        final E element = node.item;
        final Node<E> next = node.next;
        final Node<E> prev = node.prev;
        
        if (prev == null) {
            this.first = null;
        } else {
            prev.next = next;
            node.prev = null;
        }
        
        if (next == null) {
            this.last = prev;
        } else {
            next.prev = prev;
            node.next = null;
        }
        node.item = null;
        size--;
        modCount++;
        return element;
    }
    
    public E getFirst() {
        final Node<E> first = this.first;
        
        if (first == null) {
            throw new NoSuchElementException();
        }
        return first.item;
    }
    
    public E getLast() {
        final Node<E> last = this.last;
        
        if (last == null) {
            throw new NoSuchElementException();
        }
        return last.item;
    }
    
    public E removeFirst() {
        final Node<E> first = this.first;
        
        if (first == null) {
            throw new NoSuchElementException();
        }
        return unlinkFirst(first);
    }
    
    public E removeLast() {
        final Node<E> last = this.last;
        
        if (last == null) {
            throw new NoSuchElementException();
        }
        return unlinkLast(last);
    }
    
    public void addFirst(E e) {
        linkFirst(e);
    }
    
    public void addLast(E e) {
        linkLast(e);
    }
    
    public boolean isEmpty() {
        return size() == 0;
    }
    
    public boolean contains(Object o) {
        return indexOf(o) != -1;
    }
    
    public int size() {
        return size;
    }
    
    public boolean add(E e) {
        linkLast(e);
        return true;
    }
    
    public boolean remove(Object o) {
        if (o == null) {
            for (Node<E> n = this.first; n != null; n = n.next) {
                if (n.item == null) {
                    unlink(n);
                    return true;
                }
            }
        } else {
            for (Node<E> n = this.first; n != null; n = n.next) {
                if (o.equals(n.item)) {
                    unlink(n);
                    return true;
                }
            }
        }
        return false;
    }
    
    public boolean containsAll(Collection<?> c) {
        for (Object e : c) {
            if (!contains(e)) {
                return false;
            }
        }
        return true;
    }
    
    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }
    
    public boolean addAll(int index, Collection<? extends E> c) {
        checkPositionIndex(index);
        
        Object[] a = c.toArray();
        int numNew = a.length;
        
        if (numNew == 0) {
            return false;
        }
        Node<E> pred, succ;
        
        if (index == size) {
            succ = null;
            pred = last;
        } else {
            succ = node(index);
            pred = succ.prev;
        }
        
        for (Object o : a) {
            @SuppressWarnings("unchecked")
            E e = (E) o;
            Node<E> newNode = new Node<>(pred, e, null);
            if (pred == null) {
                first = newNode;
            } else {
                pred.next = newNode;
            }
            pred = newNode;
        }
        
        if (succ == null) {
            last = pred;
        } else {
            pred.next = succ;
            succ.prev = pred;
        }
        size += numNew;
        modCount++;
        return true;
    }
    
    public boolean removeAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<?> it = iterator();
        
        while (it.hasNext()) {
            if (c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }
    
    public boolean retainAll(Collection<?> c) {
        Objects.requireNonNull(c);
        boolean modified = false;
        Iterator<E> it = iterator();
        
        while (it.hasNext()) {
            if (!c.contains(it.next())) {
                it.remove();
                modified = true;
            }
        }
        return modified;
    }
    
    public void clear() {
        for (Node<E> node = this.first; node != null; ) {
            Node<E> next = node.next;
            node.item = null;
            node.next = null;
            node.prev = null;
            node = next;
        }
        this.last = null;
        this.first = this.last;
        size = 0;
        modCount++;
    }
    
    public E get(int index) {
        checkElementIndex(index);
        return node(index).item;
    }
    
    public E set(int index, E element) {
        checkElementIndex(index);
        Node<E> node = node(index);
        E oldVal = node.item;
        node.item = element;
        return oldVal;
    }
    
    public void add(int index, E element) {
        checkPositionIndex(index);
        
        if (index == size) {
            linkLast(element);
        } else {
            linkBefore(element, node(index));
        }
    }
    
    public E remove(int index) {
        checkElementIndex(index);
        return unlink(node(index));
    }
    
    private boolean isElementIndex(int index) {
        return (index >= 0) && (index < size);
    }
    
    private boolean isPositionIndex(int index) {
        return (index >= 0) && (index <= size);
    }
    
    private String outOfBoundsMsg(int index) {
        return ("Index: " + index + ", Size: " + size);
    }
    
    private void checkElementIndex(int index) {
        if (!isElementIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    
    private void checkPositionIndex(int index) {
        if (!isPositionIndex(index)) {
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
        }
    }
    
    Node<E> node(int index) {
        if (index < (size >> 1)) {
            Node<E> node = this.first;
            
            for (int i = 0; i < index; i++) {
                node = node.next;
            }
            return node;
        } else {
            Node<E> node = this.last;
            
            for (int i = size - 1; i > index; i--) {
                node = node.prev;
            }
            return node;
        }
    }
    
    public int indexOf(Object o) {
        int index = 0;
        
        if (o == null) {
            for (Node<E> node = this.first; node != null; node = node.next) {
                if (node.item == null) {
                    return index;
                }
                index++;
            }
        } else {
            for (Node<E> node = this.first; node != null; node = node.next) {
                if (o.equals(node.item)) {
                    return index;
                }
                index++;
            }
        }
        return -1;
    }
    
    public int lastIndexOf(Object o) {
        int index = this.size;
        
        if (o == null) {
            for (Node<E> node = this.last; node != null; node = node.prev) {
                index--;
                
                if (node.item == null) {
                    return index;
                }
            }
        } else {
            for (Node<E> node = this.last; node != null; node = node.prev) {
                index--;
                
                if (o.equals(node.item)) {
                    return index;
                }
            }
        }
        return -1;
    }
    
    public E peek() {
        return (first == null) ? null : first.item;
    }
    
    public E element() {
        return getFirst();
    }
    
    public E poll() {
        return (first == null) ? null : unlinkFirst(first);
    }
    
    public E remove() {
        return removeFirst();
    }
    
    public boolean offer(E e) {
        return add(e);
    }
    
    public boolean offerFirst(E e) {
        addFirst(e);
        return true;
    }
    
    public boolean offerLast(E e) {
        addLast(e);
        return true;
    }
    
    public E peekFirst() {
        return (first == null) ? null : first.item;
    }
    
    public E peekLast() {
        return (last == null) ? null : last.item;
    }
    
    public E pollFirst() {
        return (first == null) ? null : unlinkFirst(first);
    }
    
    public E pollLast() {
        return (last == null) ? null : unlinkLast(last);
    }
    
    public void push(E e) {
        addFirst(e);
    }
    
    public E pop() {
        return removeFirst();
    }
    
    public boolean removeFirstOccurrence(Object o) {
        return remove(o);
    }
    
    /**
     *
     * TODO
     * FIXME
     * CHECK
     *
     */
    public boolean removeLastOccurrence(Object o) {
        for (Node<E> n = last; n != null; n = n.prev) {
            if (((n.item == null) ? n.item == null : o.equals(n.item))) {
                unlink(n);
                return true;
            }
        }
        return false;
    }
    
    private static class Node<E> {
        E item;
        Node<E> next;
        Node<E> prev;
        
        Node(Node<E> prev, E element, Node<E> next) {
            this.item = element;
            this.next = next;
            this.prev = prev;
        }
    }
    
    public Iterator<E> iterator() {
        return listIterator();
    }
    
    public ListIterator<E> listIterator() {
        return listIterator(0);
    }
    
    public ListIterator<E> listIterator(int index) {
        checkPositionIndex(index);
        return new ListItr(index);
    }
    
    private class ListItr implements ListIterator<E> {
        private Node<E> lastReturned;
        private Node<E> next;
        private int nextIndex;
        private int expectedModCount = modCount;
        
        ListItr(int index) {
            next = ((index == size) ? null : node(index));
            nextIndex = index;
        }
        
        public boolean hasNext() {
            return nextIndex < size;
        }
        
        public E next() {
            checkForComodification();
            
            if (!hasNext()) {
                throw new NoSuchElementException();
            }
            lastReturned = next;
            next = next.next;
            nextIndex++;
            return lastReturned.item;
        }
        
        public boolean hasPrevious() {
            return nextIndex > 0;
        }
        
        public E previous() {
            checkForComodification();
            
            if (!hasPrevious()) {
                throw new NoSuchElementException();
            }
            next = ((next == null) ? last : next.prev);
            nextIndex--;
            return lastReturned.item;
        }
        
        public int nextIndex() {
            return nextIndex;
        }
        
        public int previousIndex() {
            return nextIndex - 1;
        }
        
        public void remove() {
            checkForComodification();
            
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            Node<E> lastNext = lastReturned.next;
            unlink(lastReturned);
            
            if (next == lastReturned) {
                next = lastNext;
            } else {
                nextIndex--;
            }
            lastReturned = null;
            expectedModCount++;
        }
        
        public void set(E e) {
            if (lastReturned == null) {
                throw new IllegalStateException();
            }
            checkForComodification();
            lastReturned.item = e;
        }
        
        public void add(E e) {
            checkForComodification();
            lastReturned = null;
            
            if (next == null) {
                linkLast(e);
            } else {
                linkBefore(e, next);
            }
            nextIndex++;
            expectedModCount++;
        }
        
        public void forEachRemaining(Consumer<? super E> action) {
            Objects.requireNonNull(action);
            
            while ((modCount == expectedModCount) && (nextIndex < size)) {
                action.accept(next.item);
                lastReturned = next;
                next = next.next;
                nextIndex++;
            }
            checkForComodification();
        }
        
        final void checkForComodification() {
            if (modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
    }
    
    public Iterator<E> descendingIterator() {
        return new DescendingIterator();
    }
    
    private class DescendingIterator implements Iterator<E> {
        private final ListItr itr = new ListItr(size());
        
        public boolean hasNext() {
            return itr.hasPrevious();
        }
        
        public E next() {
            return itr.previous();
        }
        
        public void remove() {
            itr.remove();
        }
    }
    
    public List<E> subList(int fromIndex, int toIndex) {
        return (this instanceof RandomAccess
                ? new RandomAccessSubList<>(this, fromIndex, toIndex)
                : new SubList<>(this, fromIndex, toIndex));
    }
    
    public boolean equals(Object o) {
        if (o == this) {
            return true;
        }
        if (!(o instanceof List)) {
            return false;
        }
        ListIterator<E> e1 = listIterator();
        ListIterator<?> e2 = ((List<?>) o).listIterator();
        
        while (e1.hasNext() && e2.hasNext()) {
            E o1 = e1.next();
            Object o2 = e2.next();
            
            if (!(o1 == null ? o2 == null : o1.equals(o2))) {
                return false;
            }
        }
        return !(e1.hasNext() || e2.hasNext());
    }
    
    public int hashCode() {
        int hashCode = 1;
        
        for (E e : this) {
            hashCode = 31 * hashCode + (e == null ? 0 : e.hashCode());
        }
        return hashCode;
    }
    
    protected void removeRange(int fromIndex, int toIndex) {
        ListIterator<E> it = listIterator(fromIndex);
        
        for (int i = 0, n = toIndex - fromIndex; i < n; i++) {
            it.next();
            it.remove();
        }
    }
    
    @SuppressWarnings("unchecked")
    private HybridLinkedList<E> superClone() {
        try {
            return (HybridLinkedList<E>) super.clone();
        } catch (CloneNotSupportedException e) {
            throw new InternalError(e);
        }
    }
    
    public Object clone() {
        HybridLinkedList<E> clone = superClone();
        
        clone.first = null;
        clone.last = null;
        clone.size = 0;
        clone.modCount = 0;
        
        for (Node<E> n = first; n != null; n = n.next) {
            clone.add(n.item);
        }
        return clone;
    }
    
    public Object[] toArray() {
        Object[] result = new Object[size];
        int i = 0;
        
        for (Node<E> n = first; n != null; n = n.next) {
            result[i++] = n.item;
        }
        return result;
    }
    
    public <T> T[] toArray(T[] a) {
        if (a.length < size) {
            a = (T[]) Array.newInstance(a.getClass().getComponentType(), size);
        }
        int i = 0;
        Object[] result = a;
        
        for (Node<E> n = first; n != null; n = n.next) {
            result[i++] = n.item;
        }
        
        if (a.length > size) {
            a[size] = null;
        }
        return a;
    }
    
    // private static final long serialVersionUID = 876323262645176354L;
    
    private void writeObject(ObjectOutputStream s) throws IOException {
        s.defaultWriteObject();
        s.writeInt(size);
        
        for (Node<E> n = first; n != null; n = n.next) {
            s.writeObject(n.item);
        }
    }
    
    @SuppressWarnings("unchecked")
    private void readObject(ObjectInputStream s)
        throws IOException, ClassNotFoundException {
        s.defaultReadObject();
        int size = s.readInt();
        
        for (int i = 0; i < size; i++) {
            linkLast((E) s.readObject());
        }
    }
    
    @Override
    public Spliterator<E> spliterator() {
        return new HLLSpliterator<E>(this, -1, 0);
    }
    
    static final class HLLSpliterator<E> implements Spliterator<E>
    {
        static final int BATCH_UNIT = 1 << 10;
        static final int MAX_BATCH = 1 << 25;
        final HybridLinkedList<E> list;
        Node<E> current;
        int est;
        int expectedModCount;
        int batch;
        
        HLLSpliterator(HybridLinkedList<E> list, int est, int expectedModCount) {
            this.list = list;
            this.est = est;
            this.expectedModCount = expectedModCount;
        }
        
        final int getEst() {
            final HybridLinkedList<E> lst = list;
            int s = est;
            
            if (s < 0) {
                if (lst == null) {
                    est = 0;
                    s = est;
                } else {
                    expectedModCount = lst.modCount;
                    current = lst.first;
                    est = lst.size;
                    s = est;
                }
            }
            return s;
        }
        
        public long estimateSize() {
            return (long) getEst();
        }
        
        public Spliterator<E> trySplit() {
            Node<E> p = current;
            int s = getEst();
            
            if ((s > 1) && (p != null)) {
                int n = batch + BATCH_UNIT;
                
                if (n > s) {
                    n = s;
                }
                if (n > MAX_BATCH) {
                    n = MAX_BATCH;
                }
                Object[] a = new Object[n];
                int j = 0;
                
                do {
                    a[j++] = p.item;
                } while ((p = p.next) != null && j < n);
                current = p;
                batch = j;
                est = s - j;
                return Spliterators.spliterator(a, 0, j, Spliterator.ORDERED);
            }
            return null;
        }
        
        public void forEachRemaining(Consumer<? super E> action) {
            if (action == null) {
                throw new NullPointerException();
            }
            Node<E> p = current;
            int n = getEst();
            if (n > 0 && p != null) {
                current = null;
                est = 0;
    
                do {
                    E e = p.item;
                    p = p.next;
                    action.accept(e);
                } while (p != null & --n > 0);
            }
            if (list.modCount != expectedModCount) {
                throw new ConcurrentModificationException();
            }
        }
        
        public boolean tryAdvance(Consumer<? super E> action) {
            if (action == null) {
                throw new NullPointerException();
            }
            Node<E> p = current;
            
            if (getEst() > 0 && p != null) {
                --est;
                E e = p.item;
                current = p.next;
                action.accept(e);
                
                if (list.modCount != expectedModCount) {
                    throw new ConcurrentModificationException();
                }
                return true;
            }
            return false;
        }
        
        public int characteristics() {
            return Spliterator.ORDERED | Spliterator.SIZED
                   | Spliterator.SUBSIZED;
        }
    }
}

class SubList<E> extends HybridLinkedList<E> {
    private final HybridLinkedList<E> list;
    private final int offset;
    private int size;
    
    SubList(HybridLinkedList<E> list, int fromIndex, int toIndex) {
        if (fromIndex < 0)
            throw new IndexOutOfBoundsException("fromIndex = " + fromIndex);
        if (toIndex > list.size())
            throw new IndexOutOfBoundsException("toIndex = " + toIndex);
        if (fromIndex > toIndex)
            throw new IllegalArgumentException("fromIndex(" + fromIndex +
                                               ") > toIndex(" + toIndex + ")");
        this.list = list;
        offset = fromIndex;
        size = toIndex - fromIndex;
        this.modCount = this.list.modCount;
    }
    
    public E set(int index, E element) {
        rangeCheck(index);
        checkForComodification();
        return list.set(index + offset, element);
    }
    
    public E get(int index) {
        rangeCheck(index);
        checkForComodification();
        return list.get(index + offset);
    }
    
    public int size() {
        checkForComodification();
        return size;
    }
    
    public void add(int index, E element) {
        rangeCheckForAdd(index);
        checkForComodification();
        list.add(index + offset, element);
        this.modCount = list.modCount;
        size++;
    }
    
    public E remove(int index) {
        rangeCheck(index);
        checkForComodification();
        E result = list.remove(index + offset);
        this.modCount = list.modCount;
        size--;
        return result;
    }
    
    protected void removeRange(int fromIndex, int toIndex) {
        checkForComodification();
        list.removeRange(fromIndex + offset, toIndex + offset);
        this.modCount = list.modCount;
        size -= (toIndex-fromIndex);
    }
    
    public boolean addAll(Collection<? extends E> c) {
        return addAll(size, c);
    }
    
    public boolean addAll(int index, Collection<? extends E> c) {
        rangeCheckForAdd(index);
        int cSize = c.size();
        if (cSize==0)
            return false;
        
        checkForComodification();
        list.addAll(offset + index, c);
        this.modCount = list.modCount;
        size += cSize;
        return true;
    }
    
    public Iterator<E> iterator() {
        return listIterator();
    }
    
    public ListIterator<E> listIterator(final int index) {
        checkForComodification();
        rangeCheckForAdd(index);
        
        return new ListIterator<E>() {
            private final ListIterator<E> i = list.listIterator(index + offset);
            
            public boolean hasNext() {
                return nextIndex() < size;
            }
            
            public E next() {
                if (hasNext())
                    return i.next();
                else
                    throw new NoSuchElementException();
            }
            
            public boolean hasPrevious() {
                return previousIndex() >= 0;
            }
            
            public E previous() {
                if (hasPrevious())
                    return i.previous();
                else
                    throw new NoSuchElementException();
            }
            
            public int nextIndex() {
                return i.nextIndex() - offset;
            }
            
            public int previousIndex() {
                return i.previousIndex() - offset;
            }
            
            public void remove() {
                i.remove();
                SubList.this.modCount = list.modCount;
                size--;
            }
            
            public void set(E e) {
                i.set(e);
            }
            
            public void add(E e) {
                i.add(e);
                SubList.this.modCount = list.modCount;
                size++;
            }
        };
    }
    
    public List<E> subList(int fromIndex, int toIndex) {
        return new SubList<>(this, fromIndex, toIndex);
    }
    
    private void rangeCheck(int index) {
        if (index < 0 || index >= size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    
    private void rangeCheckForAdd(int index) {
        if (index < 0 || index > size)
            throw new IndexOutOfBoundsException(outOfBoundsMsg(index));
    }
    
    private String outOfBoundsMsg(int index) {
        return "Index: "+index+", Size: "+size;
    }
    
    private void checkForComodification() {
        if (this.modCount != list.modCount)
            throw new ConcurrentModificationException();
    }
}

class RandomAccessSubList<E> extends SubList<E> implements RandomAccess {
    RandomAccessSubList(HybridLinkedList<E> list, int fromIndex, int toIndex) {
        super(list, fromIndex, toIndex);
    }
    
    public List<E> subList(int fromIndex, int toIndex) {
        return new RandomAccessSubList<>(this, fromIndex, toIndex);
    }
}