package Attractions;

public class PlayGround {

    PlayGround playGround;

    private String name;
    private int cost;
    private int minAge;
    private int maxAge;
    private int rating;

    public PlayGround(String name, int cost, int minAge, int maxAge, int rating){
        this.name = name;
        this.cost = cost;
        this.minAge = minAge;
        this.maxAge = maxAge;
        this.rating = rating;

    }

    public String getName() {
        return name;
    }

    public int getCost() {
        return cost;
    }

    public int getMinAge() {
        return minAge;
    }

    public int getMaxAge() {
        return maxAge;
    }

    public int getRating() {
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

    public void setMaxAge(int maxAge) {
        this.maxAge = maxAge;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }
}
