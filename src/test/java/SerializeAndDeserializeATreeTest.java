import com.sun.source.tree.Tree;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SerializeAndDeserializeATreeTest {


    private static SerializeAndDeserializeATree serializeAndDeserializeATree;

    @BeforeAll
    public static void initialize(){
        serializeAndDeserializeATree = new SerializeAndDeserializeATree();
    }

    @Test
    public void serializeNullTest(){
        TreeNode rootNode = null;
        Assertions.assertEquals("n",serializeAndDeserializeATree.serialize(rootNode));
    }

    @Test
    public void serializeFistTest(){
        TreeNode root = new TreeNode(1);
        root.left = new TreeNode(2);
        root.right = new TreeNode(3);
        root.right.right = new TreeNode(5);
        root.right.left = new TreeNode(4);
        Assertions.assertEquals("1 2 3 n n 4 5 n n n n ",serializeAndDeserializeATree.serialize(root));
    }

    @Test
    public void deserializeTest(){
       Assertions.assertEquals(new TreeNode(3),serializeAndDeserializeATree.deserialize("1 2 3 n n 4 5 n n n n "));

    }
}