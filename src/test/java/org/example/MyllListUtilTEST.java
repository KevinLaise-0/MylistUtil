package org.example;

import org.codehaus.plexus.archiver.util.DefaultArchivedFileSet;
import org.joda.time.DateTime;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

import org.joda.*;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;

import static org.junit.Assert.*;

/**
 * Unit test for simple App.
 */
public class MyllListUtilTEST
{
    private ArrayList<Integer> a = new ArrayList<Integer>();
    private static ArrayList<Integer> c = new ArrayList<Integer>();
    private static ArrayList<Integer> d = new ArrayList<Integer>();
    private static MylListUtil myList = null;
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {
        assertTrue( true );
    }

    @BeforeClass
    public static void BeforePrint(){
        myList = new MylListUtil();
        System.out.println("Comicio i test");
        c.add(1);
        c.add(2);
        c.add(3);
        c.add(5);
        c.add(9);
        d.add(9);
        d.add(5);
        d.add(3);
        d.add(2);
        d.add(1);
        System.out.println(c);
        System.out.println(d);
    }

    @Before
    public void anorderArray(){
        a.add(2);
        a.add(1);
        a.add(5);
        a.add(9);
        a.add(3);
        System.out.println(a);
    }
    @Test
    public void testCrescenteThrowsException() {
        DateTime ora = new DateTime();
        assertTrue(c.equals(myList.orderC(a)));
        System.out.println(ora);
    }

    @Test
    public void testDecrescenteThrowsException(){
        DateTime ora = new DateTime();
        assertTrue(d.equals(myList.orderD(a)));
        System.out.println(ora);
    }

}
