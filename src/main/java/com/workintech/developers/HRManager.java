package com.workintech.developers;

public class HRManager extends Employee {

    private JuniorDeveloper[] juniorDevelopers;
    private MidDeveloper[] midDevelopers;
    private SeniorDeveloper[] seniorDevelopers;

    public HRManager(long id, String name, double salary,
                     int juniorSize, int midSize, int seniorSize) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[juniorSize];
        this.midDevelopers = new MidDeveloper[midSize];
        this.seniorDevelopers = new SeniorDeveloper[seniorSize];
    }

    public HRManager(long id, String name, double salary) {
        super(id, name, salary);
        this.juniorDevelopers = new JuniorDeveloper[5];
        this.midDevelopers = new MidDeveloper[5];
        this.seniorDevelopers = new SeniorDeveloper[5];
    }

    @Override
    public void work() {
        System.out.println("HRManager is managing hiring and employees.");
        setSalary(getSalary() * 1.05);
    }

    public void addEmployee(JuniorDeveloper dev, int index) {
        if (index < 0 || index >= juniorDevelopers.length) {
            System.out.println("Index geçersiz.");
            return;
        }
        if (juniorDevelopers[index] != null) {
            System.out.println("Bu index zaten dolu!");
            return;
        }
        juniorDevelopers[index] = dev;
        System.out.println(dev.getName() + " JuniorDeveloper eklendi.");
    }

    public void addEmployee(MidDeveloper dev, int index) {
        if (index < 0 || index >= midDevelopers.length) {
            System.out.println("Index geçersiz.");
            return;
        }
        if (midDevelopers[index] != null) {
            System.out.println("Bu index zaten dolu!");
            return;
        }
        midDevelopers[index] = dev;
        System.out.println(dev.getName() + " MidDeveloper eklendi.");
    }

    public void addEmployee(SeniorDeveloper dev, int index) {
        if (index < 0 || index >= seniorDevelopers.length) {
            System.out.println("Index geçersiz.");
            return;
        }
        if (seniorDevelopers[index] != null) {
            System.out.println("Bu index zaten dolu!");
            return;
        }
        seniorDevelopers[index] = dev;
        System.out.println(dev.getName() + " SeniorDeveloper eklendi.");
    }
}
