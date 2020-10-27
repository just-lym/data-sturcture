package com.justlym.dataStructure.binaryTree.binarySortTree;

/**
 * @author lym
 * 2020/10/17 3:33 下午
 */
public class BinaryTree {

    private Node root;


    /**
     * 构建一个二叉排序树
     * @param value
     */
    public void add(Integer value){
        Node node = new Node(value);

        if (root == null) {
            root = node;
        } else {
            root.add(node);
        }
    }

    /**
     * 前序遍历
     */
    public void preOrderTraversal(){
        if (root == null) {
            System.out.println("root节点为空，不能进行遍历");
            return;
        }

        root.preOrderTraversal();
    }

    /**
     * 中序遍历
     */
    public void inOrderTraversal(){
        if (root == null) {
            System.out.println("root 节点为空，不能进行遍历");
            return;
        }
        root.inOrderTraversal();
    }


    /**
     * 后序遍历
     */
    public void postOrderTraversal(){
        if (root == null) {
            System.out.println("root 节点为空，不能进行遍历");
            return;
        }
        root.postOrderTraversal();
    }

    /**
     * 删除指定节点的值，有三种情况，叶子节点的，只有一个子树的，有两个子树的
     * @param node 需要删除的节点
     * @return 是否删除成功
     */
    public boolean delNode(Node node){
        if (root == null) {
            System.out.println("root 节点为空，删除失败");
            return false;
        }

        // 找到需要删除的节点
        Node target = root.searchTarget(node.getValue());

        if (target == null) {
            System.out.println("需要删除的节点不存在，删除失败");
            return true;
        }

        // 当前二叉树只有这一个节点，并且当前节点就是我们要删除的节点
        if (root.getLeft() == null && root.getRight() == null) {
            root = null;
            return true;
        }

        Node targetParent = root.searchTargetParent(node.getValue());

        // 如果要删除的节点是一个叶子节点
        if (target.getLeft() == null && target.getRight() == null) {
            if (targetParent.getLeft() == target)  {
                targetParent.setLeft(null);
            } else if (targetParent.getRight() == target) {
                targetParent.setRight(null);
            }
        // 要删除的节点是有两颗子树，从target的右子树向左找到最小的节点，将其删除，然后把这个值赋给target
        } else if (target.getLeft() != null && target.getRight() != null) {
            int value = delRightTreeMin(target.getRight());
            target.setValue(value);
        } else {
            // 如果当前要删除的节点只有一个子树，并且只有左子树
            if (target.getLeft() != null){
                // 存在有链式的树状，恰巧要删除的节点就是它的头节点
                if (targetParent != null) {
                    if (targetParent.getLeft().getValue() == target.getValue()) {
                        targetParent.setLeft(target.getLeft());
                    } else {
                        targetParent.setRight(target.getLeft());
                    }
                } else {
                    root = target.getLeft();
                }
            } else if (target.getRight() != null){
                if (targetParent != null) {
                    if (targetParent.getLeft().getValue() == target.getValue()) {
                        targetParent.setLeft(target.getRight());
                    } else {
                        targetParent.setRight(target.getRight());
                    }
                } else {
                    root = target.getRight();
                }
            }
        }
        return true;
    }

    /**
     * 删除指定节点的最小的节点
     * @param node
     * @return 最小节点的值
     */
    public int delRightTreeMin(Node node){
        Node target = node;
        while (target.getLeft() != null) {
            target = target.getLeft();
        }
        delNode(target);
        return target.getValue();
    }
}
