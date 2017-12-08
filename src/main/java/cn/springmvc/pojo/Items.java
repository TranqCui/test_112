package cn.springmvc.pojo;

import java.util.Date;

/**
 * Created by cuibinbin on 2017/11/2.
 */
public class Items {
    private String username;
    private String sex;
    private int age;
    private double salary;
    private Date createTime;

    public String getUsername() {
        return username;
    }

    @Override
    public String toString() {
        return "Items{" +
                "username='" + username + '\'' +
                ", sex='" + sex + '\'' +
                ", age=" + age +
                ", salary=" + salary +
                ", createTime=" + createTime +
                '}';
    }

    public Items(String username, String sex, int age, double salary, Date createTime) {
        this.username = username;
        this.sex = sex;
        this.age = age;
        this.salary = salary;
        this.createTime = createTime;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }
}
