/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package classwork;

import java.util.Arrays;

/**
 *
 * @author pupil
 */
public class Classwork {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("исследование массивов в JAVA");
        System.out.println("одномерный массив");
        int[] nums;
        nums = new int[5];
        nums[0] = 5;
        nums[2] = 4;
        nums[2] = 3;
        nums[3] = 2;
        nums[4] = 1;
        System.out.println("nums ="+ Arrays.toString(nums));
//        int[] newNums = new int[7];
        int[] newNums = Arrays.copyOf(nums,10);
        Arrays.fill(newNums,5,10,10);
        Arrays.sort(newNums);
        
//        System.arraycopy(nums,0, newNums, 0, nums.length);
//        for(int i=0; i<nums.lengt,i++){
//            newNums[i] = nums[i];
//        }
        nums= newNums;
        int[]nums2;
        nums2=nums;
        nums2[2]=2;
        nums2= new int[6];
        nums2[2]=3;
        System.out.println("nums =" + Arrays.toString(nums));
        System.out.println("nums2 =" + Arrays.toString(nums2));

//        System.out.print("nums= [");
//        for(int i=0; i< nums.length;i++){
//            System.out.print(nums[i]);
//            System.out.print(", ");
//        }
//        System.out.println("]");
//        
//        System.out.print("");
//        System.out.print("nums2 = [");
//        for(int i=0; i< nums.length;i++){
//            System.out.print(nums2[i]);
//            System.out.print(", ");
//        }
//        System.out.println("]");
    }
    
}
