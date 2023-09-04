import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

class BSTTest {

    private BST<Integer> bst;

    @BeforeEach
    void setUp() {
        Comparator<Integer> comparator = Comparator.naturalOrder();
        bst = new BST<>(comparator);
    }

    @Test
    void insertTest() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);

        assertEquals(2, bst.findMin());
        assertEquals(7, bst.findMax());
        assertNotNull(bst.find(3));
    }

    @Test
    void deleteTest() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);

        assertTrue(bst.delete(3));
        assertFalse(bst.delete(6));

        assertNull(bst.find(3));
        assertEquals(2, bst.findMin());
        assertEquals(7, bst.findMax());
    }

    @Test
    void findSuccessorTest() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);
        bst.insert(4);
        bst.insert(6);
        bst.insert(8);

        Integer successor = bst.findSuccessor(3);

        assertEquals(4, successor);

        successor = bst.findSuccessor(7);

        assertEquals(8, successor);

        successor = bst.findSuccessor(9);

        assertNull(successor);
    }

    @Test
    void postOrderWalkTest() {
        bst.insert(5);
        bst.insert(3);
        bst.insert(7);
        bst.insert(2);

        List<Integer> executedValues = new ArrayList<>();
        bst.postOrderWalk(new IExecutor<Integer, Void>() {
            @Override
            public void execute(Integer key) {
                executedValues.add(key);
            }

            @Override
            public Void getResult() {
                return null;
            }
        });

        List<Integer> expectedValues = List.of(2, 3, 7, 5);

        assertEquals(expectedValues, executedValues);
    }
}