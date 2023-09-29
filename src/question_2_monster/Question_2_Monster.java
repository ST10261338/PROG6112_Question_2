/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package question_2_monster;

import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Question_2_Monster {
    
    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        //programe is a game about 2 monsters fighting and your goal is to win
        //sending it to the battle class to do all the issues
        Scanner kb = new Scanner(System.in);
        Battle bat = new Battle();
        bat.Start(kb);
    }
}

