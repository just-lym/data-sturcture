package com.justlym.dataStructure.binaryTree.binarySortTree;

import org.junit.Test;

import java.util.Arrays;

/**
 * @author lym
 * 2020/10/17 6:39 下午
 */
public class BinarySortTreeTest {


    @Test
    public void testAdd(){
        BinaryTree binaryTree = new BinaryTree();
        Arrays.asList(7,3,10,12,5,1,9).stream().forEach(item->{
            binaryTree.add(item);
        });

        binaryTree.inOrderTraversal();

        System.out.println("----------------------");
        binaryTree.delNode(new Node(1));
        binaryTree.delNode(new Node(3));
        binaryTree.delNode(new Node(10));
        binaryTree.delNode(new Node(12));
        binaryTree.delNode(new Node(5));
        binaryTree.delNode(new Node(9));
        binaryTree.delNode(new Node(7));
        binaryTree.inOrderTraversal();
    }
}
