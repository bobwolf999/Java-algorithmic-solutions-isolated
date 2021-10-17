import java.util.LinkedList;

public class MiddleLinkedList {

    public static void findMiddle(LinkedList list1){

        int listSize = list1.size();

        System.out.println( list1.get(listSize/2));

    }

    public static void main(String[] args){

        LinkedList<Integer> list1 = new LinkedList<>();

        list1.add(1);
        list1.add(3);
        list1.add(14);
        list1.add(22);
        list1.add(53);
        list1.add(72);
        list1.add(109);

        findMiddle(list1);
    }
}
