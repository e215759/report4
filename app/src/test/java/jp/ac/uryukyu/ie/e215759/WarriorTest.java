package jp.ac.uryukyu.ie.e215759;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class WarriorTest {
    @Test
    void attackWithWeponSkillTest(){
        int strongEnemyHP = 300;
        Warrior warrior = new Warrior("戦士", 100, 80);
        Enemy enemy = new Enemy("スライムキング", strongEnemyHP, 40);
        int warriorDamage = (int)(warrior.attack * 1.5);
        int enemyDamage = enemy.attack;
        
        for(int i=0; i<3; i++){;
            warrior.attackWithWeponSkill(enemy);
            enemyDamage = strongEnemyHP - enemy.hitPoint;
            enemy.attack(warrior);
            assertEquals(warriorDamage, enemyDamage);
            strongEnemyHP -= enemyDamage;
        }
    }
}
