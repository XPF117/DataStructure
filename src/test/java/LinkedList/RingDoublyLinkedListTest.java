package LinkedList;

import com.atbjtu.dataStructure.arrays.linkedList.RingDoublyLinkedListAddFirst;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/14 13:34
 */
public class RingDoublyLinkedListTest {
    @Test
    public void addFirst() {
        RingDoublyLinkedListAddFirst list = getListAddFirst();
        assertIterableEquals(List.of (4, 3, 2, 1), list);
    }

    private static RingDoublyLinkedListAddFirst getListAddFirst() {
        RingDoublyLinkedListAddFirst list = new RingDoublyLinkedListAddFirst();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        return list;
    }

    @Test
    public void removeFirst() {
        RingDoublyLinkedListAddFirst list = getListAddFirst();
        list.removeFirst();
        assertIterableEquals(List.of(3,2,1), list);
        list.removeFirst();
        assertIterableEquals(List.of(2,1), list);
        list.removeFirst();
        assertIterableEquals(List.of(1), list);
        list.removeFirst();
        assertIterableEquals(List.of(), list);
        assertThrows(IllegalArgumentException.class, list::removeFirst);
    }
    //链表中的元素为[1,2,3,4]
    private RingDoublyLinkedListAddFirst getList() {
        RingDoublyLinkedListAddFirst list = new RingDoublyLinkedListAddFirst();
        list.addLast(1);
        list.addLast(2);
        list.addLast(3);
        list.addLast(4);
        return list;
    }

    @Test
    public void removeLast() {
        RingDoublyLinkedListAddFirst list = getList();
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
    public void removeByValue() {
        RingDoublyLinkedListAddFirst list = getList();
        list.removeByValue(2);
        assertIterableEquals(List.of(1, 3, 4), list);
        list.removeByValue(1);
        assertIterableEquals(List.of(3, 4), list);
        list.removeByValue(4);
        assertIterableEquals(List.of(3), list);
        list.removeByValue(3);
        assertIterableEquals(List.of(), list);
        list.removeByValue(5);
        assertIterableEquals(List.of(), list);
    }
}
