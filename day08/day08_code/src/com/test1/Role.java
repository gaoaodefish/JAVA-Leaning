package com.test1;

import java.util.Random;

public class Role {
    String name;
    int blood;

    public Role() {

    }

    public Role(String name, int blood) {
        this.name = name;
        this.blood = blood;
    }

    /**
     * 获取
     *
     * @return name
     */
    public String getName() {
        return name;
    }

    /**
     * 设置
     *
     * @param name
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * 获取
     *
     * @return blood
     */
    public int getBlood() {
        return blood;
    }

    /**
     * 设置
     *
     * @param blood
     */
    public void setBlood(int blood) {
        this.blood = blood;
    }

    public String toString() {
        return "Role{name = " + name + ", blood = " + blood + "}";
    }

    public void attack(Role role) {
        Random r = new Random();
        int hurt = r.nextInt(20) + 1;
        int remain = role.getBlood() - hurt;
        remain = remain < 0 ? 0 : remain;
        role.setBlood(remain);
        System.out.println(this.name + "打了" + role.name + "一下，" +
                "造成了" + hurt + "伤害，" + role.name + "剩余" + remain + "血量");
    }
}
