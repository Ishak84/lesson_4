import org.ietf.jgss.GSSName;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        ArrayList<String> listA = new ArrayList<>();
        ArrayList<String> listB = new ArrayList<>();
        ArrayList<String> listC = new ArrayList<>();

        System.out.println("Enter text one");
        for (int i = 0; i < 5; i++) {
            listA.add(scanner.nextLine());
        }

        Iterator<String> iteratorOne = listA.iterator();
        while (iteratorOne.hasNext()){
            System.out.println(iteratorOne.next());
        }

        System.out.println("Enter text two");
        for (int i = 0; i < 5; i++) {
            listB.add(scanner.nextLine());
        }

        Iterator<String> iteratorTwo = listB.iterator();
        while (iteratorTwo.hasNext()){
            System.out.println(iteratorTwo.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");

        listC.add(listA.get(1));
        listC.add(listB.get(4));
        listC.add(listA.get(2));
        listC.add(listB.get(4));
        listC.add(listA.get(3));
        listC.add(listB.get(3));
        listC.add(listA.get(4));
        listC.add(listB.get(2));
        listC.add(listA.get(4));
        listC.add(listB.get(1));

        Iterator<String> iteratorThree = listC.iterator();
        while (iteratorThree.hasNext()){
            System.out.println(iteratorThree.next());
        }

        System.out.println("+++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++++");
        listC.sort(Comparator.comparing(String::length));
        Iterator<String> iteratorFour = listC.iterator();
        while (iteratorFour.hasNext()){
            System.out.println(iteratorFour.next());
        }
    }
}