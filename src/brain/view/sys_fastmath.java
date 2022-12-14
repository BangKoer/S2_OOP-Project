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
import java.util.ArrayList;
import java.util.Random;

public class sys_fastmath extends sys_Game {
    
    private int answer;
//    private int mixAnswer;
   
        
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
                        this.answer = 0;
                        setOperator(" % ");
                    } else if(getA() > getB()) {
                    this.answer = getA() % getB();
                    setOperator(" % ");break;
                    }    
        }
        return getA() + getOperator() + getB() + " ? ";
    }
    
    public int getAnswer() {
        return this.answer;
    }

//    public int getMixAnswer() {
//        int size = 4;
//
//        ArrayList<Integer> list = new ArrayList<Integer>(size);
//        for(int i = 1; i <= size; i++) {
//            list.add(i);
//        }
//
//        Random rand = new Random();
////        int index = 0;
//        while(list.size() > 0) {
//            int index = rand.nextInt(list.size());
////            System.out.println("Selected: "+list.remove(index));
//           switch(list.remove(index)){
//               case 1 : this.mixAnswer = this.answer;break;
//               case 2 : this.mixAnswer = rand.nextInt(12);break;
//               case 3 : this.mixAnswer = rand.nextInt(13);break;
//               case 4 : this.mixAnswer = rand.nextInt(14);break;
//           }
//        }
//        return mixAnswer;
//    }
    
}
    
