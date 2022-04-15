package Practice;

import java.util.LinkedList;
import java.util.Queue;
//implement a stack using queue
public class Stack {
    public static void main(String[] args) {
        Stack s = new Stack();
        s.push(1);
        s.push(2);
        System.out.println(s.peek());
        s.pop();
        System.out.println(s.peek());
    }

    static int currentSize = 0;
    Stack(){
        currentSize = 0;
    }
    static Queue<Integer> q1 = new LinkedList<>();
    static Queue<Integer> q2 = new LinkedList<>();
    public static void push(int a){
        currentSize++;
        q2.add(a);
        while(!q1.isEmpty()){
            q2.add(q1.remove());
        }
        Queue<Integer> t = q1;
        q1 = q2;
        q2 = t;

    }
    public void pop(){
        if(q1.isEmpty()){
            return;
        }
        q1.remove();
        currentSize--;
    }
    public int size(){
        return currentSize;
    }
    public int peek(){
        if(q1.isEmpty()){
            return -1;
        }
        return q1.peek();
    }
}
