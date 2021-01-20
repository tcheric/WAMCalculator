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
    
    public void addAssessment(String name, int weighting, int marksPossible,
            int marksAchieved) {
        Assessment newAssessment = new Assessment(name);
        newAssessment.setWeighting(weighting);
        newAssessment.setmarksPossible(marksPossible);
        newAssessment.setmarksAchieved(marksAchieved);
    }

    // public void getTermWAM(int term) {
    // }
}
