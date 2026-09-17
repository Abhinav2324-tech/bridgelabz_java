package com.bridgelabz.java_stack_queue_hashmap;

public class CircularTour {
    public int findStartingPetrolPump(int[] petrol,int[] distance){
        int totalPetrol=0;
        int currentPetrol=0;
        int start=0;
        for(int i=0;i<petrol.length;i++){
            int remainingPetrol=petrol[i]-distance[i];
            totalPetrol=totalPetrol+remainingPetrol;
            currentPetrol=currentPetrol+remainingPetrol;

            if(currentPetrol<0){
                start=start+1;
                currentPetrol=0;
            }
        }
        if(totalPetrol<0){
            return -1;
        }
        return start;
    }

    public static void main(String[] args) {
        CircularTour obj=new CircularTour();
        int[] petrol = {4, 6, 7, 4};
        int[] distance = {6, 5, 3, 5};
        int start= obj.findStartingPetrolPump(petrol,distance);
        if(start==-1){
            System.out.println("Circular tour is not possible.");
        }
        else{
            System.out.println("Start from pump: "+start);
        }
    }
}
