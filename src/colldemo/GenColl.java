package colldemo;

import java.util.Stack;

public class GenColl {
    public static void main(String[] args) {
        
        Stack<String> stk1=new Stack<>();
        stk1.push("abc"); stk1.push("xyz");
        //stk1.push(10); stk1.push(20);
        
        Stack<Integer> stk2=new Stack<>();
        //stk2.push("abc"); stk2.push("xyz");
        stk2.push(10); stk2.push(20);
        
        Stack stk3=new Stack();
        stk3.push("abc"); stk3.push("xyz");
        stk3.push(10); stk3.push(20);
        
        
        
        String r1=stk1.pop();
        System.out.println(r1);
        
        Integer r2=stk2.pop();
        System.out.println(r2);
        
        Integer r3=(Integer)stk3.pop();
        
        System.out.println(r3);
       
        
        
        
    }
    
}
