/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author linshu-fan
 */
public class Score {
    private int point;
    private boolean pass;
    private int grade;
    
    public Score(int point){
        this.point = point;
        this.pass = this.ispass();
        this.grade = this.transgrade();
        
    }
    
    public boolean ispass(){
        if (this.point >= 50){
            return true;
        } else {
            return false;
        }
    }
    
    public int transgrade(){
        if (this.point < 50){
            return 0;
        } else if (this.point < 60){
            return 1;
        } else if (this.point < 70){
            return 2;
        } else if (this.point < 80){
            return 3;
        } else if (this.point < 90){
            return 4;
        } else{
            return 5;
        }
        
    }
    
    public int getScore(){
        return this.point;
    }
    
    public boolean getPass(){
        return this.pass;
    }
    
    public int getGrade(){
        return this.grade;
    }
    
}
