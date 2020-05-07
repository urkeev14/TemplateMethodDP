 /*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.house.impl;

import domain.house.HouseTemplate;


public class GlassHouse extends HouseTemplate {

    @Override
    public void buildWalls() {
        putSomeEffort();
        System.out.println("Building glass walls...");
    }

    @Override
    public void buildPillars() {
        putSomeEffort();
        System.out.println("Building pillars with glass coating");
    }
    
}
