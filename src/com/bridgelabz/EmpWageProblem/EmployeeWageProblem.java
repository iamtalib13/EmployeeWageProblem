package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static  final int ABSENT = 0;
    public static  final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;



    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;

        System.out.println("Welcome to Employee Wage Computation Program");

        int empCheck = (int) (Math.floor(Math.random() * 10) %3);

        if(empCheck == FULL_TIME)
            System.out.println("Employee is Full Day Present");
        else if(empCheck == PART_TIME)
            System.out.println("Employee is Half Day Present");
        else if(empCheck == ABSENT)
            System.out.println("Employee is Absent");


        switch(empCheck){

            case PART_TIME:
                empHrs = 4;
                break;

            case  FULL_TIME:
                empHrs = 8;
                break;

            default:
                empHrs = 0;
        }



        empWage = empHrs * WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
    }
}
