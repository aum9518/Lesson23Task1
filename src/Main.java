import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {

        //TODO Lesson task1
       /* Student деген класс тузунуз (свойства: name, age, group).
        ArrayList тузуп аны 10 студент менен толтурунуз.
        1) Бардык студенттердин маалыматтарын консолго чыгарыныз.
        2) Ошол ArrayList ти группасы боюнча фильтрация кылып 2 жаны листке
        салыныз(Java,JavaScript)
        3) Жашы 19 дан 23 ко чейинки студенттерди жаны листке салыныз.
        4) Аты "A"тамгасынан башталган студенттерди жаны листке салыныз
        Ар бир иш аракет учун озунчо метод тузуп, ал методдорду main класска чакырып иштетиниз.
                Маанилер main класстан берилуусу керек.*/


        Student student1 = new Student("Manas", 27,group.JAVA);
        Student student2 = new Student("Matmusa", 23,group.JAVA);
        Student student3 = new Student("Madina", 15,group.JAVA);
        Student student4 = new Student("Aizat", 16,group.JAVA);
        Student student5 = new Student("Aibek", 19,group.JAVASCRIPT);
        Student student6 = new Student("Torogeldi", 21,group.JAVA);
        Student student7 = new Student("Baktiyar", 28,group.JAVASCRIPT);
        Student student8 = new Student("Akyl", 21,group.JAVASCRIPT);
        Student student9 = new Student("juma", 22,group.JAVA);
        Student student10 = new Student("Bek", 17,group.JAVASCRIPT);
        ArrayList<Student>list = new ArrayList<>();
        list.add(student1);
        list.add(student2);
        list.add(student3);
        list.add(student4);
        list.add(student5);
        list.add(student6);
        list.add(student7);
        list.add(student8);
        list.add(student9);
        list.add(student10);
        ArrayList<Student>java=new ArrayList<>();
        ArrayList<Student>javaScript = new ArrayList<>();
        ArrayList<Student>sortByAge = new ArrayList<>();
        ArrayList<Student>sortByLetter = new ArrayList<>();
        for (Student a :list) {
            if (a.getGroup().equals(group.JAVA)){
                java.add(a);
            }
            if (a.getGroup().equals(group.JAVASCRIPT)){
                javaScript.add(a);
            }
            if (a.getAge()>=19 && a.getAge()<=23){
                sortByAge.add(a);
            }
            if (a.getName().startsWith("A")){
                sortByLetter.add(a);
            }
        }

        System.out.println("All students: "+list);
        System.out.println("Java group: "+java);
        System.out.println("JavaScript: "+javaScript);
        System.out.println("Sort by age: "+sortByAge);
        System.out.println("Sort by letter 'A' : "+sortByLetter);
    }
}