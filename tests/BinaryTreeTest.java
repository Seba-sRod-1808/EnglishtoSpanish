import org.junit.jupiter.api.Test;
import tree.BinaryTree;
import model.Association;

import static org.junit.jupiter.api.Assertions.*;

public class BinaryTreeTest {

    @Test
    void testInsertAndSearch() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        tree.insert(new Association<>("dog", "perro"));
        assertEquals("perro", tree.search("dog"));
    }

    @Test
    void testSearchNotFound() {
        BinaryTree<String, String> tree = new BinaryTree<>();
        assertNull(tree.search("cat"));
    }
}
