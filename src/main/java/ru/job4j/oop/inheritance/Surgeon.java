package ru.job4j.oop.inheritance;

public class Surgeon extends Doctor {
    private String specification;

    public Surgeon(String name, String surname, String education, String birthday,
                   String qualification, String specification) {
        super(name, surname, education, birthday, qualification);
        this.specification = specification;
    }

    @Override
    public void heal(Pacient pacient) {
        super.heal(pacient);
    }
}
