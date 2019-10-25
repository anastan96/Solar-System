/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package driverr;

import java.util.Random;

/**
 *
 * @author anast
 */
public class driver {
    public static void main(String arg[]){
            SolarSystem test = new SolarSystem(800, 800); //create a new Solar System using the Solar System class
            //create the planets with given parameters
            Suns sun = new Suns(0, 0, 70, "YELLOW", 0);
            Planets mercury = new Planets(50, 30, 10, "LIGHT_GRAY" ,2);
            Planets venus = new Planets(90, 30, 20, "GREEN", 1.5);
            Planets earth = new Planets(140, 30, 25, "BLUE", 1);  
            Planets mars = new Planets(180, 30, 15, "RED", 0.7);
            Planets jupiter = new Planets(270, 30, 35, "ORANGE", 0.5);

            Moons moon = new Moons(15, 30, 2, "WHITE", 1.5); 
         
            while(true){
                /*
                Draw a round shape that represents an object in the Solar System using the method drawSolarObject(method that makes the planets
                orbit around the sun).
                Use getDistance(), getAngle(), getDiameter(), getColour() to get the characteristics of the planets.
                */ 
                test.drawSolarObject(sun.getDistance(), sun.getAngle(), sun.getDiameter(), sun.getColour());
                test.drawSolarObject(mercury.getDistance(), mercury.move(), mercury.getDiameter(), mercury.getColour());
                test.drawSolarObject(venus.getDistance(), venus.move(), venus.getDiameter(), venus.getColour());
                test.drawSolarObject(earth.getDistance(), earth.move(), earth.getDiameter(), earth.getColour());
                test.drawSolarObject(mars.getDistance(), mars.move(), mars.getDiameter(), mars.getColour());
                test.drawSolarObject(jupiter.getDistance(), jupiter.move(), jupiter.getDiameter(), jupiter.getColour());
                
                /*
                Draw a round shape that represents an object in the Solar System using the method drawSolarObjectAbout(method that makes the moons 
                orbit around the planet) 
                */
                test.drawSolarObjectAbout(moon.getDistance(), moon.getAngle() + moon.move(), moon.getDiameter(), moon.getColour(), earth.getDistance(), earth.getAngle());
                test.drawSolarObjectAbout(moon.getDistance(), moon.getAngle() + moon.move(), moon.getDiameter(), moon.getColour(), mars.getDistance(), mars.getAngle());
                
                /*
                Calculate the distance between Mars and Jupiter and use Random() function to position the asteroids between the two planets.
                Calculate a minimum and a maximum to find the proper distance betweend the planets where the asteroids could be displayed.
                */
                double min = mars.getDistance() + mars.getDiameter()/2.0 + moon.getDiameter()/2.0 + 14;
                double max = jupiter.getDistance() - jupiter.getDiameter()/2.0 - moon.getDiameter()/2.0 - 17;
                double distance;
                int angle;
                for(int i = 0; i < 200; i++){
                    Random rand = new Random();
                    distance = rand.nextDouble()*(max - min - 10) + min;
                    angle = rand.nextInt(360);
                    Moons moon1 = new Moons(distance, angle, 2, "YELLOW", 0.1);
                    test.drawSolarObject(moon1.getDistance(), moon1.move(), moon1.getDiameter(), moon1.getColour());
                }
                
                //Draw the moons of Jupiter using the Random() function
                double distanceJupiter;
                int angle1;
                for(int j = 0; j < 67; j++){
                    Random rand1 = new Random();
                    distanceJupiter = rand1.nextDouble() * (3) + jupiter.getDiameter() - 10;
                    angle1 = rand1.nextInt(360);
                    Moons moon2 = new Moons(distanceJupiter, angle1, 2, "WHITE", 0.1);
                    test.drawSolarObjectAbout(moon2.getDistance(), moon2.getAngle() + moon2.move(), moon2.getDiameter(), moon2.getColour(), jupiter.getDistance(), jupiter.getAngle());
                }
                
                test.finishedDrawing();
                
                
            }
            
        }
}
