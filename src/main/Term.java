package src.main;

import java.util.ArrayList;

public class Term {
    private String name;
    private ArrayList<Course> courses;

    // Uses default constructor
    public Term(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course c){
        courses.add(c);
    }

    // Getters and Setters
    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }
}
