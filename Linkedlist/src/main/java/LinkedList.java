import java.util.Stack;

public class LinkedList {

    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

    }
    Node head;

    public void  addNode(int data){
        Node newNode = new Node(data);
        if (head == null){
            head = newNode;
            newNode.next = null;
        }else {
            Node currNode  = head;
            while (currNode.next != null){
                currNode = currNode.next;
            }
            currNode.next = newNode;
        }
    }
    public void addNodeInBeginning(int data){

        Node newNode = new Node(data);

        if (head == null){
            head = newNode;
        }else {
            newNode.next = head;
            head = newNode;
        }


    }
    public void printList(LinkedList linkedList){

        if (linkedList.head == null){
            System.out.println("List is empty");
        }

        Node currNode = linkedList.head;
        System.out.println(currNode.data);
        while (currNode.next != null){
            currNode = currNode.next;
            System.out.println(currNode.data);
        }
    }
    public void removeNode(int key){

        if (head == null){
            System.out.println("list is empty");
        }
        Node currNode  = head;
        Node prev = null;
        // Find the node to delete

        if (head != null  && head.data == key){
            head = currNode;
            return;
        }

        while (currNode != null && currNode.data != key){
            prev = currNode;
            currNode = currNode.next;
        }

        if (currNode == null){
            System.out.println("Node to be deleted not found");
            return;
        }
        prev.next = currNode.next;

    }

    public Node findMiddleElement(LinkedList list){

        Node currNode = list.head;
        if (currNode == null){
            System.out.println("list is empty");
            return null;
        }
        Node slow_ptr = currNode;
        Node fast_ptr = currNode;

        while (fast_ptr != null && fast_ptr.next != null){
            fast_ptr = fast_ptr.next.next;
            slow_ptr = slow_ptr.next;
        }
        return slow_ptr;

    }
    public void reverseList(){

        if (head == null){
            System.out.println("list is empty");
        }
        Node prev = null;
        Node curr = head;
        Node next = null;

        while (curr !=null){

            next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
        }
        head = prev;

    }
    // 0 1 2 3 4 5 6

    //
    public void rotateList(int k){
        Node currNode = head;
        for(int i=0; i<k; i++){
            currNode = currNode.next;
        }
        head = currNode.next;
        Node kNode = currNode;
        kNode.next = null;

        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = kNode;


    }
    public static Node checkIntersectionOfTwoLinkedlist(LinkedList linkedList, LinkedList linkedList1){

        Stack<Node> stack = new Stack<>();
        Stack<Node> stack1 = new Stack<>();

        Node currNode = linkedList.head;
        stack.push(currNode);

        while (currNode.next != null){
            currNode = currNode.next;
            stack.push(currNode);
        }

        Node currNode1 = linkedList1.head;
        stack1.push(currNode1);

        while (currNode1.next != null){
            currNode1 = currNode1.next;
            stack1.push(currNode1);
        }
        Node result = null;
        while (!stack.isEmpty() && !stack1.isEmpty()){

            if (stack.peek().data == stack1.peek().data){
                result = stack.pop();
                stack1.pop();
            }else {
                return result;
            }
        }
        return null;
    }
    public static void main(String[] args) {
        LinkedList linkedList = new LinkedList();
        linkedList.addNode(0);
        linkedList.addNode(1);
        linkedList.addNode(2);
        linkedList.addNode(3);
        linkedList.addNode(4);
        linkedList.addNode(5);
        linkedList.addNode(6);

        //linkedList.printList(linkedList);
//        linkedList.addNodeInBeginning(10);
//        linkedList.printList(linkedList);
//        linkedList.removeNode(4);
        System.out.println("first");
        linkedList.printList(linkedList);
//        System.out.println("middle element is: " + linkedList.findMiddleElement(linkedList).data);
//        linkedList.reverseList();
//        System.out.println("After reverse");
//        linkedList.printList(linkedList);
//        linkedList.rotateList(2);
//        System.out.println("rotate");
//        linkedList.printList(linkedList);

        LinkedList linkedList1 = new LinkedList();
        linkedList1.addNode(8);
        linkedList1.addNode(9);
        linkedList1.addNode(10);
        linkedList1.addNode(3);
        linkedList1.addNode(4);
        linkedList1.addNode(5);
        linkedList1.addNode(6);

        System.out.println("second");
//        linkedList1.printList(linkedList1);
        System.out.println(checkIntersectionOfTwoLinkedlist(linkedList,linkedList1).data);




    }
}
