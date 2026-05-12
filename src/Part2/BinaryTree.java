package Part2;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Stack;

public class BinaryTree<T> implements Iterable<T>{
    Node root;

    class Node {
        T data;
        Node left;
        Node right;

        Node(T data){
            this.data = data;
        }
    }

    //Part 2.2
    BinaryTree(){
        root = null;
    }
    BinaryTree(T data){
        root = new Node(data);
    }
    BinaryTree(T data, BinaryTree<T> left, BinaryTree<T> right){
        root = new Node(data);
        root.left = left.root;
        root.right = right.root;
    }

    private List<T> postorder(Node node, List<T> list){
        if (node == null)
            return list;

        postorder(node.left, list);
        postorder(node.right, list);
        list.addLast(node.data);
        return list;
    }

//    @Override
//    public Iterator<T> iterator() {
//        return postorder(root, new LinkedList<>()).iterator();
//    }

    //Part 2.4

    public void inorderTraverse(){
        IO.println(inorder(root, new LinkedList<>()));
    }
    public void postorderTraverse(){
        IO.println(postorder(root, new LinkedList<>()));
    }
    public void preorderTraverse(){
        IO.println(preorder(root, new LinkedList<>()));
    }

    private List<T> inorder(Node node, List<T> list)
    {
        if (node == null)
            return list;
        inorder(node.left, list);
        list.addLast(node.data);
        inorder(node.right, list);
        return list;
    }

    private List<T> preorder(Node node, List<T> list)
    {
        if (node == null)
            return list;
        list.addLast(node.data);
        preorder(node.left, list);
        preorder(node.right, list);
        return list;
    }

    //Part 2.5
    class InorderIterator implements Iterator<T>{

        Stack<Node> stack = fillStack(root, new Stack<>());

        private Stack<Node> fillStack(Node node, Stack<Node> list)
        {
            if (node == null)
                return list;
            fillStack(node.right, list);
            list.push(node);
            fillStack(node.left, list);
            return list;
        }

        @Override
        public boolean hasNext() {
            return !stack.empty();
        }

        @Override
        public T next() {
            return stack.pop().data;
        }
    }

    @Override
    public Iterator<T> iterator() {
        return new InorderIterator();
    }

    //Part 2.6
    public int getSize(){
        return getSizeOfNode(root);
    }
    private int getSizeOfNode(Node node){
        if (node != null) {
            return 1 + getSizeOfNode(node.left)
                    + getSizeOfNode(node.right);
        }
        else return 0;
    }

}
