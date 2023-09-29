/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question_2_monster;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author matth
 */
public class Monkey extends Monster{
    
    Lizatron liz = new Lizatron();
    Question_2_Monster q2 = new Question_2_Monster();
    ArrayList<String> abilityCheck = new ArrayList<String>();
    
    public Monkey() {
        super(100f, 100f, 10f, 10f, "Monkeron");
    }
    
    @Override
    public int ChooseAttack(Scanner kb) {
        System.out.println("Choose your skill"
                + "\n-------------------------"
                + "\n1) Hyperbeam -10mp"
                + "\n2) Stab -0mp"
                + "\n3) Shield -10mp"
                + "\n4) Dominate -60mp"
                + "\n5) Heal -10mp"
                + "\n6) Shield Death -20mp"
                + "\n7) Self Destruct -0mp");
        
        int choice = kb.nextInt();
        switch (choice) {
            case 1://chose hyperbeam and save ability
                spellDMG = HyperBeam(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": HyperBeam");
                return 1;
             
            case 2:
                spellDMG = Stab();
                abilityCheck.add((abilityCheck.size() + 1) + ": Stab");
                return 1;
                
            case 3:
                spellDMG = Shield(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": Shield");
                return 3;
                
            case 4:
                spellDMG = Dominate(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": Dominate");
                return 1;
                
            case 5:
                spellDMG = Heal(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": Heal");
                return 2;
               
            case 6:
                spellDMG = ShieldDeath(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": ShieldDeath");
                return 4;
                
            case 7:
                spellDMG = SelfDestruct(kb);
                abilityCheck.add((abilityCheck.size() + 1) + ": SelfDestruct");
                return 5;
                
            default:
                System.out.println("Invaid entry");
                return 0;
                
        }
    }
    
    
    
}
