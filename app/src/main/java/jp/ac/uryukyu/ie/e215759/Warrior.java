package jp.ac.uryukyu.ie.e215759;

public class Warrior extends Hero{
    public Warrior(String name, int maximumHP, int attack){
        super(name, maximumHP, attack);
    }

    public void attackWithWeponSkill(LivingThing opponent){
        int damage;
        if(hitPoint > 0){
            damage = (int)(attack*1.5);
            System.out.printf("%sの攻撃！ウェポンスキルを発動！%sに%dのダメージを与えた！！\n", name, opponent.getName(), damage);
        }
        else{
            damage = 0;
        }
        opponent.wounded(damage);
    }
}
