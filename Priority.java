import java.util.PriorityQueue;
public class Priority {
    public static void main(String[]args){
        PriorityQueue<Integer> pq=new PriorityQueue<>(java.util.Collections.reverseOrder());
        pq.add(10);
        pq.add(20);
        pq.add(15);
    //     System.out.println(pq);
    //   pq.remove(20);
    //     pq.remove(15);
    //     System.out.println(pq.poll());
    //     System.out.println(pq.peek());
    while(!pq.isEmpty()){
        System.out.println(pq.peek());
        pq.remove();
    }

    }
    
}
