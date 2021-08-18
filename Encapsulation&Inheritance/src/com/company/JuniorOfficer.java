package com.company;

public class JuniorOfficer {
    public static String Jr_off_name;

    static{
        Jr_off_name = "Mr. Example";
    }

    SeniorOfficer so = new SeniorOfficer();
    public double jr_offSal = (so.updatedFund*10)/100;

}
