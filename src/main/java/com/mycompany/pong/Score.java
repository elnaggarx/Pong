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
public class Score extends Rectangle {
    int player1;
    int player2;
    static int GAME_WIDTH;
    static int GAME_HEIGHT;
    public Score(int GAME_WIDTH,int GAME_HEIGHT) {
        
    }
    public void draw(Graphics g){
        g.drawString("SCORE: "+player1+" : "+player2, GamePanel.GAME_WIDTH/2-40 ,40);
    }
}
