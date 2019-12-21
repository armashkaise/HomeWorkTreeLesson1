import java.util.LinkedList;

public class Main {

    public static void main(String[] args) {
        //Реализовать сравнение LinkedList
        MyLinkedList linkedList = new MyLinkedList();
        linkedList.add(1);
        linkedList.add(2);
        linkedList.add(3);

        MyLinkedList linkedList2 = new MyLinkedList();
        linkedList2.add(1);
        linkedList2.add(2);
        linkedList2.add(3);

        if (linkedList == linkedList2)
            System.out.println("Они равны");
        else
            System.out.println("Они не равны");

        if (linkedList.equals(linkedList2))
            System.out.println("Они одинаковы");
        else
            System.out.println("Они не одинаковы");

        //Реализовать вывод объекта LinkedList в читаемом виде, через переопределение  toString
        MyLinkedList linkedList3 = new MyLinkedList();
        linkedList3.add(1);
        linkedList3.add(2);
        linkedList3.add(3);
        System.out.println(linkedList3);
    }
}
