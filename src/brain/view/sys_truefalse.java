/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.view;

/**
 *
 * @author Lenovo V14
 */

//import java.security.SecureRandom;
//import java.util.ArrayList;
import java.util.Random;

public class sys_truefalse extends sys_Game {
    
    private int answer;
    private int acakjwb;
   
        
     //Backup
    @Override
    public String setQuestion(){
        Random random2 = new Random();
        switch (getMix_operator()){
            case 0 : this.answer = setA(random2.nextInt(20)) + setB(random2.nextInt(20));
                     setOperator(" + ");break;
            case 1 : this.answer = setA(random2.nextInt(20)) - setB(random2.nextInt(20));
                     setOperator(" - ");break;
            case 2 : this.answer = setA(random2.nextInt(20)) * setB(random2.nextInt(20));
                     setOperator(" * ");break;
            case 3 : setA(random2.nextInt(20));setB(random2.nextInt(20));
                    if(getA() < getB() || getA() == getB()){
                        setOperator(" % ");
                        this.answer = 0;
                    } else if(getA() > getB()) {
                    this.answer = getA() % getB();
                    setOperator(" % ");break;
                    }    
        }
        return getA() + getOperator() + getB() + " = ";
    }
    
    public int getAnswer() {
        return this.answer;
    }

    public int getAcakjwb(int input,int input2) {
        Random rand = new Random();
        int acakans[] = {input,input2};
        this.acakjwb = acakans[rand.nextInt(2)];
        return acakjwb;
    }
  
}
    
