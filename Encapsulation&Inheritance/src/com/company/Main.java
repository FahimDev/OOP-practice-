package com.company;

public class Main {

    public static void main(String[] args) {
        CEO head = new CEO();
        SeniorOfficer s_officer = new SeniorOfficer();
        Officer officer = new Officer();
        JuniorOfficer jr_off = new JuniorOfficer();


        SeniorOfficer.s_off_name = "Dip"; //Current
        Officer.off_name = "Antonin"; //Current Name
        JuniorOfficer.Jr_off_name = "Fahim";//Current Name

        System.out.println("Company: "+head.COMPANY_NAME);
        System.out.println("CEO: "+CEO.ceo_name);
        System.out.println("Senior Officer: "+SeniorOfficer.s_off_name);
	    System.out.println("Senior Officer's Project: "+s_officer.myProject);
        System.out.println("Senior Officer's Salary: "+s_officer.myCommission + head.CURRENCY);
        System.out.println("Senior Officer's Assistant: "+Officer.off_name);
        System.out.println("Assistant Salary: "+officer.officerSal + head.CURRENCY);
        System.out.println("Junior Officer:  "+JuniorOfficer.Jr_off_name);
        System.out.println("Junior Officer Salary: "+jr_off.jr_offSal + head.CURRENCY);
    }
}
