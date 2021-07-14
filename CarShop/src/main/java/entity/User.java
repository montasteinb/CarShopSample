package entity;

public class User {

    private final UserType userType;
    private double budget;

    public UserType getUserType() {
        return userType;
    }

    public double getBudget(){
        return budget;
    }

    public void setBudget(double budget){
        this.budget = budget;
    }

    public User(UserType userType, double budget) {
        this.userType = userType;
        this.budget = budget;
    }

    public User(UserType userType){
        this.userType = userType;
    }
}
