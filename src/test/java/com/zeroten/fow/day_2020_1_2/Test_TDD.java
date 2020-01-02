package com.zeroten.fow.day_2020_1_2;
import com.zeroten.javales.AgeCheck;
import org.testng.Assert;
import org.testng.annotations.Test;

public class Test_TDD {

  //String  AgeCheck.getAgeName(int age)


    @Test
    public void testAgeCheck1() {
        //given
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(20),"青年");
        //when

        //then
    }

    @Test
    public void testAgeCheck2() {
        //given
        Assert.assertEquals(AgeCheck.getAgeName(6),"儿童");
        Assert.assertEquals(AgeCheck.getAgeName(20),"青年");
        //when

        //then
    }
}
