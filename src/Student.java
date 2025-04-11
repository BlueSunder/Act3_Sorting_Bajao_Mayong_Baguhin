class Student {
String name;
double grade;

    public Student(String name, double grade){
        this.name = name;
        this.grade = grade;
    }
    public String toString() {
        return name + "-" + grade;
    }
}
