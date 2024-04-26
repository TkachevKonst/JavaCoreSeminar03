package ru.gb.javacore.model;


import java.util.Iterator;
import java.util.NoSuchElementException;



public class Office  implements Iterable<Employee>{
    private static final Employee[] office = new Employee[]{
            new Worker("Василий", "Петров", 29, 200000),
            new Freelancer("Владимир", "Иванов", 31, 150000),
            new Worker("Константин", "Муров", 29, 250000),
            new Freelancer("Владимир", "Пенкин", 29, 175000),
            new Worker("Илья", "Меркури", 29, 160000),
        new Freelancer("Василий", "Маккартни", 19, 166000)
    };


    public Iterator<Employee> iterator() {
        return new IteratorEmployee();
    }


    private static class IteratorEmployee implements Iterator<Employee>{
        private int index = -1;

        @Override
        public boolean hasNext() {
            return index + 1 < office.length;
        }

        @Override
        public Employee next() {
            index++;
            if (index >= 0 && index < office.length) {
                return office[index];
            } else {
                throw new NoSuchElementException();
            }
        }
    }

}
