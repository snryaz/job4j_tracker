package ru.job4j.oop.inheritance;

public class Programmer extends Engineer {
    private String progLang;

    public Programmer(String name, String surname, String education, String birthday,
                      String specialization, String progLang) {
        super(name, surname, education, birthday, specialization);
        this.progLang = progLang;
    }

    @Override
    public void create(Project project) {
        super.create(project);
    }
}
