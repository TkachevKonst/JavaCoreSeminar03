package ru.gb.javacore.model;

/**
 * Базовый класс работников
 */

public abstract class Employee implements Comparable<Employee> {

    protected String name;
    protected String surName;
    protected double salary;
    protected Integer age;

    /**
     * Конструктор работника
     * @param name - имя
     * @param surName - Фамилия
     * @param age - возраст
     * @param salary - зарплата за месяц
     */
    public Employee(String name, String surName, Integer age, double salary) {
        this.name = checkName(name);
        this.surName = checkName(surName);
        this.salary = checkSalary(salary);
        this.age = checkAge(age);
    }



    public String toString() {
        return String.format("%s %s - %d лет; заработная плата: %.2f руб.",
                surName, name, age, salary);
    }

    /**
     * сортировка по фамиилии, имени и зарплате
     * @param emp the object to be compared.
     * @return
     */
    public int compareTo(Employee emp) {
        int surNameRes = surName.compareTo(emp.surName);
        if (surNameRes == 0) {
            int nameRes = name.compareTo(emp.name);
            if(nameRes == 0){
                return age.compareTo(emp.age);
            }
            return nameRes;
        }
        return surNameRes;
    }

    /**
     * Проверка ввода имени и фамилии
     * @param name
     * @return
     */
    private String checkName(String name) {
        if (name.length() < 3) {
            throw new RuntimeException();
        }
        return name;
    }

    /**
     * Проверка ввода зарплаты
     * @param salary
     * @return
     */
    private double checkSalary(double salary) {
        if (salary < 0) {
            throw new RuntimeException();
        }
        return salary;
    }

    /**
     * Проверка ввода возраста
     * @param age
     * @return
     */
    private Integer checkAge(Integer age) {
        if (age < 18) {
            throw new RuntimeException();
        }
        return age;
    }
}
