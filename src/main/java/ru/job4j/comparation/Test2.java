package ru.job4j.comparation;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class Test2 {
    public static void main(String[] args) {
        List<Employee> list = new ArrayList<>();
        Employee emp1 = new Employee(100, "Dmitrii", "Kapustin", 400000);
        Employee emp2 = new Employee(15, "Ivan", "Petrov", 80000);
        Employee emp3 = new Employee(123, "Ivan", "Sidorov", 60000);
        list.add(emp1);
        list.add(emp2);
        list.add(emp3);
        System.out.println("Before sorting \n" + list);
        Collections.sort(list);
        System.out.println("After sorting \n" + list);

    }

}

class Employee implements Comparable<Employee> {
    private int id;
    private String name;
    private String surname;
    private int salary;

    public Employee(int id, String name, String surname, int salary) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee{"
               + "id=" + id
               + ", name='" + name + '\''
               + ", surname='" + surname + '\''
               + ", salary=" + salary
               + '}';
    }

    @Override
    public int compareTo(Employee anotherEmp) {
        int result = this.name.compareTo(anotherEmp.name);
        if (result == 0) {
            result = this.surname.compareTo(anotherEmp.surname);
        }
        return result;
        /*
        все это равно, с записью выше compareTo:
        return this.id - anotherEmp.id;
        return this.id.compareTo(anotherEmp.id); Если сортировка по Integer
        return this.name.compareTo(anotherEmp.name); Если сортировка по String

         */
    }
}
