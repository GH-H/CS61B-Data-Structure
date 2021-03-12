package LinkedList;

public class SinglelinkedList {
    private HeroNode head = new HeroNode(0,"","");

    public void add(HeroNode heroNode){
        HeroNode temp = head;
        while(true){
            if(temp.next == null){
                break;
            }
            temp = temp.next;
        }
        temp.next = heroNode;
    }

    public void print(){
        if(head.next == null){
            System.out.println("list empty");
            return;
        }
        HeroNode temp = head.next;
        while(temp!=null){
            System.out.println(temp);
            temp = temp.next;
        }
    }
}

