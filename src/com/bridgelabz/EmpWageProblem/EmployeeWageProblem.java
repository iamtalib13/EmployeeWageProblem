package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static  final int FULL_TIME = 1;
    public static final int WAGE_PER_HOUR = 20;


    public static void main(String[] args) {
        int fullDayHrs = 0;
        int empWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        double empCheck = Math.floor(Math.random() * 10) %2;

        if(empCheck == FULL_TIME)
            System.out.println("Employee is Present");
        else
            System.out.println("Employee is Absent");

        if(empCheck == FULL_TIME)
            fullDayHrs = 8;

        empWage = fullDayHrs * WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
    }
}
