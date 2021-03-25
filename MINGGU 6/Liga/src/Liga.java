/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author ASUS
 */

public class Liga {
   
       String team;
       int play, goal, points;
       Liga(String t, int p, int g, int pt){
           team = t;
           play = p;
           goal = g;
           points = pt;
       }
       void tampil(){
           System.out.println("team = "+ team);
           System.out.println("play = "+ play);
           System.out.println("team = "+ goal);
           System.out.println("points = "+ points);
       }
       
    }
  

