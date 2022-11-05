package Buyer;

import java.util.Random;

public class ecoAdvice implements Advice {
    private String Advice[] = new String[10];

    public ecoAdvice(String Advice){

    }
    public void addAdvice(String a){
        for (int i = 0; i < Advice.length; i++){
            if (Advice[i]==null) {
                Advice[i]=a;
            }
        }
    }
    public String getAdvice(String[] Advice) {
        int random;
        Random r = new Random();
        random=r.nextInt(10);
        return Advice[random];
    }
    public String[] deleteAdvice(String[] Advice, int i){
        String[] nAdvice = new String[Advice.length-1];
        System.arraycopy(Advice, 0, nAdvice,0, i);
        if(Advice.length!=i){
            System.arraycopy(Advice, i+1,nAdvice, i, Advice.length-i-1);
        }
        return nAdvice;
    }
    public void updateAdvice(){

    }
}
