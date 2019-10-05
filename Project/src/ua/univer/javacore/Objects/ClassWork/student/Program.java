package ua.univer.javacore.Objects.ClassWork.student;
import ua.univer.javacore.Objects.ClassWork.student.StudList;
public class Program {
    public static void main(String[] args) {
        Student Petrenko = new Student(554, "Petrenko P.P.", 1990, 3, 315, "Programing");
        Student Romanenko = new Student(754, "Romanenko R.R.", 1994, 2, 215, "Programing and ect");
        Student Ivanov = new Student(654, "Ivanov I.I.", 2000, 1, 115, "Programing and comp sys");
        Student Dmytrenko = new Student(874, "Dmytrenko D.D.", 1989, 4, 415, "Programing");

        Student[] students = new Student[4];

        students[0]=Petrenko;
        students[1]=Romanenko;
        students[2]=Ivanov;
        students[3]=Dmytrenko;

        StudList.facultList(students);
        System.out.println("-------------------------------");
        for (Student current:students){
            current.print();
        }
        System.out.println("--------------------------------");
        StudList.studentAfterYearList(students);
        System.out.println("--------------------------------");
        StudList.studentGroupList(students);
    }
}
