package colldemo;

public class Stud {

    private int rno;
    private String name;
    private String branch;
    private int sem;

    @Override
    public String toString() {
        return "Stud{" + "rno=" + rno + ", name=" + name + ", branch=" + branch + ", sem=" + sem + '}';
    }

    
    
    public Stud(int rno, String name, String branch, int sem) {
        this.rno = rno;
        this.name = name;
        this.branch = branch;
        this.sem = sem;
    }
    
    
    
}
