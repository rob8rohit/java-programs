
    import java.util.*;

public class StackOperation {
    private Deque<Integer> stack;
    public StackOperation() {
        stack = new ArrayDeque<>();
    
    }
    public void push(int value) {
        stack.push(value); 
        System.out.println("Pushed " + value + " onto the stack.");
    }
    public Integer pop(){
        if (stack.isEmpty()) {
            System.out.println("Stack is empty, cannot pop.");
            return null;
        }
        Integer poppedValue = stack.pop(); 
        System.out.println("Popped " + poppedValue + " from the stack.");
        return poppedValue;
    }
    public int size() {
        return stack.size();
    }
    public boolean isEmpty() {
        return stack.isEmpty();
    }
    public Integer peek() {
        if (stack.isEmpty()) {
            System.out.println("Stack is empty.");
            return null;
        }
        return stack.peek();
    }
    public void printStack() {
        System.out.println("Current stack: " + stack);
    }

    public static void main(String[] args) {
        StackOperation stackOps = new StackOperation();
        stackOps.push(10);
        stackOps.push(20);
        stackOps.push(30);
        stackOps.pop();
        stackOps.pop();
        System.out.println("Stack size: " + stackOps.size());
        System.out.println("Is stack empty? " + stackOps.isEmpty());
        System.out.println("Top element: " + stackOps.peek());
        stackOps.printStack();
    }
}

    

