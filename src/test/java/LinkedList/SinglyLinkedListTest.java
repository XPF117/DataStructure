package LinkedList;

import com.atbjtu.LinkedList.SinglyLinkedList;
import org.junit.Test;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/13 21:19
 */
public class SinglyLinkedListTest {

    @Test
    public void testRemove() {
        SinglyLinkedList list = getList();
        list.remove(4);
        for(Integer value : list){
            System.out.print(value + " ");
        }
        System.out.println();
    }

    @Test
    public void testAdd() {
        SinglyLinkedList list = getList();

        list.add(4, 5);
        for(Integer value : list){
            System.out.print(value + " ");
        }
        System.out.println();
    }


    @Test
    public void test() {
        SinglyLinkedList list = getList();

        list.loop1((value)-> System.out.println(value));

        System.out.println(list.get(10));
    }

    @Test
    public void testIterator() {
        SinglyLinkedList list = getList();

        for (int value : list) {
            System.out.println(value);
        }
    }

    private static SinglyLinkedList getList() {
        SinglyLinkedList list = new SinglyLinkedList();
        list.addFirst(1);
        list.addFirst(2);
        list.addFirst(3);
        list.addFirst(4);
        return list;
    }

    @Test
    public void testLoop3() {
        SinglyLinkedList list = getList();
        list.loop3();
    }
}
