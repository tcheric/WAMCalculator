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

    // Prints overall WAM for a term, expected if not all assessments complete
    public void getTermWAM(Term t) {
    }

    // Prints WAM for a course, expected if not all assessments complete
    public void getCourseWAM(Course c) {
        float[] resultsArray = c.getCourseWAM();
        if (resultsArray[2] == 1) {
            System.out.println("No assessments entered");
        } else {
            if (resultsArray[1] == 0){
                System.out.print("The final mark is ");
            } else if (resultsArray[1] == 1){
                System.out.print("The projected mark is ");
            }
            System.out.println(resultsArray[0]);
        }
    }
}
