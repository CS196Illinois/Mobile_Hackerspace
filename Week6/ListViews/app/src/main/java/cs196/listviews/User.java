package cs196.listviews;

/**
 * Created by tommypacker for HackIllinois' 2016 Clue Hunt
 */

public class User {

    private String name, gender;
    private int age;

    public User(String name, String gender, int age){
        this.name = name;
        this.gender = gender;
        this.age = age;
    }

    public String getName(){return name;}
    public String getGender(){return gender;}
    public String getAge(){
        return String.valueOf(age);
    }
}
