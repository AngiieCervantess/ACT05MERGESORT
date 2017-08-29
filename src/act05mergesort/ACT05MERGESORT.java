/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package act05mergesort;

import static act05mergesort.MERGESORT.MergeSort;
import static act05mergesort.MERGESORT.VerVector;

/**
 *
 * @author Angelica
 */
public class ACT05MERGESORT {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        int vec[]={5,14,7,50,1,4,88,23,2};
                System.out.println("");
                VerVector(vec);
                System.out.println("\n");
                MergeSort(vec);
                VerVector(vec);
                
                System.out.println("\n");
        
    }
    
}
