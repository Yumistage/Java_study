package com.zeroten.jicheng;

import org.junit.Test;

import java.util.Date;

public class EmployeeTest {

    @Test
    public void testPrint() {
        Employee yg1 = new Employee();
        yg1.setName("员工1");
        yg1.setHireDay(new Date());
        yg1.setSalary(100);
        yg1.printlnInfo();

        Manager jl1 = new Manager();
        jl1.setName("经理1");
        jl1.setHireDay(new Date());
        jl1.setSalary(120);
        jl1.setBonus(30);
        jl1.printlnInfo();

        Employee yg2 = new Employee("员工2", new Date(), 100);
        yg2.printlnInfo();

        Manager jl2 = new Manager("经理2", new Date(), 130, 40);
        jl2.printlnInfo();


    }

    @Test
    public void testDuoTai() {
        Employee yg1 = new Employee();

        Manager jl1 = new Manager();


        Employee yg = yg1;
        yg.printlnInfo();
        yg = jl1;
        yg.printlnInfo();
    }
}
