package com.company;

public class Report {
    public Employee employee;
    private Salary salary;

    public Report(Employee employee, Salary salary) {
        this.employee = employee;
        this.salary = salary;
    }

    public void getEmployee(){
        System.out.println("First Name: "+employee.getFIRST_NAME());
        System.out.println("Middle Name: "+employee.getMIDDLE_NAME());
        System.out.println("Last Name: "+employee.getLAST_NAME());
        System.out.println("Age: "+employee.getEMP_AGE());
        System.out.println("Gender: "+employee.getEMP_GEN());
        System.out.println("Position: "+employee.getEMP_POS());

}
    public void getSalary(){
        System.out.println("Tax: "+salary.getEMP_TAX());
        System.out.println("Deduction Rate: "+salary.getDED_RATE());
        System.out.println("Final Rate: "+salary.getFIN_RATE());
    }

}
