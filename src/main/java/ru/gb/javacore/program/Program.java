package ru.gb.javacore.program;

import ru.gb.javacore.model.Employee;
import ru.gb.javacore.model.Freelancer;
import ru.gb.javacore.model.Office;
import ru.gb.javacore.model.Worker;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;


public class Program {

    public static void main(String[] args) {

        //Создание коллекции
        ArrayList<Employee> employees = new ArrayList<>();



        // наполнение коллекции
        try {
            employees.add(new Worker("Василий", "Петров", 29, 200000));
            employees.add(new Freelancer("Владимир", "Иванов", 31, 150000));
            employees.add(new Worker("Константин", "Муров", 29, 250000));
            employees.add(new Freelancer("Владимир", "Пенкин", 29, 175000));
            employees.add(new Worker("Илья", "Меркури", 29, 160000));
            employees.add(new Freelancer("Василий", "Маккартни", 19, 166000));
        } catch (RuntimeException e) {
            e.printStackTrace();
        }

        // ввывод работников в консоль
        for (Employee employee : employees) {
            System.out.println(employee);
        }

        System.out.println("\n********");
        System.out.println("********\n");


        //сортировка работников
        Collections.sort(employees);



        // ввывод работников в консоль
        for (Employee employee : employees) {
            System.out.println(employee);
        }


        System.out.println("\n********");
        System.out.println("********\n");


        //Создание класса коллекции работников
        Office office = new Office();

        //проверка Iterable
        for (Employee employee : office) {
            System.out.println(employee);
        }


    }
}
