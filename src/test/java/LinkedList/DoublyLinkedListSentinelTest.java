package LinkedList;

import com.atbjtu.dataStructure.arrays.linkedList.DoublyLinkedListSentinel;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/14 11:18
 */
public class DoublyLinkedListSentinelTest {
    @Test
    public void test() {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        list.remove(4);
    }

    @Test
    public void addFirst() {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        assertIterableEquals(List.of(4, 3, 2, 1), list);
    }

    @Test
    public void removeFirst() {
        DoublyLinkedListSentinel list = getList();
        list.removeFirst();
        assertIterableEquals(List.of(2, 3, 4), list);
        list.removeFirst();
        assertIterableEquals(List.of(3, 4), list);
        list.removeFirst();
        assertIterableEquals(List.of(4), list);
        list.removeFirst();
        assertIterableEquals(List.of(), list);
        assertThrows(IllegalArgumentException.class, list::removeFirst);
    }

    @Test
    public void addLast() {
        DoublyLinkedListSentinel list = getList();
        assertIterableEquals(List.of(1, 2, 3, 4), list);
    }

    private DoublyLinkedListSentinel getList() {
        DoublyLinkedListSentinel list = new DoublyLinkedListSentinel();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    public void removeLast() {
        DoublyLinkedListSentinel list = getList();
        list.removeLast();
        assertIterableEquals(List.of(1, 2, 3), list);
        list.removeLast();
        assertIterableEquals(List.of(1, 2), list);
        list.removeLast();
        assertIterableEquals(List.of(1), list);
        list.removeLast();
        assertIterableEquals(List.of(), list);
        assertThrows(IllegalArgumentException.class, list::removeLast);
    }

    @Test
    public void insert() {
        DoublyLinkedListSentinel list = getList();
        list.insert(2, 5);
        assertIterableEquals(List.of(1, 2, 5, 3, 4), list);
        list.insert(5, 6);
        assertIterableEquals(List.of(1, 2, 5, 3, 4, 6), list);
        assertThrows(IllegalArgumentException.class, () -> list.insert(7, 7));
    }

    @Test
    public void remove() {
        DoublyLinkedListSentinel list = getList();
        list.remove(2);
        assertIterableEquals(List.of(1, 2, 4), list);
        assertThrows(IllegalArgumentException.class, () -> list.remove(10));

        DoublyLinkedListSentinel list2 = new DoublyLinkedListSentinel();
        assertThrows(IllegalArgumentException.class, () -> list2.remove(0));
    }
}
