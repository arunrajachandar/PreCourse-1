// Time Complexity : O(1)
// Space Complexity : O(1)
// Did this code successfully run on Leetcode : Yes - used IntelliJ
// Any problem you faced while coding this : No


// Your code here along with comments explaining your approach

class StackAsLinkedList {

    StackNode root;

    static class StackNode {
        int data;
        StackNode next;

        StackNode(int data) {
            //Constructor here
            this.next = null;
            this.data = data;
        }
    }


    public boolean isEmpty() {
        //Write your code here for the condition if stack is empty.
        return this.root == null;
    }

    public void push(int data) {
        //Write code to push data to the stack.
        StackNode createStack = new StackNode(data);
        if (this.root != null) {
            createStack.next = this.root;
        }
        this.root = createStack;
    }

    public int pop() {
        //If Stack Empty Return 0 and print "Stack Underflow"
        // Write code to pop the topmost element of stack.
        //Also return the popped element
        if (this.root == null) {
            System.out.println("Stack Underflow");
            return 0;
        }
        int temp = this.root.data;
        this.root = this.root.next;
        return temp;
    }

    public int peek() {
        //Write code to just return the topmost element without removing it.
        return this.root != null ? this.root.data : 0;
    }

    //Driver code
    public static void main(String[] args) {
        StackAsLinkedList sll = new StackAsLinkedList();
        sll.push(10);
        sll.push(20);
        sll.push(30);
        System.out.println(sll.pop() + " popped from stack");
        System.out.println("Top element is " + sll.peek());
    }
} 
