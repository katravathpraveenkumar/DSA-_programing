import java.util.*;
public class stack{
    static ArrayList<Integer> list = new ArrayList<>();
    public static boolean isEmpty(){
        return list.size()==0;
    }
    public static void push(int data){
        list.add(data);
    }
    public static int pop(){
        int top=list.get(list.size()-1);
        list.remove(list.size()-1);
        return top;

    }
    public static int peek(){
        return list.get(list.size()-1);

    }
    public static void main(String[]args){
        push(1);
        push(2);
        push(3);
        while(!isEmpty()){
            System.out.println(peek());
            pop();

        }
    }


}
// SIMPLE STACK IMPLEMANTATION
public class STACK{
    public static void main(String[]args){
        Stack<Integer>s=new Stack<>();
        s.push(2);
        s.push(3);
        s.push(4);
        while(!isEmpty()){
            System.out.println(s.peek());
            s.pop();
        }
    }
}