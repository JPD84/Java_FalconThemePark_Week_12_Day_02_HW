package Attractions;

public class Park {

    Park park;

    private String name;
    private int cost;
    private int minAge;
    private int rating;

    public Park(String name, int cost, int minAge, int rating){
        this.name = name;
        this.cost = cost;
        this.minAge = minAge;
        this.rating = rating;

    }

    public String getName(){
        return name;
    }

    public int getCost(){
        return cost;
    }

    public int getMinAge(){
        return minAge;
    }


    public int getRating(){
        return rating;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setCost(int cost) {
        this.cost = cost;
    }

    public void setMinAge(int minAge) {
        this.minAge = minAge;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
