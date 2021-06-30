import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTreeImpl{

    Node root;
    class Node {
        int data;
        Node left, right;

        public Node(int data){
            this.data = data;
            left = null;
            right = null;
        }
    }

    public void insert(int data){
        root = insertRecord(root, data);
    }
    public Node insertRecord (Node root, int data){

        if (root == null){
            root = new Node(data);
            return root;
        }

        if (data < root.data){
            root.left = insertRecord(root.left, data);
        }else {
            root.right = insertRecord(root.right, data);
        }
        return root;
    }

    public void inOrderTraversal(){
        inOrderTraversalImpl(root);
    }
    public void inOrderTraversalImpl(Node root){

        if (root != null){
            System.out.println(root.data);
            inOrderTraversalImpl(root.left);
            inOrderTraversalImpl(root.right);
        }

    }
    public void preOrder(){
        preOrderImpl(root);
    }
    public void preOrderImpl(Node root){

        if (root != null){
            preOrderImpl(root.left);
            System.out.println(root.data);
            preOrderImpl(root.right);
        }
    }

    public void printLevelOrder(){

        Queue<Node> queue = new LinkedList<>();
        queue.add(root);

        while(!queue.isEmpty()){

            Node currNode = queue.poll();
            System.out.println(currNode.data);

            if (currNode.left != null){
                queue.add(currNode.left);
            }
            if (currNode.right != null){
                queue.add(currNode.right);
            }
        }
    }
    public int maxElementInTree(){

        return maxElementInTreeImpl(root);
    }
    public int maxElementInTreeImpl(Node root){

        int maxValue = Integer.MIN_VALUE;

        if (root != null){

            int maxLeft = maxElementInTreeImpl(root.left);
            int maxRight = maxElementInTreeImpl(root.right);
            if (maxLeft > maxRight){
                maxValue = maxLeft;
            }else {
                maxValue = maxRight;
            }
            if (root.data > maxValue){
                maxValue = root.data;
            }
        }
        return maxValue;
    }
    public Boolean findAnElement(int key){
        return findAnElementImpl(root, key);
    }
    public Boolean findAnElementImpl(Node root, int key){

        if (root == null){
            return false;
        }
        if (root.data == key){
            return true;
        }
        boolean left = findAnElementImpl(root.left,key);
        boolean right =findAnElementImpl(root.right,key);

        if (left || right){
            return true;
        }else {
            return false;
        }
    }
    public int sizeOfBinaryTree(){
        return sizeOfBinaryTreeImpl(root);
    }
    public int sizeOfBinaryTreeImpl(Node root){

        if (root == null){
            return 0;
        }
        int left = sizeOfBinaryTreeImpl(root.left);
        int right = sizeOfBinaryTreeImpl(root.right);

        return left + right +1;

    }
    public int heightOfTree(){
       return heightOfTreeImpl(root);
    }
    public int heightOfTreeImpl(Node root){

        if (root == null){
            return 0;
        }
        int leftHeight = heightOfTreeImpl(root.left);
        int rightHeight = heightOfTreeImpl(root.right);

        if (leftHeight > rightHeight){
            return leftHeight + 1;
        }else {
            return rightHeight + 1;
        }
    }
    public int heightOfTreeWithOutRec(){
        return heightOfTreeWithOutRecImpl(root);
    }

    public int heightOfTreeWithOutRecImpl(Node root){
        if (root == null){
            return 0;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(root);
        Node currNode = null;
        int height =0;

        while (!queue.isEmpty()){
            int size = queue.size();
            while (size-- > 0){
                currNode = queue.poll();
                if (currNode.left !=null){
                    queue.add(currNode.left);
                }
                if (currNode.right != null){
                    queue.add(currNode.right);
                }
            }
            height++;
        }
        return height;
    }
    public int noOfLeaves(){
        int count =0;
        return noOfLeavesImpl(root,count);
    }
    public int noOfLeavesImpl(Node root, int count){

        if (root == null){
            return 0;
        }
        if (root.left == null && root.right == null){
            return 1;
        }
        int left = noOfLeavesImpl(root.left,count);
        int right = noOfLeavesImpl(root.right,count);
        return left + right;

    }
    public int fullNodes(){
        return fullNodesImpl(root);
    }

    public int fullNodesImpl(Node root){

        if (root == null){
            return 0;
        }
        int left = fullNodesImpl(root.left);
        int right = fullNodesImpl(root.right);

        if (root.left !=null && root.right != null){
            return 1;
        }
        return left + right;
    }

    public static Boolean checkIfSame(Node root1, Node root2){

        if (root1 == null && root2 == null){
            return true;
        }
        if (root1.data == root2.data){
            return true;
        }

        Boolean left = checkIfSame(root1.left, root2.left);
        Boolean right = checkIfSame(root1.right, root2.right);

        return (left && right);
    }
    public void mirrorImage(){
        mirrorImageImpl(root);
//        inOrderTraversal();
    }
    public void mirrorImageImpl(Node root){

        if (root == null){
            return;
        }

        Node temp = root.left;
        root.left = root.right;
        root.right = temp;

        mirrorImageImpl(root.left);
        mirrorImageImpl(root.right);
    }
    public Node findLCA(int node1, int node2){
        return findLCAImpl(root,node1,node2);
    }
    public Node findLCAImpl(Node root, int node1, int node2){

        if (root == null){
            return null;
        }

        if (root.data == node1 || root.data == node2){
            return root;
        }
        Node left =findLCAImpl(root.left,node1,node2);
        Node right = findLCAImpl(root.right,node1,node2);

        if (left != null && right !=null){
            return root;
        }else {
            if (left != null) {
                return left;
            } else {
                return right;
            }
        }
    }
    public void printAllAncestors(int key){
        printAllAncestorsImpl(root,key);
    }
    public boolean printAllAncestorsImpl(Node root, int key){

        if (root == null){
            return false;
        }

        if (root.data == key){
            return true;
        }
        Boolean left = printAllAncestorsImpl(root.left,key);
        Boolean right = printAllAncestorsImpl(root.right,key);

        if (left || right){
            System.out.println(root.data);
            return true;
        }else {
            return false;
        }
    }
    public void printZigZag(){

        if (root == null){
            return;
        }
        Stack<Node> currLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();

        currLevel.push(root);
        boolean leftToRight = true;

        while (!currLevel.isEmpty()){

            Node currNode = currLevel.pop();
            System.out.println(currNode.data);

            if (leftToRight){
                if (currNode.left != null){
                    nextLevel.push(currNode.left);
                }
                if (currNode.right != null){
                    nextLevel.push(currNode.right);
                }
            }else {
                if (currNode.right != null){
                    nextLevel.push(currNode.right);
                }
                if (currNode.left != null){
                    nextLevel.push(currNode.left);
                }
            }
            if (currLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currLevel;
                currLevel = nextLevel;
                nextLevel = temp;
            }
        }

    }

    public static void main(String[] args) {
        BinaryTreeImpl binaryTree = new BinaryTreeImpl();
        /*
                50
              /   \
            40    60
           / \   / \
         30  45 55  70

         */

        binaryTree.insert(50);
        binaryTree.insert(40);
        binaryTree.insert(30);
        binaryTree.insert(45);
        binaryTree.insert(60);
        binaryTree.insert(55);
        binaryTree.insert(70);


//        binaryTree.inOrderTraversal();
//        binaryTree.preOrder();
//        binaryTree.printLevelOrder();
        int maxElement = binaryTree.maxElementInTree();
//        System.out.println(maxElement);
        Boolean found = binaryTree.findAnElement(40);
//        System.out.println(found);

//        System.out.println(binaryTree.sizeOfBinaryTree());
        int height = binaryTree.heightOfTree();
//        System.out.println(height);
        int heightNonRec = binaryTree.heightOfTreeWithOutRec();
//        System.out.println(heightNonRec);
        int count = binaryTree.noOfLeaves();
//        System.out.println(count);
        // check this
        int fullNodes = binaryTree.fullNodes();
//        System.out.println(fullNodes);
//        binaryTree.mirrorImage();
        Node lca = binaryTree.findLCA(45,55);
//        System.out.println(lca.data);
//        binaryTree.printAllAncestors(70);
        binaryTree.printZigZag();


    }
}
