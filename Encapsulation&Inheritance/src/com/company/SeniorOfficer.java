package com.company;

public class SeniorOfficer {
    CEO boss = new CEO();
    public static String s_off_name;

    static{
        s_off_name = "Mr. Example";
    }

    public String myProject = boss.getProject1();
    protected String pendingProject = boss.getProject2();
    private double myFund = boss.getP1_budget();

    public double myCommission = (myFund*40)/100;

    protected double updatedFund = myFund - myCommission;

}
