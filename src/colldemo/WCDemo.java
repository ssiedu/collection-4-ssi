package colldemo;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class WCDemo {
    public static void main(String[] args) {
        
        int x[]={100,20,25,30,40,5,55,18,19,120,12};
        for(int tmp:x){
            System.out.println(tmp);
        }
        System.out.println("_________________");
        System.out.println("After-Sorting");
        Arrays.sort(x);
        for(int tmp:x){
            System.out.println(tmp);
        }
        System.out.println("_________________");
        int idx=Arrays.binarySearch(x, 58);
        System.out.println("INDEX : "+idx);
        
        /*
        String e1="one",e2="two",e3="three",e4="four",e5="five";
        
        LinkedList list=new LinkedList();
        list.add(e1); list.add(e2); list.add(e3);
        System.out.println(list);
        list.addFirst(e4);
        System.out.println(list);
        list.add(2,e5);
        System.out.println(list);
        //list.removeFirst();
        //list.removeLast();
        list.remove(3);
        System.out.println(list);
        */
        /*
        Stack stk=new Stack();
        stk.push(e1); 
        stk.push(e2);
        stk.push(e3);
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        stk.pop();
        System.out.println(stk);
        */
    }
    
}
