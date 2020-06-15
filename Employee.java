package com.SixLink;

public class Employee {
    private int baseSalary;
    private int hourlyRate;

    public int CalculateWage(int extraHours){
        return baseSalary + (hourlyRate * extraHours);
    }

    public void setHourlyRate(int hourlyRate){
        if (hourlyRate <= 0){
            throw new IllegalArgumentException("Please Enter a Hourly Rate more than 0");
        }
        this.hourlyRate = hourlyRate;
    }

    private int getHourlyRate(){
        return hourlyRate;
    }

    public void setBaseSalary (int baseSalary){
        if (baseSalary <= 0){
            throw new IllegalArgumentException("Please Enter a Salary Base more than 0.");
        }
        this.baseSalary = baseSalary;
    }

    private int getBaseSalary (){
        return baseSalary;
    }
}
