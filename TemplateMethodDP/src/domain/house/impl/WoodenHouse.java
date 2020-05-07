/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.house.impl;

import domain.house.HouseTemplate;

/**
 *
 * @author urosv
 */
public class WoodenHouse extends HouseTemplate{

    @Override
    public void buildWalls() {
        putSomeEffort();
        System.out.println("Building wooden walls...");
    }

    @Override
    public void buildPillars() {
        putSomeEffort();
        System.out.println("Building pillars with wood coating...");
    }
    
}
