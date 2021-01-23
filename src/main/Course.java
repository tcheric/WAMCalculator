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

    // Returns course WAM and assessment info in arraylist?
    // result[0] = mark out of 100
    // result[1] = final(0)/projected(1) marks
    // result[2] = are assessments(0)/no assessments(1)
    public float[] getCourseWAM(){
        float[] result = new float[3];
        result[0] = 0;
        result[1] = 0;
        result[2] = 1;

        if (assessments == null){
            return result;
        }

        result[2] = 0;
        float totalWeighting = 0;
        float totalMarksAchieved = 0;
        for (Assessment a : assessments){
            totalWeighting += a.getWeighting();
            float assMark = 
            a.getWeighting() * (a.getMarksAchieved() / a.getMarksPossible()); 
            totalMarksAchieved += assMark;
        }
        // Projected marks case
        if (totalWeighting != 100){
            result[1] = 1;
            result[0] = totalMarksAchieved * 100 / totalWeighting;
        // Final marks case
        } else {
            result[0] = totalMarksAchieved;
        }
        return result;
    }

    public float getTotalWeighting(){
        float totalWeighting = 0;
        for (Assessment a : assessments){
            totalWeighting += a.getWeighting();
        }
        return totalWeighting;
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
            System.out.printf("%s -- Weighting:%.2f -- Marks:%.2f/%.2f\n", name, weighting, marksAchieved, marksPossible);
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
