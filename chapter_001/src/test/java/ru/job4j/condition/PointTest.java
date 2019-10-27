package ru.job4j.condition;

import org.junit.Assert;
import org.junit.Test;



public class PointTest {
   @Test
    public void distance(){
        int x1= 0;
        int y1= 0;
        int x2= 1;
        int y2= 0;

       double expected = 1.0;
       double out = Point.distance(x1,y1,x2,y2);
       Assert.assertEquals(expected, out, 0.01);
    }
}
