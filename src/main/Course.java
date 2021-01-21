package src.main;

import java.util.ArrayList;

public class Course {
    private String title;
    private float mark;
    private ArrayList<Assessment> assessments;

    //Constructor
    public Course(String title){
        this.assessments = new ArrayList<>();
        this.title = title;
    }

    //Adds assessment to list
    public void addAssessment(Assessment a){
        assessments.add(a);
    }

    //Print all assessments and marks and weightings
    public void printAssessments(){
        for (Assessment a : assessments){
            String name = a.getName();
            float weighting = a.getWeighting();
            float marksPossible = a.getMarksPossible();
            float marksAchieved = a.getMarksAchieved();
            System.out.printf("%s -- Weighting:%.2f -- Marks:%.2f/%.2f", name, weighting, marksAchieved, marksPossible);
        }
    }

    //Getters and Setters
    public ArrayList<Assessment> getAssessments(){
        return assessments;
    }
    
    public float getMark(){
        return mark;
    }
    
    public void setMark(float mark){
        this.mark = mark;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
}
