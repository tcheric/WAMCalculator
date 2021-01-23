package src.main;

public class Interface {

    private StudentRecord sr;

    public StudentRecord newRecord(){
        StudentRecord newStudentRecord = new StudentRecord();
        sr = newStudentRecord;
        return newStudentRecord;
    }

    public Term newTerm(String termName) {
        Term newTerm = new Term(termName);
        sr.addTerm(newTerm);
        return newTerm;
    }
    
    public Course addCourse(String title, String term) {
        Course newCourse = new Course(title);
        // Need to be able to fetch term. Then use term.addCourse(newCourse)
        Term targetTerm = sr.getTerm(term);
        if (targetTerm == null) {
            System.out.println("Term does not exist. Course not added");
            return null;
        } else {
            targetTerm.addCourse(newCourse);
            return newCourse;
        }
    }
    
    // Does not fetch course on its own, needs course provided as param
    public Assessment addAssessment(Course c, String assName, float weighting, float marksPossible,
            float marksAchieved) {
        if (weighting > 100){
            System.out.println("Error: Weighting cannot be more than 100%");
            return null;
        }
        if (marksAchieved > marksPossible){
            System.out.println("Error: Marks achieved cannot be more than marks possible");
            return null;
        }
        if ((weighting + c.getTotalWeighting()) > 100){
            System.out.println("Error: Total marks in course cannot be more than 100");
            return null;
        }
        Assessment newAssessment = new Assessment(assName);
        newAssessment.setWeighting(weighting);
        newAssessment.setmarksPossible(marksPossible);
        newAssessment.setmarksAchieved(marksAchieved);
        c.addAssessment(newAssessment);
        return newAssessment;
    }

    public void printAssessments(Course c){
        c.printAssessments();
    }

    public void printCourses(Term t){
        t.printCourses();
    }

    // Prints overall WAM for a term, expected if not all assessments complete
    public void getTermWAM(Term t) {
        float[] resultsArray = t.getTermWAM();
        System.out.printf("The term WAM for %s is %f\n", t.getName(), resultsArray[0]);
    }

    // Prints WAM for a course, expected if not all assessments complete
    public void getCourseWAM(Course c) {
        float[] resultsArray = c.getCourseWAM();
        if (resultsArray[2] == 1) {
            System.out.println("No assessments entered");
        } else {
            if (resultsArray[1] == 0){
                System.out.printf("The final mark for %s is ", c.getTitle());
            } else if (resultsArray[1] == 1){
                System.out.printf("The projected mark for %s is ", c.getTitle());
            }
            System.out.println(resultsArray[0]);
        }
    }
}
