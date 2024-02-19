package testflord;

import java.util.*;
import java.lang.reflect.*;


public class test05 {
    public static void main(String[] args) throws Exception {
        int[] array = new int[5];

        List<String> arrayList = new ArrayList<>();
        List<Integer> linkedList = new LinkedList<>();

        Set<String> hashSet = new HashSet<>();
        Set<Integer> treeSet = new TreeSet<>();

        Map<String, Integer> hashMap = new HashMap<>();
        Map<String, Integer> treeMap = new TreeMap<>();

        Stack<Integer> stack = new Stack<>();
        Queue<String> quene = new LinkedList<>();

        PriorityQueue<Integer> minHeap = new PriorityQueue<>();
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());

        class TreeNode {
            int val;
            TreeNode left;
            TreeNode right;
            TreeNode(int x){
                val = x;
            }

        }
        Class stdClass = Student.class;
        // 获取public字段"score":
        System.out.println(stdClass.getField("score"));
        // 获取继承的public字段"name":
        System.out.println(stdClass.getField("name"));
        // 获取private字段"grade":
        System.out.println(stdClass.getDeclaredField("grade"));


        Field f = String.class.getDeclaredField("value");
        f.getName(); // "value"
        f.getType(); // class [B 表示byte[]类型
        
        int m = f.getModifiers();
        System.out.println(""+
            Modifier.isFinal(m)+" "+ // true
            Modifier.isPublic(m)+" "+ // false
            Modifier.isProtected(m)+" "+ // false
            Modifier.isPrivate(m)+" "+ // true
            Modifier.isStatic(m) // false


        );

        
    }
}

class Student extends Person {
    public int score;
    private int grade;
}

class Person {
    public String name;
}
