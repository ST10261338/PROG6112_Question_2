/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package question_2_monster;

import java.util.Scanner;


/**
 *
 * @author matth
 */
public class Battle {
    
        Monkey mon = new Monkey();
        Lizatron liz = new Lizatron();
        float HP = mon.getHealth();
        float SP = mon.getShield();
        float enemyHP = liz.getHealth();
        float enemySP = liz.getShield();
        boolean run = true;
        Scanner kb = new Scanner(System.in);
        
        public void Start(Scanner kb) {
        while (run) {
            System.out.println("Monkey Health: " + HP + "                    Lizatron Health: " + enemyHP);
            System.out.println("Monkey Shield: " + SP + "                      Lizatron Shield: " + enemySP);
            System.out.println("Monkey Mana: " + mon.getMana() + "                      Lizatron Mana: " + liz.getMana());
            System.out.println("------------------------------------------------------------------------");
            
            //switch that determines what the ability does
            switch (mon.ChooseAttack(kb)) {
                case 0://redo becuase invalid
                    mon.ChooseAttack(kb);
                    
                case 1://attack move
                    if (mon.spellDMG >= enemySP) {
                        float lDMG = mon.spellDMG - enemySP;
                        enemySP = 0f;
                        enemyHP = enemyHP - lDMG;
                    } else {
                        enemySP = enemySP - mon.spellDMG;
                    }break;
                   
                case 2://heal
                    HP = HP + mon.spellDMG;
                    if (HP > mon.getHealth()) {
                        HP = mon.getHealth();
                    }break;
                    
                case 3://shield
                    SP = SP + mon.spellDMG;break;
                    
                case 4://shield strip
                    enemySP = 0f;break;
                    
                case 5://self destruct
                    HP = -20f;break;
            }
            
            //if statment to check game status
            if (enemyHP <= 0f) {
                System.out.println("You have won, congrats!");
                run = false;
                DisplayEnd(kb, "won");
            }
            switch (liz.ChooseAttack(kb)) {
                case 1://attack move
                    if (liz.spellDMG >= SP) {
                        float lDMG = liz.spellDMG - SP;
                        SP = 0f;
                        HP = HP - lDMG;
                    } else {
                        SP = SP - liz.spellDMG;
                    }break;
                   
                case 2://heal
                    enemyHP = enemyHP + liz.spellDMG;
                    if (enemyHP > liz.getHealth()) {
                        enemyHP = liz.getHealth();
                    }break;
                    
                case 3://shield
                    enemySP = enemySP + liz.spellDMG;break;
                    
                case 4://shield strip
                    SP = 0f;break;
            }
            //checks your health if you lost
            if (HP <= 0f) {
                System.out.println("You have lost");
                run = false;
                DisplayEnd(kb, "lost");
            }
        }
        
    }
    public String DisplayEnd (Scanner kb, String result) {
        int endChoice;
        System.out.println("Would you like to see what skills were used and how you " + result + "?"
                + "\n1) Yes"
                + "\n2) No");
        endChoice = kb.nextInt();
        
        switch (endChoice) {
            case 1 ://displaying info for game
                System.out.println("Info"
                        + "\n**********************************************************************");
                for (int i = 0; i < mon.abilityCheck.size(); i++) {
                    System.out.println("Turn: " + (i + 1) + " Monkeron: " + mon.abilityCheck.get(i)
                    + "\t\tLizatron: " + liz.abilityCheck.get(i));
                    
                }return result;
            case 2://exit system
                System.exit(0);break;
        }
        return result;
    }
}
