package Collectionsa.set;

public class hashSetstruct {
    public static void main(String[] args) {
        //创建一个数组，数组类型是node
        //直接把node[]数组成为表
        Node[] table = new Node[16];

        //创建结点
        Node jhon = new Node("jhon",null);
        Node jack = new Node("jack",null);
        Node rose = new Node("rose",null);
        jhon.next = jack;
        jack.next = rose;
        table[2] = jhon;

    }
}
class Node{
    Object item;
    Node next;
    public Node(Object item ,Node next){
        this.item = item;
        this.next = next;
    }
}
