/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package com.mycompany.ujian_123040038;
/**
 *
 * @author SB 604-16
 */
import static org.junit.Assert.*;
public class Test {
    private static Soal s;
    
//    @Test
    public void test1() {
        assertSame("Harusnya", "6", s.perkalian(3, 2));
    }
    
    public void test2() {
        assertNotSame("Harusnya", "10", s.perkalian(1, 5));
    }
    
}
