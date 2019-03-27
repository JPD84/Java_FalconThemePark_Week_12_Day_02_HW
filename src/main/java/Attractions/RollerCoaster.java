package Attractions;

public class RollerCoaster {

    RollerCoaster rollerCoaster;

    private String name;
    private int ageRestriction;
    private int cost;
    private int rating;

    public RollerCoaster(String name, int ageRestriction, int cost, int rating){
        this.name = name;
        this.ageRestriction = ageRestriction;
        this. cost = cost;
        this.rating = rating;
    }

    public String getName(){
        return name;
    }

    public int getAgeRestriction(){
        return ageRestriction;
    }

    public int getCost(){
        return cost;
    }

    public int getRating(){
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setAgeRestriction(int ageRestriction) {
        this.ageRestriction = ageRestriction;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

}


