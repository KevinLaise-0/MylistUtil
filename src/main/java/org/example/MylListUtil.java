package org.example;

import java.util.ArrayList;

public class MylListUtil {
    private ArrayList<Integer> lista = new ArrayList<Integer>();

    public MylListUtil() {
    }

    public ArrayList<Integer> orderC(ArrayList<Integer> num){
        for(int i=0;i<num.size()-1;i++){
            for(int j =i+1;j < num.size();j++){
                if(num.get(i)>num.get(j)){
                    Integer salva = num.get(i);
                    num.set(i,num.get(j));
                    num.set(j,salva);
                }
            }
        }
        System.out.println("Crescente");
        for(int i=0;i<num.size();i++){

            System.out.print(num.get(i)+" ");
        }
        return num;
    }
    public ArrayList<Integer> orderD(ArrayList<Integer> num){
        for(int i=0;i<num.size()-1;i++){
            for(int j =i+1;j < num.size();j++){
                if(num.get(j)>num.get(i)){
                    Integer salva = num.get(i);
                    num.set(i,num.get(j));
                    num.set(j,salva);
                }
            }
        }
        System.out.println();
        System.out.println("Decrescente");
        for(int i=0;i<num.size();i++){

            System.out.print(num.get(i)+" ");
        }
        return num;
    }

}
