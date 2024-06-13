package LinkedList;

import com.atbjtu.LinkedList.SinglyLinkedList;
import com.atbjtu.LinkedList.SinglyLinkedListSentinel;
import org.junit.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/13 22:59
 */
public class SinglyLinkedListSentinelTest {
    @Test
    public void testIterator() {
        SinglyLinkedListSentinel list = getList();
        for (int i : list) {
            System.out.println(i);
        }
        assertIterableEquals(List.of(4,3,2,1),list);

    }

    private static  SinglyLinkedListSentinel getList() {
        SinglyLinkedListSentinel list = new SinglyLinkedListSentinel();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        return list;
    }

}
