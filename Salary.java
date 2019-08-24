package com.company;

public class Salary {
    private Double EMP_TAX;
    private Double DED_RATE;
    private Double FIN_RATE;

    public Double getEMP_TAX(){
        return this.EMP_TAX;
    }

    public void getTAX(Double TAX){
        this.EMP_TAX = TAX;
    }

    public Double getDED_RATE(){
        return this.DED_RATE;
    }

    public void getDED_RATE(Double DEDUCTION){
        this.DED_RATE = DEDUCTION;
    }

    public Double getFIN_RATE(){
        return this.FIN_RATE;
    }

    public void getFIN_RATE(Double FINAL){
        this.FIN_RATE = FINAL;
    }


}
