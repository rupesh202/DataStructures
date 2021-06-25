public class Stacks {

    static final int MAX = 10;
    int top;
    int[] stack = new int[MAX];
    public Stacks(){
        top = -1;
    }
    public boolean isEmpty(){
        return (top < 0);
    }
    public boolean isFull(){
        return (top > MAX -1);
    }

    public void push(int data){
        if (isFull()){
            System.out.println("stack over flow");
        }else {
            stack[++top] = data;
            System.out.println("item pushed");
        }
    }

    public int pop(){
        if (isEmpty()){
            System.out.println("Stack empty");
            return -1;
        }else {
            return stack[top--];
        }
    }

    public int peek(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        }else {
            return stack[top];
        }
    }

    public static void main(String[] args) {
        Stacks stacks = new Stacks();
        stacks.push(1);
        stacks.push(2);
        stacks.push(3);
        System.out.println(stacks.peek());
        stacks.pop();
        System.out.println(stacks.peek());
    }

}
