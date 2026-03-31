class Student{
    String name;// null
    private int rno;// we cant touch it yani ched nhi skte//0
    double cgpa;// 0.0
    void print(){// getter
        System.out.println(name+" "+rno+" "+cgpa);
    }
    int getRno(){// getter
        return rno;
    }
    void setRno(int x){// setter
        rno = x;
    }

}
public class PrivateKeyword{
    public static void main(String args[]){
        Student s1 = new Student();
        //s1.print();
        //System.out.println(s1.rno);
        s1.cgpa = 8.9;
        //System.out.println(s1.cgpa);
        s1.name = "Hemant";
        //s1.rno = 76; this was giving error 
        //s1.print();
        s1.setRno(45);
        System.out.println(s1.getRno());

    }
}
