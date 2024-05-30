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
public class Paddle extends Rectangle {
    int id;
    int yVelocity;
    int direction;
    int speed;
    public Paddle(int x,int y , int PADDLE_WIDTH, int PADDLE_HEIGHT ,int id ) {
        super(x,y,PADDLE_WIDTH,PADDLE_HEIGHT);
        this.id=id;
    }
    
    public void keyPressed(KeyEvent e){
            if(e.getKeyCode()==KeyEvent.VK_W && this.id ==1){
                if(y>=0){
                    speed=-5;
                    direction=1;
                    move();
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_UP && this.id ==2){
                if(y>=0){
                    direction=1;
                    speed=-5;
                    move();
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_S && this.id ==1){
                if(y<=(GamePanel.GAME_HEIGHT - GamePanel.PADDLE_HEIGHT)){
                    direction=-1;
                    speed=-5;
                    move();
                }
            }
            else if(e.getKeyCode()==KeyEvent.VK_DOWN && this.id ==2){
                if(y<=(GamePanel.GAME_HEIGHT - GamePanel.PADDLE_HEIGHT)){
                    direction=-1;
                    speed=-5;
                    move();
                }
            }
    }
    public void keyReleased(KeyEvent e){
            if(e.getKeyCode()==KeyEvent.VK_W && this.id ==1){
                
                    speed=0;
                
            }
            else if(e.getKeyCode()==KeyEvent.VK_UP && this.id ==2){
                
                     speed=0;
                
            }
            else if(e.getKeyCode()==KeyEvent.VK_S && this.id ==1){
                
                    speed=0;
                
            }
            else if(e.getKeyCode()==KeyEvent.VK_DOWN && this.id ==2){

                    speed=0;
                
            }
    }
    public void setYDirection(int yDirection){
        
    }
    public void move(){
        y+=(speed*direction);
    }
    public void draw(Graphics g){
        if(id==1){
            g.setColor(Color.red);
        }
        else{
            g.setColor(Color.blue);
        }
        g.fillRect(x, y, width, height);
    }
}
