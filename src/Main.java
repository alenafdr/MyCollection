import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        ArrayList<Integer> myCollection = new MyCollection();
        try {
            myCollection.add(2_147_483_647);
            System.out.println(myCollection);
            myCollection.add(1);
            System.out.println(myCollection);
            myCollection.add(1);
            System.out.println(myCollection);
            myCollection.add(1, 1);
            System.out.println(myCollection);
            myCollection.remove(0);
            System.out.println(myCollection);
            myCollection.remove(new Integer(-2));
            System.out.println(myCollection);
        } catch (Exception e) {
            System.out.println(e.toString());
        }
    }
}
