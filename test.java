package project;

import java.util.Set;
import java.util.TreeSet;

public class test {

    public static void main(String[] args) {
        int[] arr = {4, 4, 3, 3, 4, 7, 7, 0, 9, 2, 6, 8, 1, 99, 10, 8, 0, 3, 99};
        Set<Integer> s = new TreeSet<Integer>();
        int newVariable = Integer.MAX_VALUE; 
        int newVariable1 = Integer.MAX_VALUE; 
        int newVariable2=Integer.MAX_VALUE;
        
        for (int i = 0; i < arr.length; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] > arr[j]) {
                    int temp = arr[j];
                    arr[j] = arr[i];
                    arr[i] = temp;
                }
                if (arr[i] < newVariable) {
                    newVariable1 = newVariable;
                    newVariable = arr[i]; 
                } else if (arr[i] < newVariable1 && arr[i] != newVariable) {
                    newVariable1 = arr[i]; 
                }
                else if(arr[i]< arr[j]) {
                	newVariable2=arr[i];
                }
            }
            s.add(arr[i]);
            System.out.println(arr[i]);
        }
        System.out.println("duplicates removed: " + s);
        System.out.println("second smallest: " + newVariable1);
        System.out.println("second Largest: " + newVariable2);
    }
}
