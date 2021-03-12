package LinkedList;

public class SingleLinkedListMain {
    public static void main(String[] args) {
        HeroNode hero1 = new HeroNode(1,"bao","b");
        HeroNode hero2 = new HeroNode(2,"liu","l");
        HeroNode hero3 = new HeroNode(3,"niu","n");
        HeroNode hero4 = new HeroNode(4,"gan","g");

        SinglelinkedList singlelinkedList = new SinglelinkedList();
        singlelinkedList.add(hero1);
        singlelinkedList.add(hero2);
        singlelinkedList.add(hero3);
        singlelinkedList.add(hero4);
        singlelinkedList.print();
    }

}
