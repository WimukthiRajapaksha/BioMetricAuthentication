/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package BioMEtricAuth;

import static java.lang.Math.abs;
import java.util.ArrayList;

/**
 *
 * @author Wimukthi
 */
public class BioMetricAuthenticationAnaly {
    
    //method for validation 
    private Integer Validate( int errorAccuracy, Integer[] firstArray, Integer[] secondArray) {
        int marks = 0;
        try {
            for(int ma = 0; ma < firstArray.length; ma++) {
                if ((abs(firstArray[ma] - secondArray[ma]) < errorAccuracy)) {
                    marks++;
                }
            }
        }catch (Exception e) {
           return 0; 
        }
        return marks;
    }
    
    //analyzing inputs
    public Integer biometricAnalyze(Integer[] pressedListTime, Integer[] diffListTime, ArrayList<Integer[]> StoredPressedArrayList, ArrayList<Integer[]> storedPressedArrayListDifference) {
        int upper = 0;
        int maximumGot = 0;
        for (int an = 0; an < StoredPressedArrayList.size(); an++) {
            int t1 = Validate(40,pressedListTime, StoredPressedArrayList.get(an));
            int t2 = Validate(40,diffListTime, storedPressedArrayListDifference.get(an));
            System.out.println(Integer.toString(t1 + t2));
            if (t1 + t2 > upper) {
                upper = t1 + t2;
                maximumGot = an + 1;
            }
        }
        return maximumGot;
    }   
}