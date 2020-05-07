/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package domain.house;

import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author urosv
 */
public abstract class HouseTemplate {

    //Template method, final so subclassses cannot override it
    public final void buildHouse() {
        buildFoundation();
        buildPillars();
        buildWalls();
        buildWindows();
        putSomeEffort();
        System.out.println("House is built !");
    }
    
    //Default implmementation, hook method
    private void buildWindows(){
        putSomeEffort();
        System.out.println("Building glass windows...");
    }
    
    //Methods to be implmemented by subclasses
    public abstract void buildWalls();
    public abstract void buildPillars();
    
    private void buildFoundation(){
        putSomeEffort();
        System.out.println("Building foundation with cement, iron rods and sand...");
    }
    
    //Just a Thread.sleep(seconds) method
    public void putSomeEffort(){
        try {
            Thread.currentThread().sleep(1500);
        } catch (InterruptedException ex) {
            Logger.getLogger(HouseTemplate.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

}
