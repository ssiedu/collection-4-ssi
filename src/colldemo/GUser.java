package colldemo;

public class GUser {
    public static void main(String[] args) {
        GDemo<String> ob1=new GDemo<>();
        ob1.show("abcd");
        //ob1.show(10);
        
        GDemo<Integer> ob2=new GDemo<>();
        ob2.show(10);
        //ob2.show("abc");
        
        GDemo ob3=new GDemo();
        ob3.show(10);
        ob3.show("abc");
    }
    
}
