package com.company;

public class bot2 extends bot1 {

    private int defence;
    private int speed;

    public bot2(int heath, int damage, Enum3 enum3)  {
        super(heath, damage, enum3);
    }

    public int getDefence() {
        return defence;
    }

    public int getSpeed() {
        return speed;
    }

    @Override
    public String getInfo() {
        return super.getInfo();
    }

    public int awm (int damage , int speed){
        return  damage ;
    }


    public final int awm ( int speed){
        return  speed ;
    }


}
