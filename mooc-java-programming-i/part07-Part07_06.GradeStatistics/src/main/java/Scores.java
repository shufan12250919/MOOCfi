/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
import java.util.ArrayList;

public class Scores {
    private ArrayList<Score> scores;
    private int passNum;
    
    public Scores(){
        this.scores = new ArrayList<>();
        this.passNum = 0;
    }
    
    public void add(Score score){
        this.scores.add(score);
        if (score.getScore() >= 50){
            passNum ++;
        }
    }
    
    public double avg(){
        int sum = 0;
        for (Score one:this.scores){
            sum = one.getScore() + sum;
        }
        double avg = 1.0 * sum / (this.scores.size());
        return avg;
    }
    
    public double gAvg(){
        if (this.scores.size() == 0){
            return 0.0;
        }  
        int sum = 0;
        for (Score one:this.scores){
            if (one.getPass() == true){
                sum = one.getScore() + sum;
            }
        }
        double aAvg = 1.0 * sum / this.passNum;
        return aAvg;
    }
    
    public double passPercent(){
        if (this.scores.size() == 0){
            return 0.0;
        }      
        return 1.0 * this.passNum / this.scores.size() * 100; 
    }
    
    public void printGrade(int grade){
        for (Score one:this.scores){
            if (one.getGrade() == grade){
                System.out.print("*");
            }
        }
        System.out.println("");
    }
    
    public void printGrades(){
        System.out.println("Grade distribution:");
        for (int i = 5; i >= 0; i --){
            System.out.print(i + ": ");
            this.printGrade(i);
        }
    }
    
    
}
