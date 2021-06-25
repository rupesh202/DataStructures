public class Queues {
    private int front, rear, capacity;
    private int queue[];

    public Queues(int capacity){
        front = rear =0;
        this.capacity = capacity;
        queue = new int[capacity];
    }
    public Boolean isEmpty(){
        return front == rear;
    }
    public Boolean isFull(){
        return rear == capacity;
    }
    public void push(int data){
        if (isFull()){
            System.out.println("queue is full");
        }else {
            queue[rear] = data;
            rear++;
        }
    }
    public int pop(){
        if (isEmpty()){
            System.out.println("queue is empty");
            return -1;
        }else {
            int popElement = queue[front];

            for (int i= 0;i<rear-1; i++){
                queue[i] = queue[i+1];
            }
            if (rear < capacity){
                queue[rear] = 0;
                rear--;
            }
            return popElement;
        }
    }
    public void printQueue(){

        for (int i= front; i< rear; i++){
            System.out.println(queue[i]);
        }
    }

    public static void main(String[] args) {
        Queues queue = new Queues(10);
        queue.push(1);
        queue.push(2);
        queue.push(3);
        queue.push(4);

//        queue.printQueue();

        queue.pop();
        queue.pop();
        queue.pop();
        queue.printQueue();
    }
}
