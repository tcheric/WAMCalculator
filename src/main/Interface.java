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
        Term targetTerm = sr.getTerm(term);
        if (targetTerm == null) {
            return null;
        } else {
            Course newCourse = targetTerm.addCourse(title);
            return newCourse;
        }
    }
    
    public Assessment addAssessment(Course c, String assName, float weighting, float marksPossible,
            float marksAchieved) {
        Assessment newAssessment = c.addAssessment(assName, weighting, marksPossible, marksAchieved);
        return newAssessment;
    }

    public void printAssessments(Course c){
        c.printAssessments();
    }

    public void printCourses(Term t){
        t.printCourses();
    }

    // Prints overall WAM for a term
    public void getTermWAM(Term t) {
        float[] resultsArray = t.getTermWAM();
        System.out.printf("The term WAM for %s is %f\n", t.getName(), resultsArray[0]);
    }

    // Prints WAM for a course, projected if not all assessments complete
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
