package com.zeroten.jicheng;

import java.util.Date;

public class Manager extends Employee {

    private Integer bonus;

    public Integer getBonus() {
        return bonus;
    }

    public void setBonus(Integer bonus) {
        this.bonus = bonus;
    }

    public Manager() {
        System.out.println("执行Manager无参数构造器");
    }

    public Manager(String name, Date hireDay, Integer salary, Integer bonus) {
        super(name, hireDay, salary);
        this.bonus = bonus;
        System.out.println("执行Manager有参数构造器");
    }

    //子类可以覆盖父类的函数方法
    @Override
    public Integer getSalary() {
        if (bonus == null) {
            return super.getSalary();
        }
        return super.getSalary() + bonus;
    }
}
