package src.main;

public class Assessment {
    private String name;
    private int weighting;
    private int marksPossible;
    private int marksAchieved;

    // Constructor for name
    public Assessment(String name){
        this.name = name;
    }

    // Getters and Setters

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public int getWeighting(){
        return weighting;
    }
    
    public void setWeighting(int weighting){
        this.weighting = weighting;
    }

    public int getMarksPossible(){
        return marksPossible;
    }
    
    public void setmarksPossible(int marksPossible){
        this.marksPossible = marksPossible;
    }

    public int getMarksAchieved(){
        return marksAchieved;
    }
    
    public void setmarksAchieved(int marksAchieved){
        this.marksAchieved = marksAchieved;
    }
}
