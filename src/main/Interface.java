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
    
    public Assessment addAssessment(Course c, String assName, float weighting, float marksPossible,
            float marksAchieved) {
        Assessment newAssessment = new Assessment(assName);
        newAssessment.setWeighting(weighting);
        newAssessment.setmarksPossible(marksPossible);
        newAssessment.setmarksAchieved(marksAchieved);
        c.addAssessment(newAssessment);
        return newAssessment;
    }

    // public void getTermWAM(float term) {
    // }
}
