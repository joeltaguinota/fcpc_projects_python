package com.company;

public class Employee {

    private String FIRST_NAME;
    private String MIDDLE_NAME;
    private String LAST_NAME;
    private Integer EMP_AGE;
    private String EMP_GEN;
    private String EMP_POS;

    public String getFIRST_NAME(){
        return this.FIRST_NAME;
    }

    public void getFIRST_NAME(String FNAME){
        this.FIRST_NAME = FNAME;
    }

    public String getMIDDLE_NAME(){
        return this.MIDDLE_NAME;
    }

    public void getMIDDLE_NAME(String MNAME){
        this.MIDDLE_NAME = MNAME;
    }


    public String getLAST_NAME(){
        return this.LAST_NAME;
    }

    public void getLAST_NAME(String LNAME){
        this.LAST_NAME = LNAME;
    }

    public Integer getEMP_AGE(){
        return this.EMP_AGE;
    }

    public void getEMP_AGE(Integer AGE){
        this.EMP_AGE = AGE;
    }

    public String getEMP_GEN(){
        return this.EMP_GEN;
    }

    public void getEMP_GEN(String GENDER){
        this.EMP_GEN = GENDER;
    }

    public String getEMP_POS(){
        return this.EMP_POS;
    }

    public void getEMP_POS(String POSITION){
        this.EMP_POS = POSITION;
    }

}
