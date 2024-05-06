package oop.lab_10.demo;

public abstract class AbstractPerson implements Person, Birthable, Identifiable {
    protected String name;
    private int age;
    private String id;
    private String birthDate;

    public AbstractPerson(String name, int age, String id, String birthDate) {
        this.setName(name);
        this.setAge(age);
        this.setId(id);
        this.setBirthDate(birthDate);
    }

    @Override
    public int getAge() {
        return age;
    }

    @Override
    public String getName() {
        return this.getClass().getSimpleName() + ": " + name;
    }

    @Override
    public String getID() {
        return id;
    }

    @Override
    public String getBirthDate() {
        return birthDate;
    }

    protected void setName(String name) {
        if (name.isEmpty()) throw new IllegalArgumentException();
        this.name = name;
    }

    protected void setAge(int age) {
        if (age < 0) throw new IllegalArgumentException();
        this.age = age;
    }

    protected void setId(String id) {
        if (id.isEmpty() || Integer.parseInt(id) < 0) throw new IllegalArgumentException();
        this.id = id;
    }

    protected void setBirthDate(String birthDate) {
        if (birthDate.isEmpty()) throw new IllegalArgumentException();
        this.birthDate = birthDate;
    }

}
