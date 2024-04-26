package ru.gb.javacore.model;

public class Freelancer extends Employee{

    private double hourSalary;

    /**
     * конструтктор работника (с почасовой оплатой)
     * @param name
     * @param surName
     * @param age
     * @param salary
     */
    public Freelancer(String name, String surName, Integer age, double salary) {
        super(name, surName, age, salary);
        hourSalary = salary/20.8/8;
    }


    public String toString() {
        return String.format("%s %s - %d лет; Фрилансер;Ставка: %.2f руб.; Среднемесячная заработная плата: %.2f руб.",
                surName, name,age, hourSalary,salary);
    }
}
