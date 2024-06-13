package LinkedList;

import com.atbjtu.LinkedList.SinglyLinkedList;
import org.junit.Test;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/13 21:19
 */
public class SinglyListTest {

    @Test
    public void testRemove() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        list.remove(4);
        for(Integer value : list){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    @Test
    public void testAdd() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.add(4, 5);
        for(Integer value : list){
            System.out.print(value + " ");
        }
        System.out.println();
    }


    @Test
    public void test() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        list.loop1((value)-> System.out.println(value));

        System.out.println(list.get(10));
    }

    @Test
    public void testIterator() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);

        for (int value : list) {
            System.out.println(value);
        }
    }
}
