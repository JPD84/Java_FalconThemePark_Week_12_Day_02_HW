package Visitors;
public class Visitor {

    private String visitorNo;
    public int age;
    private int height;
    private int money;

    public Visitor(String visitorNo, int age, int height, int money) {
        this.visitorNo = visitorNo;
        this.age = age;
        this.height = height;
        this.money = money;
    }

    public String getVisitorNo() {
        return visitorNo;
    }

    public int getAge() {
        return age;
    }

    public int getHeight() {
        return height;
    }

    public int getMoney() {
        return money;
    }

    public void setMoney(int money) {
        this.money = money;
    }

    public void setAge(int age) {
        this.age = age;
    }
}






