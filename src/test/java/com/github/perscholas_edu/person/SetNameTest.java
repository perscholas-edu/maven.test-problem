package com.github.perscholas_edu.person;

import org.junit.Assert;
import org.junit.Test;

/**
 * Created by leon on 6/2/2020.
 */
public class SetNameTest {
    @Test
    public void test1() {
        test("bob");
    }

    @Test
    public void test2() {
        test("Marcial");
    }

    private void test(String nameToBeTested) {
        // given
        Person person = new Person();

        // when
        person.setName(nameToBeTested);

        // then
        Assert.assertEquals(nameToBeTested, person.getName());
    }
}
