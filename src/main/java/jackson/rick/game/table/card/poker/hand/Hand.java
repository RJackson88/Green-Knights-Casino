/**
 * Created by rickjackson on 2/14/17.
 */
package jackson.rick.game.table.card.poker.hand;

import jackson.rick.cards.french.card.Card;
import jackson.rick.cards.french.rank.Ace;
import jackson.rick.cards.french.suit.Club;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.ListIterator;
import java.util.RandomAccess;
import java.util.Spliterator;
import java.util.function.Consumer;
import java.util.function.Predicate;
import java.util.function.UnaryOperator;

public class Hand<E> implements List<E>, RandomAccess, Cloneable, Serializable {
    private List<E> hand;
    
    public Hand(int initialCapacity) {
        hand = new ArrayList<>(initialCapacity);
    }
    
    public Hand() {
        hand = new ArrayList<>(5);
    }
    
    public Hand(Collection<? extends E> c) {
        hand = new ArrayList<E>(c);
    }
    
    public void trimToSize() {
        //hand.trimToSize();
    }
    
    public int size() {
        return hand.size();
    }
    
    public boolean isEmpty() {
        return hand.isEmpty();
    }
    
    public boolean contains(Object o) {
        return hand.contains(o);
    }
    
    public int indexOf(Object o) {
        return hand.indexOf(o);
    }
    
    public int lastIndexOf(Object o) {
        return hand.lastIndexOf(o);
    }
    
    //public Object clone() {
    //    return hand.clone();
    //}
    
    public Object[] toArray() {
        return hand.toArray();
    }
    
    public <T> T[] toArray(T[] a) {
        return hand.toArray(a);
    }
    
    public E get(int index) {
        return hand.get(index);
    }
    
    public E set(int index, E element) {
        return hand.set(index, element);
    }
    
    public boolean add(E e) {
        return hand.add(e);
    }
    
    public void add(int index, E element) {
        hand.add(index, element);
    }
    
    public E remove(int index) {
        return hand.remove(index);
    }
    
    public boolean remove(Object o) {
        return hand.remove(o);
    }
    
    public void clear() {
        hand.clear();
    }
    
    public boolean addAll(Collection<? extends E> c) {
        return hand.addAll(c);
    }
    
    public boolean addAll(int index, Collection<? extends E> c) {
        return hand.addAll(index, c);
    }
    
    //public void removeRange(int fromIndex, int toIndex) {
    //    hand.removeRange(fromIndex, toIndex);
    //}
    
    public boolean removeAll(Collection<?> c) {
        return hand.removeAll(c);
    }
    
    public boolean retainAll(Collection<?> c) {
        return hand.retainAll(c);
    }
    
    public ListIterator<E> listIterator(int index) {
        return hand.listIterator(index);
    }
    
    public ListIterator<E> listIterator() {
        return hand.listIterator();
    }
    
    public Iterator<E> iterator() {
        return hand.iterator();
    }
    
    public List<E> subList(int fromIndex, int toIndex) {
        return hand.subList(fromIndex, toIndex);
    }
    
    public void forEach(Consumer<? super E> action) {
        hand.forEach(action);
    }
    
    public Spliterator<E> spliterator() {
        return hand.spliterator();
    }
    
    public boolean removeIf(Predicate<? super E> filter) {
        return hand.removeIf(filter);
    }
    
    public void replaceAll(UnaryOperator<E> operator) {
        hand.replaceAll(operator);
    }
    
    public void sort(Comparator<? super E> c) {
        hand.sort(c);
    }
    
    public boolean containsAll(Collection<?> c) {
        return hand.containsAll(c);
    }
    
    public static void main(String[] args) {
        Hand hand = new Hand();
        hand.add(1);
    }
}
