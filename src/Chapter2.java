import java.util.LinkedList;

public class Chapter2 {

    //delete a node from a linked list
    public static void deleteFirstNode(LinkedList<Integer> list){
       list.remove();
    }

    //delete a node from NodeCustom closs
    public static void deleteFirstNodefromCustomClass(NodeCustom n){
        if(n.next != null){
            n = n.next;
        }else{
            n = null;
        }
    }


}

