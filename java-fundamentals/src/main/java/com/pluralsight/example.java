package com.pluralsight;

public class example {
    public static void main(String[] args) {

        StringBuilder skills = new StringBuilder(); /* string builder seems to be able to hold multiple strings
        in one variable */
        skills.append("Git, ");
        skills.append("HTML, ");
        skills.append("CSS, ");
        skills.append("and Bootstrap\n");
        skills.append("JavaScript, ");
        skills.append("ES6, ");
        skills.append("jQuery, ");
        skills.append("REST APIs, ");
        skills.append("and Express\n");
        skills.append("Angular\n");
        skills.append("Java\n");

        String mySkills = skills.toString(); // makes a variable to print out the strings that where appended
        System.out.println(mySkills);
    }
}
