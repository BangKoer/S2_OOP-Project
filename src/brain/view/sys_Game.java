/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package brain.view;

import static brain.view.panel_fastmath1.timer;
import java.util.Random;
import java.util.Timer;
import java.util.TimerTask;

/**
 *
 * @author Lenovo V14
 */
public class sys_Game {
    
    private int a;
    private int b;
    private int answer;
    private String operator;
    private int mix_operator;

    public int setA(int ia) {
        return this.a = ia;
    }

    public int setB(int ib) {
        return this.b = ib;
    }

    public int getA() {
        return a;
    }

    public int getB() {
        return b;
    }

    public int getMix_operator() {
        Random random = new Random();
        return mix_operator = random.nextInt(4) ;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }
    

    
    public String setQuestion(){
        this.a = (int) (10 * Math.random());
        this.b = (int) (10 * Math.random());
        switch (getMix_operator()){
            //getAnswer(getA() + getB());//
            case 0 : this.answer = this.a + this.b;
                     setOperator(" + ");break;
            
            //getAnswer(this.a - this.b);//
            case 1 : this.answer = this.a - this.b;
                     setOperator(" - ");break;
            
            //getAnswer(this.a * this.b);//
            case 2 : this.answer = this.a * this.b;
                     setOperator(" * ");break;
            
        }
        return this.a + getOperator() + this.b + " ? ";
    }
    
}
