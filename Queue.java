package Practice;

import java.util.Stack;
public class Queue {
public static void main(String[]args){
        Queue m = new Queue();
        m.enQueue(40);
        m.enQueue(5);
        m.enQueue(6);
        m.enQueue(7);
        System.out.println(m.Dequeue() + " ");
        m.print();

}
    static Stack<Integer> s1 = new Stack<>();
    static Stack<Integer> s2 = new Stack<>();
    public Queue(){
        length = 0;
    }
    static int length = 0;
    public void enQueue(int a ){
        while(!s1.isEmpty()){
            s2.push(s1.pop());
        }
        s1.push(a);
        length++;
        while(!s2.isEmpty()){
            s1.push(s2.pop());
        }
    }
    public int Dequeue(){
        if(s1.isEmpty()){
            return -1;
        }
        int x = s1.peek();
        s1.pop();
        length--;
        return x;
    }

    public void print(){
        String s = s1.toString();
        String str = s.replace(']', ' ');
        String str2 = str.replace('[', ' ');
        StringBuilder sb = new StringBuilder(str2);
        System.out.println(sb.reverse().toString());
    }
}
