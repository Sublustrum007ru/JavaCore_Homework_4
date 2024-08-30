package controller;

public enum Gender {
    MALE("Мужской"), FAMALE("Женский");

    private final String russianGenderTitle;

    Gender(String russianGenderTitle) {
        this.russianGenderTitle = russianGenderTitle;
    }

    public String getRussianGenderTitle(){
        return russianGenderTitle;
    }
}
