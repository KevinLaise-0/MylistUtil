package org.example;

import java.util.ArrayList;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        System.out.println( "Crescente = c OPPURE Decrescente =d" );
        MylListUtil m = new MylListUtil();
        ArrayList<Integer> a = new ArrayList<Integer>(5);
        a.add(2);
        a.add(1);
        a.add(5);
        a.add(9);
        a.add(3);
        m.orderC(a);
        m.orderD(a);
    }
}
