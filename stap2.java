import java.util.Stack;


public class stap2 {
    //SIMPLE STACK STORING
//     public static void main(String[] args) {
//         Stack<Integer> s = new Stack<>();
//         s.push(4);
//         s.push(1);
//         s.push(2);
//         s.push(3);
//         while (!s.isEmpty()) {
//             System.out.println(s.peek());
//             s.pop();
//         }
//     }
// }
// USING FUNCTION 
public static void isbotam(Stack<Integer> s, int data){
    if(s.isEmpty()){
        s.push(data);
        return ;
    }
    int top =s.pop();
    isbotam(s,data);
    s.push(top);
}
public static 
public static void main(String[]args){
    Stack<Integer>s=new Stack<>();
    s.push(a);
    s.push(2);
    s.push(1);
    isbotam(s,4);
    while(!s.isEmpty()){
        System.out.println(s.pop());

    }
}
}
