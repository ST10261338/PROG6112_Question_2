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
public class Monster {
    private float health, mana, shield, damage;
    private String name;
    public float spellDMG;

    public Monster(float health, float mana, float shield, float damage, String name) {
        this.health = health;
        this.mana = mana;
        this.shield = shield;
        this.damage = damage;
        this.name = name;
    }

    public float getHealth() {
        return health;
    }

    public float getMana() {
        return mana;
    }

    public float getShield() {
        return shield;
    }

    public float getDamage() {
        return damage;
    }

    public String getName() {
        return name;
    }
    
    public int ChooseAttack(Scanner kb) {
        return 0;
    }
    
    public float HyperBeam(Scanner kb) {
        if (mana >= 10) {
            System.out.println("\n**************************");
            System.out.println(name + " used HyperBeam!");
            System.out.println("**************************\n");
            mana = mana - 10f;
            float tempDMG = damage * 2;
            return tempDMG;
        } else {
            DisplayNoMana(kb);
        }
        return 0f;
    }
    
    public float Stab() {
        System.out.println("\n**************************");
        System.out.println(name + " used stab!");
        System.out.println("**************************\n");
        return damage;
    }
    
    public float Shield(Scanner kb) {
        if (mana >=  10) {
            System.out.println("\n**************************");
            System.out.println(name + " used shield!");
            System.out.println("**************************\n");
            mana = mana - 10f;
            return 40f;
        } else {
            DisplayNoMana(kb);
        }
        return 0f;
    }
    
    public float Dominate(Scanner kb) {
        if (mana >= 60f) {
            System.out.println("\n**************************");
            System.out.println(name + " used dominate!");
            System.out.println("**************************\n");
            float tempDMG = damage * 4;
            mana = mana - 60f;
            return tempDMG;
        } else {
            DisplayNoMana(kb);
        }
        return 0f;
    }
    
    public float Heal(Scanner kb) {
        if (mana >=  10f) {
            System.out.println("\n**************************");
            System.out.println(name + " used heal!");
            System.out.println("**************************\n");
            mana = mana - 10f;
            return 20f;
        } else {
            DisplayNoMana(kb);
        }
        return 0;
    }
    
    public float SelfDestruct(Scanner kb) {
        System.out.println("\n**************************");
        System.out.println(name + " used self destruct!");
        System.out.println("**************************\n");
        return 0f;
    }
    
    public float ShieldDeath(Scanner kb) {
        if (mana >= 20) {
            System.out.println("\n**************************");
            System.out.println(name + " used shield death!");
            System.out.println("**************************\n");
            mana = mana - 20f;
            return 0f;
        } else {
            DisplayNoMana(kb);
        }
        return 0f;
    }
    public void DisplayNoMana(Scanner kb) {
        System.out.println("Not enough mana!");
        ChooseAttack(kb);
    }
}
