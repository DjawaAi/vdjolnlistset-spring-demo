package com.vdjolnlistset.vdjolnlistsetspringd;

public class FIO {
    private String name;
    private String secondName;
    private String surName;

    public FIO(String name, String secondName, String surName) {
        this.name = name;
        this.secondName = secondName;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSecondName() {
        return secondName;
    }

    public String getSurName() {
        return surName;
    }

    public String toString() {
        return "Имя: " + this.name + ";" +
                " Отчество: " + this.secondName + ";" +
                " Фамилмя: " + this.surName;
    }
}
