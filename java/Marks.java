public class Marks {
    public static clss StudentData{
        String name;
        int rno;
        int[] marks;
        StudentData(int s){
            marks = new int[s];
            

        }

    }
    public static void main(String args[]){
        StudentData s1 = new StudentData(4);// s1 wantds to store data of 4 subjects
        StudentData s2 = new StudentData(2);
        s1.marks[0] = 89;
        s1.marks[1] = 95;
        s1.marks[2] = 56;
        s1.marks[3] = 78;
    }
}
