package colldemo;

import java.util.LinkedList;

public class StudColl {

    public static void main(String[] args) {
        Stud s1=new Stud(111,"AAA", "CS", 4);
        Stud s2=new Stud(112,"BBB", "IT", 3);
        Stud s3=new Stud(113,"CCC", "EC", 2);
        Stud s4=new Stud(114,"DDD","CIVIL",5);
        
        LinkedList<Stud> list=new LinkedList<>();
        list.add(s1);
        list.add(s2);
        list.add(s3);
        list.add(s4);
        
        for(Stud tmp:list){
            System.out.println(tmp);
        }
        
        
    }
    
}
