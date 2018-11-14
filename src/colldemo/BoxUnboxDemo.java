package colldemo;

import java.util.Stack;

public class BoxUnboxDemo {

    public static void main(String[] args) {
        Stack stk=new Stack();
        stk.push("one");
        //manual boxing
        //stk.push(new Integer(10));
        //stk.push(new Double(5.6));
        //auto boxing
        stk.push(10);
        stk.push(5.6);
        
        
        Double d1=(Double)stk.pop();
        //manual unboxing
        System.out.println(d1.doubleValue()*5);
        //auto unboxing
        System.out.println(d1*5);
        
        Integer i1=(Integer)stk.pop();
        //manual unboxing
        System.out.println(i1.intValue()/2);
        //auto unboxing
        System.out.println(i1/2);
        
        
        
        
        
        
    }
    
}
