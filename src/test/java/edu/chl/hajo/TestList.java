package edu.chl.hajo;

import static java.lang.System.out;
import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

/*
    
     This is a test class (for some other class, in this case the List class)

 */
public class TestList {


    @Test
    public void testAdd(){
        List l = new List();
        l.add(1);
        assertTrue(l.getLength() == 1);
    }

    @Test
    public void testRemove(){
        List l = new List();
        int i = 1;
        l.add(i);
        assertTrue(l.remove() == 1);
    }

    @Test(expected = IllegalArgumentException.class)
    public void testGetBadIndex(){
        List list = new List();
        list.get(-1);
    }

    @Test
    public void testCopy(){
        List l = new List();
        l.add(10);
        l.add(15);
        l.add(1);
        l.add(6);

        List lCopy = l.copy();


        assertFalse(lCopy == l);

        boolean fail = false;

        for (int i = 0; i < l.getLength(); i++) {
            if(l.get(i) != lCopy.get(i)){
                out.println(l.get(i) + " | " + lCopy.get(i));
                fail = true;
            }
        }

        assertFalse(fail);

    }


}
