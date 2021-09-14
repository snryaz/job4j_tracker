package ru.job4j.oop.inheritance;

public class Builder extends Engineer {
    private String profile;

    public Builder(String name, String surname, String education, String birthday,
                   String specialization, String profile) {
        super(name, surname, education, birthday, specialization);
        this.profile = profile;
    }

    @Override
    public void create(Project project) {
        super.create(project);
    }
}
