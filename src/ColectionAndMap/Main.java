package ColectionAndMap;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        TreeSet<Student> studentTreeSet = new TreeSet<>(new OrderNoteComparator().reversed());

        // 1. versiyon
        Student st1 = new Student("Ahmet", 90);
        studentTreeSet.add(st1);

        // 2. versiyon (dont repeat yourself)
        studentTreeSet.add(new Student("Mustafa", 80));
        studentTreeSet.add(new Student("Beyza", 20));
        studentTreeSet.add(new Student("Cemrehan", 35));
        studentTreeSet.add(new Student("Zeynep", 50));

        for (Student stu : studentTreeSet) {
            System.out.println(stu.getName());
        }

        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();
        linkedHashSet.add(10);
        linkedHashSet.add(null);
        for (Integer hs : linkedHashSet) {
            System.out.println(hs);
        }


        System.out.println("================");

        Queue<String> q = new PriorityQueue<>(new Comparator<String>() {
            @Override
            public int compare(String o1, String o2) {
                return o1.compareTo(o2);
            }
        });

        q.add("Izmir");
        q.add("Istanbul");
        q.add("Bursa");
        q.add("Van");
        q.add("Ankara");

        for (String str : q) {
            System.out.println(str);
        }


        System.out.println("================");


        TreeMap<Integer, Student> studentTreeMap = new TreeMap<>(new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1 - o2;
            }
        });

        studentTreeMap.put(101, new Student("Mustafa", 80));
        studentTreeMap.put(102, new Student("Ahmet", 90));
        studentTreeMap.put(103, new Student("İrem", 70));

        for (Student stu : studentTreeMap.values()) {
            System.out.println(stu.getName());
        }

    }
}
