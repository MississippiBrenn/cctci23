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

    public static NodeCustom kthToLast(NodeCustom n, int k){
        NodeCustom kNode = n;
        while(kNode.next != null){

            for(int i = 0; i <= k; i++ ){
                kNode = n.next;
            }

            n = n.next;
            kNode = kNode.next;
        }
        return n;
    }

    // delete node in middle
    public static boolean deleteCurrNode (NodeCustom node){
        if(node == null || node.next == null){
            return false;
        }
        node.data = node.next.data;
        node.next = node.next.next;
        return true;
    }


    //partiion a linked list around a value x


//    public static NodeCustom partitionedNodes ( NodeCustom node, int partition){
//
//        NodeCustom beforePartitionStart = null;
//        NodeCustom beforePartitionEnd = null;
//        NodeCustom afterPartitionStart = null;
//        NodeCustom afterPartitionEnd = null;
//
//        while(node.next != null){
//            if(node.data >= partition){
//                if(beforePartitionStart == null) {
//                    beforePartitionStart = node;
//                    beforePartitionEnd = beforePartitionStart;
//                }else {
//                    beforePartitionEnd.next = node;
//                    beforePartitionEnd = node;
//                }
//            } else {
//                if(afterPartitionStart == null){
//                    afterPartitionStart = node;
//                    afterPartitionEnd = afterPartitionStart;
//                }else{
//                    afterPartitionEnd.next = node;
//                    afterPartitionEnd = node;
//                }
//            }
//
//            beforePartitionEnd.next = afterPartitionStart;
//            return beforePartitionStart;
//
//        }
//    }

}

