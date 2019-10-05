package ua.univer.javacore.Objects.ClassWork.student;

public class Student {
    private int id;
    private String fio;
    private int date;
    private int course;
    private int group;
    private String facult;

    public Student(int id, String fio, int date, int course, int group, String facult) {
        this.id = id;
        this.fio = fio;
        this.date = date;
        this.course = course;
        this.group = group;
        this.facult = facult;
    }

    public void setId(int id){
        this.id=id;
    }
    public int getId(){
        return this.id;
    }

    public void setFio(String fio) {
        this.fio = fio;
    }

    public String getFio() {
        return fio;
    }

    public void setDate(int date) {
        this.date = date;
    }

    public int getDate() {
        return date;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    public int setCourse(){
        return course;
    }

    public void setGroup(int group) {
        this.group = group;
    }

    public int getGroup() {
        return group;
    }

    public void setFacult(String facult) {
        this.facult = facult;
    }
    public String getFacult(){
        return facult;
    }
    public void print(){
        System.out.println("ID : "+this.id+" FIO : "+this.fio+" Date : "+this.date+" Course : "+this.course+" Groupe : "+this.group+" Facult : "+this.facult);
    }
}
