package org.manjunath.arrays;

import org.testng.Assert;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class RemoveElementFromArrayTest {
    private RemoveElementFromArray obj;

    @BeforeMethod
    public void setUp() {
        obj = new RemoveElementFromArray();
    }


    @Test
    public void testRemoveElement() {
        int[] nums = {3, 2, 3, 3, 2, 2, 3, 1};
        int element = obj.removeElement(nums, 2);
        Assert.assertEquals(5, element);
    }

    @Test
    public void testRemoveElementMethod2() {
        int[] nums = {3, 2, 3, 3, 2, 2, 3, 1, 6, 4, 3, 7};
        int element = obj.removeElementMethod2(nums, 3);
        Assert.assertEquals(7, element);
    }
}
