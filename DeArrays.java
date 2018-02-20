/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package blle.phoenix;

import java.util.Arrays;
import java.util.Collections;


/**
 *
 * @author BLLE
 */
public class DeArrays {
    
    public static void FindArray(String[] arr, String [] sub)
    {
        
        int res;
        res = Collections.indexOfSubList(Arrays.asList(arr), Arrays.asList(sub));
        System.out.println(res);
        
    }
    
}
