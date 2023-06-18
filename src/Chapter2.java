import java.util.ArrayList;
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

    //remove dupes from singly linked list
    public static void deleteDupesFromCustomClass(NodeCustom n){

        ArrayList<Integer> nodeValues = new ArrayList<>();
        nodeValues.add(n.data);
        while(n.next != null){
            if (nodeValues.contains(n.next.data)) {
                n = n.next.next;
            }else{
                nodeValues.add(n.next.data);
                n = n.next;
            }

        }
    }

    // Implement an algorithm to find the kth to last element of a singly linked list






}

