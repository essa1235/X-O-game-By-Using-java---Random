/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package x_o.game;

import java.util.Arrays;
import java.util.Scanner;
import java.util.Random;
import java.util.List;
import java.util.ArrayList;

public class X_OGame {

    static ArrayList<Integer> playerpostins = new ArrayList<Integer>();
    static ArrayList<Integer> CPU = new ArrayList<Integer>();
    public static void main(String[] args) {
        char [][] game = {{' ','|',' ','|',' '},
                         {'-','+','-','+','-'},
                         {' ','|',' ','|',' '},
                         {'-','+','-','+','-'},
                         {' ','|',' ','|',' '}};
        
        for (char[] row : game){
        
            for (char e :  row){
            
                System.out.print(e);
            }
        
            System.out.println();
        }
        
        while(true){
        
            Scanner input = new Scanner(System.in);
            System.out.println("من فضلك اختر الرقم من واحد إلى تسعة");
           int x = input.nextInt();
           while(playerpostins.contains(x)|| CPU.contains(x)){
           x = input.nextInt();
           }
           
           System.out.println(x);
           String g = "player";
           char s = ' ';
           if (g.equals("player")){
           
               s = 'X';
               playerpostins.add(x);
           }
               else if (g.equals("cpu")){
               
                   s = 'O';
                   CPU.add(x);
               }
           switch(x){
           
               case 1 :
                   game [0][0] = s;
                   break;
                   case 2 :
                   game [0][2] = s;
                   break;
                   case 3 :
                   game [0][4] = s;
                   break;
                   case 4 :
                   game [2][0] = s;
                   break;
                   case 5 :
                   game [2][2] = s;
                   break;
                   case 6 :
                   game [2][4] = s;
                   break;
                   case 7 :
                   game [4][0] = s;
                   break;
                   case 8 :
                   game [4][2] = s;
                   break;
                   case 9 :
                   game [4][4] = s;
                   break;
              
           
           }
           Random rand = new Random();
           int cpupos = rand.nextInt(9)+1;
           
           while (playerpostins.contains(cpupos)|| CPU.contains(cpupos)){
           
           cpupos = rand.nextInt(9)+1;
           
           }
           
           String g1 = "cpu";
           char s1 = ' ';
           
           if (g1.equals("player")){
           
               s1 = 'x';
               playerpostins.add(cpupos);
           }
           else if (g1.equals("cpu")){
           
               s1 = 'O';
               CPU.add(cpupos);
           }
           
           switch (cpupos){
           
                case 1 :
                   game [0][0] = s;
                   break;
                   case 2 :
                   game [0][2] = s;
                   break;
                   case 3 :
                   game [0][4] = s;
                   break;
                   case 4 :
                   game [2][0] = s;
                   break;
                   case 5 :
                   game [2][2] = s;
                   break;
                   case 6 :
                   game [2][4] = s;
                   break;
                   case 7 :
                   game [4][0] = s;
                   break;
                   case 8 :
                   game [4][2] = s;
                   break;
                   case 9 :
                   game [4][4] = s;
                   break;
                   default:
                       
              
           }
        
               List toprow = Arrays.asList(1,2,3);
            List midrow = Arrays.asList(4,5,6);
             List botrow = Arrays.asList(7,8,9);
              List leftcol = Arrays.asList(1,4,7);
              List midcol = Arrays.asList(2,5,8);
              List rigcol = Arrays.asList(3,6,9);
              List croo1 = Arrays.asList(1,5,9);
               List croo2 = Arrays.asList(7,5,3);
               
               List <List> winning =  new ArrayList<>();
               winning.add(toprow);
               winning.add(midrow);
               winning.add(botrow);
               winning.add(leftcol);
               winning.add(midcol);
               winning.add(rigcol);
               winning.add(croo1);
               winning.add(croo2);
               
               for (List l : winning){
            if (playerpostins.contains(1)){
            
                System.out.println("You win!");
                break;
            }
        
            else if (CPU.contains(l)){
            
                System.out.println("You failed!");
                break;
            
            }
            else if (playerpostins.size()+CPU.size() == 9){
            
                System.out.println("Draw");
                break;
            }
        
        }
               
               for (char [] row : game){
               
                   for (char e : row){
                   
                       System.out.print(e);
                   }
               
                   System.out.println();
               }
               
           
           
           }
       
        }
        
                         
    }
    

    

