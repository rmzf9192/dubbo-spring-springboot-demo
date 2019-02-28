package com.el.gmall.springboot;

import static org.junit.Assert.assertTrue;

import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithTrue()
    {

        assertTrue( true );
    }

    @Test
    public void test1(){
        String s = "abc";
        String s1 = new String("abc");
        String s2="a"+"b"+"c";

        System.out.println(s1==s);
        System.out.println(s==s1);
        System.out.print(s1.equals(s));

        for(int i=1;i<=9;i++){
            for(int j=1;j<=i;j++){
                System.out.print(i+"*"+j+"="+i*j+"     ");
            }
            System.out.println("\n");
        }
    }
}
