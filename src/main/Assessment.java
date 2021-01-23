package src.main;

public class Assessment {
    private String name;
    private float weighting;
    private float marksPossible;
    private float marksAchieved;

    // Constructor for name
    public Assessment(String name, float weighting, float marksPossible, 
            float marksAchieved){
        this.name = name;
        this.weighting = weighting;
        this.marksPossible = marksPossible;
        this.marksAchieved = marksAchieved;
    }

    // Getters and Setters

    public String getName(){
        return name;
    }
    
    public void setName(String name){
        this.name = name;
    }

    public float getWeighting(){
        return weighting;
    }
    
    public void setWeighting(float weighting){
        this.weighting = weighting;
    }

    public float getMarksPossible(){
        return marksPossible;
    }
    
    public void setmarksPossible(float marksPossible){
        this.marksPossible = marksPossible;
    }

    public float getMarksAchieved(){
        return marksAchieved;
    }
    
    public void setmarksAchieved(float marksAchieved){
        this.marksAchieved = marksAchieved;
    }
}
