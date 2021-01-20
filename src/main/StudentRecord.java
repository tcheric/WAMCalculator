package src.main;

import java.util.ArrayList;

public class StudentRecord {
    private ArrayList<Term> terms;

    public StudentRecord(){
        this.terms = new ArrayList<>();
    }

    //Getters and Setters
    public Term getTerm(String termName){
        for (Term t : terms){
            if (t.getName().equals(termName)){
                return t;
            }
        }
        return null;
    }
    
    public void addTerm(Term t){
        terms.add(t);
    }
}
