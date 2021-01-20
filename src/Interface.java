package src;

public class Interface {

    private StudentRecord sr;

    public StudentRecord newRecord(){
        StudentRecord newStudentRecord = new StudentRecord();
        sr = newStudentRecord;
        return newStudentRecord;
    }

    public void addTerm(String name) {
        Term newTerm = new Term(name);
        sr.addTerm(newTerm);
    }
    
    public void addCourse(String title, String term) {
        Course newCourse = new Course(title);
        // Need to be able to fetch term. Then use term.addCourse(newCourse)
        sr.getTerm(term).addCourse(newCourse);
    }
    
    public void addAssessment(String name, int weighting, int marksPossible,
            int marksAchieved) {
        Assessment newAssessment = new Assessment(name);
        newAssessment.setWeighting(weighting);
        newAssessment.setmarksPossible(marksPossible);
        newAssessment.setmarksAchieved(marksAchieved);
    }

    public void getTermWAM(int term) {

    }
}
