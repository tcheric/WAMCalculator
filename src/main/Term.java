package src.main;

import java.util.ArrayList;

public class Term {
    private String name;
    private ArrayList<Course> courses;

    // constructor
    public Term(String name){
        this.name = name;
        this.courses = new ArrayList<>();
    }

    // Return average of this term's course WAMs
    // result[0] = term WAM
    // result[1] = no courses(1)/courses(0)
    public float[] getTermWAM(){
        float[] result = new float[3];
        result[0] = 0;
        result[1] = 0;

        if (courses == null){
            result[1] = 1;
            return result;
        }
        float termWAM = 0;
        float numCourses = 0;
        for (Course c : courses){
            termWAM += c.getCourseWAM()[0];
            numCourses += 1;
        }
        termWAM = termWAM / numCourses;
        result[0] += termWAM;
        return result;
    }

    //Print all courses
    public void printCourses(){
        System.out.printf("Courses in %s:\n", name);
        for (Course c : courses){
            String name = c.getTitle();
            System.out.println(name);
        }
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
