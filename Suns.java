/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverr;

/**
 *
 * @author anast
 */
//this class represents Objects in the Solar System
public class Suns extends pointInSpace{
    
    //the super keyword is used to invoke a superclass's constructor
    /*
     * @param distance the distance from this object to the point about which it is orbiting.
     * @param angle the angle (in degrees) that represents how far the object is around its orbit.
     * @param diameter the size of the object.
     * @param col the colour of this object, as a string.
     * @param speed the speed of this object.
    */
    public Suns(double distance, double angle, double diameter, String colour, double speed) {
        super(distance, angle, diameter, colour, speed);
    }
    
}
