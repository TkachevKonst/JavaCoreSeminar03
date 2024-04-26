package ru.gb.javacore.model;

public class Worker extends Employee{

    /**
     * Конструктор работника(с фиксированной оплатой)
     * @param name
     * @param surName
     * @param age
     * @param salary
     */
    public Worker(String name, String surName, Integer age, double salary) {
        super(name, surName, age, salary);
    }



    public String toString() {
        return String.format("%s %s - %d лет; Рабочий; заработная плата: %.2f руб.",
                surName, name,age, salary);
    }
}
