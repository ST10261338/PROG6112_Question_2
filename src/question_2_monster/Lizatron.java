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
public class Lizatron extends Monster{
    ArrayList<String> abilityCheck = new ArrayList<String>();
    
    public Lizatron() {
        super(120f, 100f, 0f, 15f, "Lizatron");
    }
    @Override
    public int ChooseAttack(Scanner kb) {
        //random entry to pick a choice
        //defien the range
        int choice = (int)(Math.random() * 6) + 1;
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
                
            default:
                System.out.println("Invaid entry");
                ChooseAttack(kb);break;
                
        }
        return 0;
    }
    
    @Override
    public void DisplayNoMana(Scanner kb) {
        ChooseAttack(kb);
    }
}
