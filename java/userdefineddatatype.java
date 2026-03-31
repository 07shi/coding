import java.util.*;
public class userdefineddatatype {
    public static class Student{
        String name;
        int rno;
        double cgpa;
        void print(){
            System.out.println(name+" "+rno+" "+cgpa+" ");
        }
    }
    public static void main(String args[]){
        Scanner  sc = new Scanner(System.in);
        Student s1 = new Student();
        s1.name = "Shivam";// decalration
        s1.rno = 23;
        s1.cgpa = 8.5;

        Student s2 = new Student();
        s2.name = "Abhay";// decalration
        s2.rno = 45;
        s2.cgpa = 9.0;

        Student s3 = new Student();
        s3.name = "Ateek";
        //s3.rno = 13;
        s3.rno = sc.nextInt();
        s3.cgpa = 8.9;
        System.out.println(s1.name+" "+s1.rno+" "+s1.cgpa+" ");
        s2.cgpa = 9.8;
        System.out.println(s3.rno);
        s1.print();
        s2.print();
        s3.print();
    }
}
