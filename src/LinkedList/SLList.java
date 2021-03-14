package LinkedList;

public class SLList {
    //节点
    public static class IntNode {
        public int item;
        public IntNode next;

        public IntNode(int item, IntNode next) {
            this.item = item;
            this.next = next;
        }
    }

    private IntNode head;
    private int size;

    public SLList(){
        this.head = new IntNode(666,null);
        size = 0;
    }
    //initialize
    public SLList(int x) {
        this.head = new IntNode(666,null);
        this.head.next = new IntNode(x,null);
        size = 1;
    }

    //add to the front of the list
    public void addFirst(int x){
        head.next = new IntNode(x, head.next);
        size+=1;
    }

    //add element to the end
    public void addLast(int x){
        IntNode p = head;//相当于指针

        while(p.next != null){
            p = p.next;
        }
        p.next = new IntNode(x,null);
        size+=1;
    }

    public int size(){
        return size;
    }

    //returns first item int the list
    public int getHead(){
        return head.next.item;
    }

    public static void main(String[] args) {
        SLList L = new SLList(10);

    }
}
