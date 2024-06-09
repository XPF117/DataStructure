import org.junit.Test;

import static com.atbjtu.InitialKnowledgeAlgorithm.BinarySearch.binarySearchBasic;
import static com.atbjtu.InitialKnowledgeAlgorithm.BinarySearch.binarySearchSecond;
import static org.junit.Assert.assertEquals;

/**
 * @author: PengfeiXi
 * @description:
 * @date: 2024/6/8 22:27
 */
public class BinarySearchTest {
    @Test
    public void testBinarySearchBasic() {
        int[] A = {3,9,18,21,25,30,35,49,52,66};
        assertEquals(binarySearchBasic(A, 3), 0);
        assertEquals(binarySearchBasic(A, 9), 1);
        assertEquals(binarySearchBasic(A, 18), 2);
        assertEquals(binarySearchBasic(A, 21), 3);
        assertEquals(binarySearchBasic(A, 25), 4);
        assertEquals(binarySearchBasic(A, 30), 5);
        assertEquals(binarySearchBasic(A, 35), 6);
        assertEquals(binarySearchBasic(A, 49), 7);
        assertEquals(binarySearchBasic(A, 52), 8);
        assertEquals(binarySearchBasic(A, 66), 9);

        assertEquals(binarySearchBasic(A, 1), -1);
        assertEquals(binarySearchBasic(A, 20), -1);
        assertEquals(binarySearchBasic(A, 26), -1);
        assertEquals(binarySearchBasic(A, 53), -1);
    }
    @Test
    public void testBinarySearchSecond() {
        int[] A = {3,9,18,21,25,30,35,49,52,66};
        assertEquals(binarySearchSecond(A, 3), 0);
        assertEquals(binarySearchSecond(A, 9), 1);
        assertEquals(binarySearchSecond(A, 18), 2);
        assertEquals(binarySearchSecond(A, 21), 3);
        assertEquals(binarySearchSecond(A, 25), 4);
        assertEquals(binarySearchSecond(A, 30), 5);
        assertEquals(binarySearchSecond(A, 35), 6);
        assertEquals(binarySearchSecond(A, 49), 7);
        assertEquals(binarySearchSecond(A, 52), 8);
        assertEquals(binarySearchSecond(A, 66), 9);

        assertEquals(binarySearchSecond(A, 1), -1);
        assertEquals(binarySearchSecond(A, 20), -1);
        assertEquals(binarySearchSecond(A, 26), -1);
        assertEquals(binarySearchSecond(A, 53), -1);
    }
}
