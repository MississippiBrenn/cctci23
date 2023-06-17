public class NodeCustom {
    NodeCustom next = null;
    int data;

    public NodeCustom(int d ){
        data = d;
    }

    void AppendToTail(int d ){
        NodeCustom end = new NodeCustom(d);
        NodeCustom n = this;
        while(n.next != null){
            n = n.next;
        }
         n.next = end;

    }

}
