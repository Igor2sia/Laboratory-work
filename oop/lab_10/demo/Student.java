package oop.lab_10.demo;

public class Student extends AbstractPerson implements IdentifiableStudent{
    private String studentId;

    public Student(String name, int age, String id, String birthDate, String studentId) {
        super(name, age, id, birthDate);
        this.setStudentId(studentId);
    }

    public void setStudentId(String studentId) {
        if (studentId == null || studentId.isEmpty()) throw new IllegalArgumentException();
        this.studentId = studentId;
    }

    @Override
    public String getStudentId() {
        return studentId;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName() + ": " + super.name;
    }
}
