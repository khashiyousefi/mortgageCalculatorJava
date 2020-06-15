package com.SixLink;

public class EmployeeWages {
    public static void main(String[] args) {


        var employee = new Employee();

        //employee.hourlyRate = 20;
        employee.setHourlyRate(20);
        employee.setBaseSalary(100_000);
       // int base = employee.getBaseSalary();
        //System.out.println(base);

        int wage = employee.CalculateWage(10);
        System.out.println(wage);
    }
}
