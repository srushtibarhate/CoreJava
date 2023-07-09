package stack_interface_program;

import java.util.Stack;

public class stack1 {
    public static void main(String[] args) {
        Stack<Integer> st = new Stack<>();

        // push
        st.push(10);
        st.push(20);
        st.push(30);
        st.push(40);

        // peek
        System.out.println(st.peek());
        // pop
        //System.out.println(st.pop());

        while (!st.empty()) {
            System.out.println(st.pop());

        }
    }
}