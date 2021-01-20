package src.main;

import java.util.ArrayList;

public class Course {
    private String title;
    private int mark;
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
    private void printAssessments(){
        for (Assessment a : assessments){
            String name = a.getName();
            int weighting = a.getWeighting();
            int marksPossible = a.getMarksPossible();
            int marksAchieved = a.getMarksAchieved();
            System.out.printf("%s %d %d/%d", name, weighting, marksAchieved, marksPossible);
        }
    }

    //Getters and Setters
    public int getMark(){
        return mark;
    }
    
    public void setMark(int mark){
        this.mark = mark;
    }

    public String getTitle(){
        return title;
    }

    public void setTitle(String title){
        this.title = title;
    }
    
}
