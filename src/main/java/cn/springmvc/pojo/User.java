package cn.springmvc.pojo;

/**
 * Created by cuibinbin on 2017/11/3.
 */
public class User {
    private String username;
    private int id;
    private double money;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "User{" +
                "username='" + username + '\'' +
                ", id=" + id +
                ", money=" + money +
                '}';
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public User(String username, int id, double money) {
        this.username = username;
        this.id = id;
        this.money = money;
    }

    public User() {

    }

    public double getMoney() {
        return money;
    }

    public void setMoney(double money) {
        this.money = money;
    }
}
