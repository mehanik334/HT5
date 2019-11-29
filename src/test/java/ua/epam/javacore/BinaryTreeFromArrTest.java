package ua.epam.javacore;

import org.junit.Assert;
import org.junit.Test;

public class BinaryTreeFromArrTest {

    private BinaryTreeFromArr treeFromArr = new BinaryTreeFromArr();

    @Test
    public void createTreeTestTrue() {
        BinaryTreeFromArr.Node node = new BinaryTreeFromArr.Node();
        int[] arr = {1,2,3,4};
        BinaryTreeFromArr.Node answerTop = new BinaryTreeFromArr.Node(1);
        BinaryTreeFromArr.Node answerLeft = new BinaryTreeFromArr.Node(2);
        BinaryTreeFromArr.Node answerRight = new BinaryTreeFromArr.Node(3);
        BinaryTreeFromArr.Node answerLeftLeft = new BinaryTreeFromArr.Node(4);
        answerTop.left = answerLeft;
        answerTop.right = answerRight;
        answerLeft.left = answerLeftLeft;
        answerLeft.right = null;
        BinaryTreeFromArr.Node res = treeFromArr.createTree(arr,node,0);
        Assert.assertEquals(treeFromArr.createTree(arr,node,0),res);
    }

}
