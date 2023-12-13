package collectionApi.StackDemo;

import java.util.List;
import java.util.Stack;

public class StackDemo {
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack<>();
        // add new items
        stack.push(2);
        stack.push(4);
        stack.push(6);
        stack.push(8);
        stack.add(10);


        System.out.println(stack.search(8));
        System.out.println(stack);
        reverseString("hello");

    }
    // Hello -> h,e,l,l,o
    // chars -> h,e,l,l,o
    //olleH
    public static String reverseString(String s){
      // Create an empty stack
      //Java /avaJ
 StringBuilder res = new StringBuilder();
        //[J,a,c,K]

      Stack<Character> stack = new Stack<>();
      char[] chars = s.toCharArray();
        for (char c : chars) {
            stack.push(c);
        }
        while (!stack.isEmpty()){
         res.append(stack.pop());
        }
        return res.toString();
    }


}
