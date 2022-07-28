package com.bridgelabz.EmpWageProblem;

public class EmployeeWageProblem {
    public static  final int ABSENT = 0;
    public static  final int FULL_TIME = 1;
    public static final int PART_TIME = 2;
    public static final int WAGE_PER_HOUR = 20;
    public static final int WORKING_DAYS=20;
    public  static  final int TOTAL_WORKING_HOURS = 100;



    public static void main(String[] args) {
        int empHrs = 0;
        int empWage = 0;
        int totalEmpWage = 0;
        int days=0;
        int totalEmpHrs = 0;
        int totalWorkingDays = 0;

        System.out.println("Welcome to Employee Wage Computation Program");
        while(totalEmpHrs <= TOTAL_WORKING_HOURS && totalWorkingDays < WORKING_DAYS) {
            totalWorkingDays++;

            System.out.println("Day-"+(days+1));

        int empCheck = (int) (Math.floor(Math.random() * 10) %3);


        switch(empCheck){

            case PART_TIME:
                empHrs = 4;
                System.out.println("Employee is Half Day Present");
                break;

            case  FULL_TIME:
                empHrs = 8;
                System.out.println("Employee is Full Day Present");
                break;

            default:
                empHrs = 0;
                System.out.println("Employee is Absent");
        }



        empWage = empHrs * WAGE_PER_HOUR ;
        System.out.println("Employee wage is: "+ empWage);
        System.out.println("-----------------------------------------");
        totalEmpWage = totalEmpWage + empWage;
        totalEmpHrs = totalEmpHrs + empHrs;
        days++;

    }
        System.out.println("Employee total wage is: "+ totalEmpWage);
        System.out.println("Employee total Working hours is: "+ totalEmpHrs);
        System.out.println("Total Days worked By the Employee:" + totalWorkingDays);

    }

}

