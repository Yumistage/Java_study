package com.zeroten.jicheng;

import com.sun.org.apache.bcel.internal.generic.RETURN;

import java.util.Date;

public class Employee implements java.lang.Cloneable {
    private String name;
    private Date hireDay;
    private Integer salary;

    public Employee() {
        System.out.println("执行Employee未带参数构造器");
    }

    public Employee(String name, Date hireDay, Integer salary) {
        this.name = name;
        this.hireDay = hireDay;
        this.salary = salary;
        System.out.println("执行Employee带参数构造器");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getHireDay() {
        return hireDay;
    }

    public void setHireDay(Date hireDay) {
        this.hireDay = hireDay;
    }

    public Integer getSalary() {
        return salary;
    }

    public void setSalary(Integer salary) {
        this.salary = salary;
    }

    public void printlnInfo() {

        StringBuilder sb = new StringBuilder();
        sb.append("姓名：");
        sb.append(getName());
        sb.append("入职时间：");
        sb.append(getHireDay());
        sb.append("薪水标准：");
        sb.append(getSalary());
        System.out.println(sb.toString());
    }

    public  Employee Clone() throws CloneNotSupportedException {
        return  (Employee)super.clone();
    }
}
