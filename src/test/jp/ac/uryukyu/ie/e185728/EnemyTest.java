package jp.ac.uryukyu.ie.e185728;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class EnemyTest {

    @Test
    void attack() {
        int heroHP = 10;
        Hero hero = new Hero("testHero", 8, 4);
        Enemy enemy = new Enemy("testEnemy", 6, 2);
        enemy.dead = true;
        for (int i = 0; i < 10; i++) {
            enemy.attack(hero);
        }
        assertEquals(heroHP, hero.hitPoint);
    }
}