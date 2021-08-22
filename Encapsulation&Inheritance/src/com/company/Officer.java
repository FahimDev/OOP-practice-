package com.company;

public class Officer extends SeniorOfficer{
    SeniorOfficer so = new SeniorOfficer();
    public static String off_name;

    static{
        off_name = "Mr. Example";
    }

    private String pendingProject = so.pendingProject;

    public double officerSal = (updatedFund*30)/100;
}
