import java.util.ArrayList;

public class Student implements Methods {
    private String name;
    private int age;
    private group group;

    public Student() {
    }

    public Student(String name, int age, group group) {
        this.name = name;
        this.age = age;
        this.group = group;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public group getGroup() {
        return group;
    }

    public void setGroup(group group) {
        this.group = group;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", group=" + group +
                '}';
    }

    @Override
    public  void sortByGroup(ArrayList<Student> list, ArrayList<Student> java, ArrayList<Student> javaScript) {
        for (Student a : list) {
            if (a.getGroup().equals(group.JAVA)) {
                java.add(a);
            }
            if (a.getGroup().equals(group.JAVASCRIPT)) {
                javaScript.add(a);
            }
        }
        System.out.println("Java group: "+java);
        System.out.println("JavaScript: "+javaScript);
    }

    @Override
    public void sortByAge(ArrayList<Student> list, ArrayList<Student> sortByAge) {
        for (Student a : list) {
            if (a.getAge()>=19 && a.getAge()<=23){
                sortByAge.add(a);
            }
        }
        System.out.println("Sort by age: "+sortByAge);
    }

    @Override
    public void sortByLatter(ArrayList<Student> list, ArrayList<Student> sortByLatter) {
        for (Student a : list) {

            if (a.getName().startsWith("A")){
                sortByLatter.add(a);
            }
        }
        System.out.println("Sort by letter: "+sortByLatter);
    }
}
