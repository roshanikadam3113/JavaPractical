import java.util.*;
public class ImplementationStackQueue {
    public static void main(String args[]){
        Stack<Integer>s=new Stack<>();
        Queue<Integer>q=new LinkedList<>();

        //push elements to stack
        s.push(1);
        s.push(2);
        s.push(3);
        s.push(4);
        s.push(5);

        //print elements of stack
        System.out.println("Elemets in the stack:");
        while(!s.isEmpty()){
            System.out.print(s.pop()+" ");
        }
       System.out.println();
        //add elements to stack
        q.add(1);
        q.add(2);
        q.add(3);
        q.add(4);
        q.add(5);

        System.out.println("Elemets in the queue:");
        //print elements of queue
        while(!q.isEmpty()){
            System.out.print(q.remove()+" ");
        }
    }
}
