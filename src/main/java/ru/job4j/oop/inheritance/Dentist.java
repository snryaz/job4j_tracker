package ru.job4j.oop.inheritance;

public class Dentist extends Doctor {
    private String classification;

    public Dentist(String name, String surname, String education, String birthday,
                   String qualification, String classification) {
        super(name, surname, education, birthday, qualification);
        this.classification = classification;
    }

    @Override
    public void heal(Pacient pacient) {
        super.heal(pacient);
    }
}
