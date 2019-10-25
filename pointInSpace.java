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
public class pointInSpace {
    private double distance;
    private double angle;
    private double diameter;
    private String colour;
    private double speed;
    
    //create methods to get the distance, angle, diameter, colour or the speed of the planets
    public double getDistance(){
        return distance;
    }
    public double getAngle(){
        return angle;
    }
    public double getDiameter(){
        return diameter;
    }
    public String getColour(){
        return colour;
    }
    public double getSpeed(){
        return speed;
    }
    
    public pointInSpace(double distance, double angle, double diameter, String colour, double speed){
        this.distance = distance;
        this.angle = angle;
        this.diameter = diameter;
        this.colour = colour;
        this.speed = speed;
    }
    
    //method used to move the planets
    public double move(){
        angle += speed;
        return angle;
    }
}
