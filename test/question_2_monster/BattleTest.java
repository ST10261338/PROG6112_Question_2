/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */
package question_2_monster;

import java.util.Scanner;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author matth
 */
public class BattleTest {
    Battle bat = new Battle();
    Monkey mon = new Monkey();
    Lizatron liz = new Lizatron();
    
    public BattleTest() {
    }

    @Test
    public void testChooseAttackMon() {
        
        //checking all returning values
        
        //create the age being tested
        Scanner a = new Scanner("1");
        
        //checks if return value is equal
        assertEquals(1, mon.ChooseAttack(a));
        assertNotNull(mon.ChooseAttack(a));
        
        //create the age being tested
        Scanner b = new Scanner("3");
        
        //checks if return value is equal
        assertEquals(3, mon.ChooseAttack(b));
        assertNotNull(mon.ChooseAttack(b));
        
        //create the age being tested
        Scanner c = new Scanner("5");
        
        //checks if return value is equal
        assertEquals(2, mon.ChooseAttack(c));
        assertNotNull(mon.ChooseAttack(c));
        
        //create the age being tested
        Scanner d = new Scanner("6");
        
        //checks if return value is equal
        assertEquals(4, mon.ChooseAttack(d));
        assertNotNull(mon.ChooseAttack(d));
        
        //checking death
        Scanner e = new Scanner("7");
        assertNotNull(mon.ChooseAttack(e));
        
        //checks if the value is equal
        assertEquals(5,mon.ChooseAttack(e));
        assertNotNull(mon.ChooseAttack(e));
    }
    @Test
    public void testLoss() {
        //pass the string
        String result = "lost";
        
        //scanner
        Scanner kb = new Scanner("1");
        
        assertEquals("lost", bat.DisplayEnd(kb, result));
    }
    
    @Test
    public void testWin() {
        //pass the string
        String result = "win";
        
        //scanner
        Scanner kb = new Scanner("1");
        
        assertEquals("win", bat.DisplayEnd(kb, result));
    }
    
}
