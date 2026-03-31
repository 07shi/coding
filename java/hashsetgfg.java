public class hashsetgfg {
    public static void main(String args[]){
        Hashset<Integer> set = new Hashset<>();
        set.add(77);
        set.add(65);
        set.add(21);
        set.add(2);
        System.out.println(set.size());
        System.out.println(set.contains(21)+" "set.contains(18));
        set.remove(21);
    }
}
