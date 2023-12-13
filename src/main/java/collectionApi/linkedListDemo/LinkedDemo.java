package collectionApi.linkedListDemo;

import java.util.LinkedList;
import java.util.List;

public class LinkedDemo {
    public static void main(String[] args) {

        List<String> list = new LinkedList<>();
        list.add("hello");
        list.add("world");
        list.remove("hello");
        list.add(0,"Greetings ");

        System.out.println(list.contains("world"));
        System.out.println(list);
///[1][2][3][4][5][6][7]
        //  2002 node[null<-prev,"hello", next->2004]
        // 2004 node[2002<-prev,"world",>]
        // [1]->[3]->[4]
// ArrayList Vs LinkedList
        // List -> ArrayList
        // List,Queue, Deque ->LinkedList

        // element -> element only store data in ArrayList
        // element (Node)-> data next , previous in LinkedList

        //





    }
}
