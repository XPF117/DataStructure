package Array;

import com.atbjtu.dataStructure.arrays.DynamicArray;
import org.junit.Test;
import org.junit.jupiter.api.DisplayName;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertIterableEquals;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/11 13:35
 */
public class TestDynamicArray {
    @Test
    public void testDynamicArray() {
        DynamicArray array = new DynamicArray();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        array.addLast(5);
        System.out.println(array);
    }
    @Test
    public void testForEach() {
        DynamicArray array = new DynamicArray();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        array.addLast(5);
        array.foreach(
                (value) -> System.out.println(value)
        );
    }
    @Test
    @DisplayName("测试动态数组的扩容操作")
    public void testExpand() {
        DynamicArray array = new DynamicArray();
        array.addLast(1);
        array.addLast(2);
        array.addLast(3);
        array.addLast(4);
        array.addLast(5);
        array.addLast(6);
        array.addLast(7);
        array.addLast(8);
        array.addLast(9);

        assertIterableEquals(List.of(1, 2, 3, 4, 5, 6, 7, 8, 9), array);


    }
}
