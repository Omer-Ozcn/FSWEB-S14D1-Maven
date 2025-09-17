package com.workintech.developers;

public class JuniorDeveloper extends Employee {

    public JuniorDeveloper(long id, String name, double salary){
        super(id, name, salary);
    }

    @Override
    public void work() {
        System.out.println("JuniorDeveloper is fixing simple bugs and learning.");
        setSalary(getSalary() * 1.50);
    }
}
