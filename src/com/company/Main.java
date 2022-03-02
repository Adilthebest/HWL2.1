package com.company;

import javax.swing.*;

import static com.company.Enum3.BERSERK;

public class Main {

    public static void main(String[] args) {

        bot2 objectA = new bot2(100,5,Enum3.DOKTOR);
        bot3 objectB = new bot3(200,25,Enum3.MAGIC);
        bot3 objectC = new bot3(120,23, BERSERK );
        System.out.println("objectA " + objectA.getInfo() + "\nobjectB " + objectB.getInfo() +
                "\nobjectC " + objectC.getInfo());

    }
}
