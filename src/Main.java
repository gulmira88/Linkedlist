import java.util.ArrayList;
import java.util.LinkedList;

public class Main {
    public static void main(String[] args) {

        LinkedList<Character>characters = new LinkedList<>();
        for (char i = 'A'; i < 'Z'; i++) {
            characters.add(i);
        }
        System.out.println(characters);

        LinkedList<Integer>integers = new LinkedList<>();
        for (int i = 0; i < 10; i++) {
            integers.add(i);
        }
        System.out.println(integers);

        ArrayList<Character>characters1= new ArrayList<Character>();
        for (char i = 'Z'; i >='A'; i--) {
            characters1.add(i);
        }
        System.out.println(characters1);

        ArrayList<Integer>integers1 = new ArrayList<>();
        for (int i = 10; i >=0; i--) {
            integers1.add(i);
        }
        System.out.println(integers1);
    }
}