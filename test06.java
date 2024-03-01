import java.lang.reflect.Constructor;
import java.lang.reflect.Field;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.TreeMap;

class test06 {
    public static void main(String[] args) throws Exception {
        Class cls = String.class;
        System.out.println(cls);
        System.out.println("sss".getClass());
        // Class cls2 = Class.forName("java.lang.String");
        Integer n = 3;
        System.out.println(n instanceof Number);
        
        System.out.println(cls.isAnnotation());
        System.out.println(cls.getSimpleName());

        Class stdClass = Student.class;
        Field m = stdClass.getDeclaredField("grade");
        m.setAccessible(true);
        Student student = new Student();
        student.name = "ddda";

        m.set(student, 99);
        Object value = m.get(student);
        System.out.println(value);

        System.out.println(stdClass.getMethod("getScore", String.class));
        System.out.println(stdClass.getMethod("getName"));
        System.out.println(stdClass.getDeclaredMethod("getGrade", int.class));

        String s = "Hellow Dylan!";

        Method m2 = String.class.getMethod("substring", int.class);
        String r = (String) m2.invoke(s, 6);
        System.out.println(r);


        Method m3 = Integer.class.getMethod("parseInt", String.class);
        Integer n2 = (Integer) m3.invoke(null, "12345");
        System.out.println(n2);

        Person p = new Person();
        Method m4 = p.getClass().getDeclaredMethod("setName", String.class);
        m4.setAccessible(true);
        m4.invoke(p,"Bob");
        System.out.println(p.name);

        Method m5 = Person.class.getMethod("getName");
        m5.invoke(new Student());

        Constructor cons1 = Integer.class.getConstructor(int.class);
        Integer n1 = (Integer) cons1.newInstance(12121);
        System.out.println(n1);

        Constructor cons2 = Integer.class.getConstructor(String.class);
        Integer n3 = (Integer) cons2.newInstance("123123");
        System.out.println(n3);

        Class i = Integer.class;
        Class super2 = i.getSuperclass();

        System.out.println(super2);
        Class super3 = super2.getSuperclass();
        System.out.println(super3);
        System.out.println(super3.getSuperclass());

        Class[] is = i.getInterfaces();
        for(Class ii : is) {
            System.out.println(ii.getInterfaces());
        }
        System.out.println(java.io.DataInputStream.class.getSuperclass());

        System.out.println(Integer.class.isAssignableFrom(Integer.class));
    
        List<Integer> list = List.of(12,22,33);
        Integer[] array = list.toArray(new Integer[3]);
        Integer[] array2 = list.toArray(new Integer[list.size()]);
        Integer[] array3 = list.toArray(Integer[]::new);
        List<Integer> list2 = new ArrayList<>(Arrays.asList(array));

        list2.add(22);
        System.out.println(list2);

        Map<Student, Integer> map = new TreeMap<>(new Comparator<Student>(){
            public int compare(Student p1, Student p2){
                if (p1.score == p2.score){return 0;}
                return p1.score > p2.score ? -1:1;
            }
        });
        map.put(new Student("tom", 44), 1);
        map.put(new Student("bob", 42), 2);
        map.put(new Student("lily", 66), 3);
        System.out.println(map);

        
    
    
    }
}


class Person {
    public String name;
    public String getName(){
        System.out.println("PersonName" + name);
        return "PersonName" + name;
    }
    private void setName (String name){
        this.name = name;
    }
}

class Student extends Person {
    public int score;
    private int grade;
    Student(){}
    Student(String name, int score){
        this.name = name;
        this.score = score;
    }

    public String toString(){
        return String.format("{%s: score=%d}", name, score);
    }

    public int getScore(String type){
        return 99;
    }
    private int getGrade (int year) {
        return 3333;
    }
    public String getName(){
        System.out.println("StudentName" + name);
        return "StudentName" + name;
    }

    

}