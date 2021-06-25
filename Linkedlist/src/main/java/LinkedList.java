public class LinkedList {

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
    public class Node{
        private int data;
        private Node next;

        public Node(int data){
            this.data = data;
            next = null;
        }

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
        linkedList.addNodeInBeginning(10);
//        linkedList.printList(linkedList);
        linkedList.removeNode(4);
        linkedList.printList(linkedList);


    }
}
