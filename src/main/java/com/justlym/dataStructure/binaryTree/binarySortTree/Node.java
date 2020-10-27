package com.justlym.dataStructure.binaryTree.binarySortTree;

import java.util.Objects;
import java.util.Stack;

/**
 * @author lym
 * 2020/10/17 1:23 下午
 */
public class Node {

    private Integer value;

    private Node left;

    private Node right;

    public Node(Integer value) {
        this.value = value;
    }

    public Node(Integer value, Node left, Node right) {
        this.value = value;
        this.left = left;
        this.right = right;
    }

    /**
     * 二叉树使用递归的方式添加节点
     * @param node 要添加的节点
     */
    public void add(Node node){
        if (Objects.isNull(node)) {
            return;
        }
        if (node.value < this.value) {
            if (this.left != null){
                this.left.add(node);
            } else {
                this.left = node;
            }
        } else {
            if (this.right != null) {
                this.right.add(node);
            } else {
                this.right = node;
            }
        }
    }

    /**
     * 使用循环的方式前序遍历二叉树
     */
    public void preOrderTraversal(){
        Stack<Node> stack = new Stack<>();
        stack.push(this);
        while (!stack.empty()) {
            Node node = stack.pop();
            System.out.println(node.value);

            if (node.right != null) {
                stack.push(node.right);
            }
            if (node.left != null){
                stack.push(node.left);
            }
        }
    }


    /**
     * 使用循环的方式中序遍历二叉树
     */
    public void inOrderTraversal(){
        Stack<Node> stack = new Stack<>();
        Node node = this;
        while (node != null || !stack.isEmpty()){
            while (node != null) {
                stack.push(node);
                node = node.left;
            }

            node = stack.pop();
            System.out.println(node.value);
            node = node.right;
        }
    }


    /**
     * 使用循环的方式后序遍历二叉树
     */
    public void postOrderTraversal(){
        Stack<Node> stack = new Stack<>();

        Node node = this;
        Node prev = null;
        while (node != null || !stack.isEmpty()){
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
            node = stack.pop();

            if (node.right == null || node.right == prev) {
                System.out.println(node.value);
                prev = node;
                node = null;
            } else {
                stack.push(node);
                node = node.right;
            }
        }
    }

    /**
     * 查找指定value值的节点
     * @param value 指定的节点值
     * @return 找到的节点
     */
    public Node searchTarget(int value){
        Node target = null;
        if (this.value == value) {
            target = this;
        } else if (value < this.value){
            if (this.left != null) {
                target = this.left.searchTarget(value);
            }
        } else {
            if (this.right != null) {
                target = this.right.searchTarget(value);
            }
        }
        return target;
    }

    /**
     * 查找指定value值的父节点
     * @param value 指定的节点值
     * @return 找到的节点
     */
    public Node searchTargetParent(int value){
        Node parent = null;
        if ((this.left!= null && this.left.value == value) || (this.right!= null && this.right.value == value)) {
            parent = this;
        } else {
            if (value < this.value && this.left != null) {
                parent = this.left.searchTargetParent(value);
            } else if (value > this.value && this.right != null){
                parent = this.right.searchTargetParent(value);
            }
        }
        return parent;
    }


    public Integer getValue() {
        return value;
    }

    public void setValue(Integer value) {
        this.value = value;
    }

    public Node getLeft() {
        return left;
    }

    public void setLeft(Node left) {
        this.left = left;
    }

    public Node getRight() {
        return right;
    }

    public void setRight(Node right) {
        this.right = right;
    }
}
