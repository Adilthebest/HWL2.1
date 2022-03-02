package com.company;



public class bot1 {
    private int heath;
    private int damage;
    private Enum3 enum3;


    public bot1(int heath, int damage , Enum3 enum3) {
        this.heath = heath;
        this.damage = damage;
        this.enum3 = enum3 ;
    }

    public Enum3 getColor() {
        return enum3;
    }


    public int getHeath() {
        return heath;
    }

    public int getDamage() {
        return damage;
    }

    public  String getInfo ( ) {
        return "health =" +  heath +
                "\ndamage =" + damage +
                "\nPersonage =  " + enum3;
    }
}


