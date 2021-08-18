package com.company;

import java.math.BigInteger;

public class CEO {
    public final String COMPANY_NAME = "Glitch";
    public final String CURRENCY = " BDT(৳)";
    public static String ceo_name;
    public static BigInteger ceo_number;

    private String project1 = "EXIM BANK CRM";
    private double p1_budget = 45000;
    private String project2 = "BSRM ERP";
    private double p2_budget = 17000;

    static{
        ceo_name = "Mike";
        ceo_number = new BigInteger("01712844177");
    }

    /*
    * CEO will keep 20% for the Company Fund from the project budget
    * Project Cost will be 80% from its total fund.
    * */

    void CEO(){
        this.p1_budget = (p1_budget*80)/100;
        this.p2_budget = (p2_budget*80)/100;
    }

    public void setProject1(){
        this.project1 = project1;
        this.p1_budget = p1_budget;
    }
    public void setProject2(){
        this.project2 = project2;
        this.p2_budget = p2_budget;
    }

    public String getProject1(){
        return project1;
    }
    public double getP1_budget(){
        return p1_budget;
    }


    public String getProject2(){
        return project2;
    }
    public double getP2_budget(){
        return p2_budget;
    }


}
