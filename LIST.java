public class LIST {
    static class Node {
        int value;
        Node next;

        Node(int value) {
            this.value = value;
        }
    }

    static class LinkedList {
        Node head;

        void addFirst(int value) {
            Node newNode = new Node(value);
            newNode.next = head;
            head = newNode;
        }

        void addLast(int value) {
            Node newNode = new Node(value);
            if (head == null) {
                head = newNode;
                return;
            }

            Node temp = head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }

        private Node getMid(Node head) {
            Node slow = head;
            Node fast = head;
            while (fast.next != null && fast.next.next != null) {
                slow = slow.next;
                fast = fast.next.next;
            }
            return slow;
        }

        private Node merge(Node head1, Node head2) {
            Node mergedLL = new Node(-1);
            Node temp = mergedLL;

            while (head1 != null && head2 != null) {
                if (head1.value < head2.value) {
                    temp.next = head1;
                    head1 = head1.next;
                } else {
                    temp.next = head2;
                    head2 = head2.next;
                }
                temp = temp.next;
            }

            while (head1 != null) {
                temp.next = head1;
                head1 = head1.next;
                temp = temp.next;
            }

            while (head2 != null) {
                temp.next = head2;
                head2 = head2.next;
                temp = temp.next;
            }

            return mergedLL.next;
        }

        public Node mergeSort(Node head) {
            if (head == null || head.next == null) {
                return head;
            }

            Node mid = getMid(head);
            Node rightHead = mid.next;
            mid.next = null;

            Node newLeft = mergeSort(head);
            Node newRight = mergeSort(rightHead);
            return merge(newLeft, newRight);
        }

        @Override
        public String toString() {
            StringBuilder sb = new StringBuilder();
            Node temp = head;
            sb.append("[");
            while (temp != null) {
                sb.append(temp.value);
                if (temp.next != null) {
                    sb.append(", ");
                }
                temp = temp.next;
            }
            sb.append("]");
            return sb.toString();
        }
    }

    public static void main(String[] args) {
        LinkedList ll = new LinkedList();
        ll.addFirst(0);
        ll.addLast(1);
        ll.addLast(2);
        ll.addLast(3);
        System.out.println(ll);
        ll.head = ll.mergeSort(ll.head);
        System.out.println(ll);
    }
}