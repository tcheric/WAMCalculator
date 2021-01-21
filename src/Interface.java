package src;

public class Interface {

    public StudentRecord newRecord(){
        StudentRecord newStudentRecord = new StudentRecord();
        return newStudentRecord;
    }

    public void addTerm(String name) {
        Term newTerm = new Term(name);
    }
    
    // Crouse can only be created if term is valid (Let's implement error checking later)
    public void addCourse(String title, String term) {
        Course newCourse = new Course(title);
        
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
