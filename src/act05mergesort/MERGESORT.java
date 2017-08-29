/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act05mergesort;

import java.util.Arrays;

/**
 *
 * @author Angelica
 */
public class MERGESORT {
    
    public static void MergeSort(int vector[]){
        
                if(vector.length<=1) return;
                int mitad= vector.length/2;
                int primero[]=Arrays.copyOfRange(vector, 0, mitad);
                int ultimo[]=Arrays.copyOfRange(vector, mitad, vector.length);
                MergeSort(primero);
                MergeSort(ultimo);       
                JuntarVector(vector, primero, ultimo);
        }
    
    public static void JuntarVector(int vector[], int primero[],int ultimo[]){
        
                int i=0;
                int j=0;
                
                for(int k=0;k<vector.length;k++){
                        if(i>=primero.length){
                                vector[k]=ultimo[j];
                                j++;
                                continue;
                        }
                        if(j>=ultimo.length){
                                vector[k]=primero[i];
                                i++;
                                continue;
                        }
                        if(primero[i]<ultimo[j]){
                                vector[k]=primero[i];
                                i++;
                        }else{
                                vector[k]=ultimo[j];
                                j++;
                        }
                }
        }
    
    
    
    public static void VerVector(int vector[]){
                for(int i=0;i<vector.length;i++){
                        System.out.print(vector[i]+" ");
                }
        }
    
}
