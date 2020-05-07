/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package main;

import domain.house.HouseTemplate;
import domain.house.impl.GlassHouse;
import domain.house.impl.WoodenHouse;

/**
 *
 * @author urosv
 */
public class Main {
    
    //OPEN TERMINAL FOR VIEWING OUTPUT

    public static void main(String[] args) {
        HouseTemplate houseType = new WoodenHouse();
        houseType.buildHouse();

        System.out.println("***************");

        houseType = new GlassHouse();
        houseType.buildHouse();

    }

}
