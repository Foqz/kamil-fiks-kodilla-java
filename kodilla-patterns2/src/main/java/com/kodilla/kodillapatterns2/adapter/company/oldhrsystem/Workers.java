package com.kodilla.kodillapatterns2.adapter.company.oldhrsystem;

public class Workers {
    private String[][] workers = {
            {"1111111111", "John", "Smith"},
            {"22222222222", "Ivone", "Novak"},
            {"323333333333", "Jessie", "Pinkman"},
            {"444444444444", "Walter", "White"},
            {"55555555555", "Clara", "Lanson"}};
    private double[] salaries = {
            4500.00,
            3700.00,
            4350.00,
            9000.00,
            6200.00};

    public String getWorker(int n) {
        if (n > salaries.length) {
            return "";
        }
        return workers[n][0] + ", " + workers [n][1] + ", " + workers[n][2] + ", " + salaries[n];
    }
    public String[][] getWorkers() {
        return workers;
    }
    public double[] getSalaries(){
        return salaries;
    }
}
