package com.company;

public class Main {

    public static void main(String[] args) {

        Magic magic = new Magic(500, 30, "Boost");
        Medic medic = new Medic(400, 25, "HEAL");
        Warrior warrior = new Warrior(500, 37, "CRITICAL DAMAGE");

        Hero[] heroes = {magic, medic, warrior};

        for (int i = 0; i < heroes.length; i++) {
            heroes[i].applySuperAbility("");
        }
    }
}
