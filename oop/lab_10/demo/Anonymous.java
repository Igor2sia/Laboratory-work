package oop.lab_10.demo;

public class Anonymous implements Birthable {
    private String birthDate;

    public Anonymous(String birthDate){
        this.setBirthDate(birthDate);
    }


    @Override
    public String getBirthDate() {
        return birthDate;
    }

    public void setBirthDate(String birthDate) {
        if (birthDate.isEmpty()) throw new IllegalArgumentException();
        this.birthDate = birthDate;
    }
}
