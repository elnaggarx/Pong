/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.pong;
import java.awt.*;
import java.awt.event.*;
import java.util.*;
import javax.swing.*;
/**
 *
 * @author user
 */
public class Ball extends Rectangle {
    Random random;
    int yVelocity;
    int xVelocity;
    public Ball(int x , int y , int width , int height) {
        super(x,y,width,height);
        random = new Random();
        int randomXDirection = random.nextInt(2);
        if(randomXDirection==0){
            randomXDirection--;
        }
        setXDirection(randomXDirection);
        int randomYDirection = random.nextInt(2);
        if(randomYDirection==0){
            randomYDirection--;
        }
        setYDirection(randomXDirection);
        
    }
    public void setYDirection(int randomYDirection){
        yVelocity = randomYDirection;
    }
    public void setXDirection(int randomXDirection){
        xVelocity = randomXDirection;
    }
    public void move(){
        y+=yVelocity;
        x+=xVelocity;
        
    }
    public void draw(Graphics g){
        g.setColor(Color.white);
        g.fillOval(x, y, height,width);
    }
}
