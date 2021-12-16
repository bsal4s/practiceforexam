package practice;
import static org.junit.Assert.*;
import org.junit.Assert;
import org.junit.Test;

public class testSelectionSort {
	@Test
	public void test() {
	testPositive();
	testNegative();
	testMixed();
	testDuplicates();
	}
    public testSelectionSort() {
    }
    
    public void testPositive() {
		int[] arr = new int[5];
	    arr[0] = 8;
	    arr[1] = 9;
	    arr[2] = 7;
	    arr[3] = 10;
	    arr[4] = 2;
	        
	    int[] Sortedarr = new int[5];
	    Sortedarr[0] = 2;
	    Sortedarr[1] = 7;
	    Sortedarr[2] = 8;
	    Sortedarr[3] = 9;
	    Sortedarr[4] = 10;
	        
	    SelectionSort temp1 = new SelectionSort();
	    int fixedArr[] = temp1.basicSelectionSort(arr);
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr[i]);
	    	assertTrue(arr[i] > 0);
	    }
	}
	
	public void testNegative() {
		int[] arr2 = new int[5];
	    arr2[0] = -8;
	    arr2[1] = -9;
	    arr2[2] = -7;
	    arr2[3] = -10;
	    arr2[4] = -2;
	        
	    int[] Sortedarr2 = new int[5];
	    Sortedarr2[0] = -10;
	    Sortedarr2[1] = -9;
	    Sortedarr2[2] = -8;
	    Sortedarr2[3] = -7;
	    Sortedarr2[4] = -2;
	        
	    SelectionSort temp2 = new SelectionSort();
	    int fixedArr2[] = temp2.basicSelectionSort(arr2);
	    System.out.println("\n");
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr2[i]);
	    	assertTrue(arr2[i] < 0);
	    } 
	}
	
	public void testMixed() {
		int c1 = 0; int c2 = 0; int c3 = 0;
		int[] arr3 = new int[5];
	    arr3[0] = 8;
	    arr3[1] = 9;
	    arr3[2] = 0;
	    arr3[3] = -10;
	    arr3[4] = -2;
	        
	    int[] Sortedarr3 = new int[5];
	    Sortedarr3[0] = -10;
	    Sortedarr3[1] = -2;
	    Sortedarr3[2] = 0;
	    Sortedarr3[3] = 8;
	    Sortedarr3[4] = 9;
	        
	    SelectionSort temp3 = new SelectionSort();
	    int fixedArr3[] = temp3.basicSelectionSort(arr3);
	    System.out.println("\n");
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr3[i]);
	    	if (arr3[i] > 0) {
	    		c1++;
	    	}
	    	if (arr3[i] < 0) {
	    		c2++;
	    	}
	    	if (arr3[i] == 0) {
	    		c3++;
	    	}
	    }
	    assertTrue(c1 > 0);
	    assertTrue(c2 > 0);
	    assertTrue(c3 > 0); 
	}
	
	public void testDuplicates() {
		int c1 = 0; 
		int[] arr4 = new int[5];
	    arr4[0] = 0;
	    arr4[1] = 9;
	    arr4[2] = 0;
	    arr4[3] = -10;
	    arr4[4] = -2;
	        
	    int[] Sortedarr4 = new int[5];
	    Sortedarr4[0] = -10;
	    Sortedarr4[1] = -2;
	    Sortedarr4[2] = 0;
	    Sortedarr4[3] = 0;
	    Sortedarr4[4] = 9;
	        
	    SelectionSort temp4 = new SelectionSort();
	    int fixedArr4[] = temp4.basicSelectionSort(arr4);
	    System.out.println("\n");
	    for (int i = 0; i < 5; i++) {
	    	System.out.print(fixedArr4[i]);
	    	for (int j = i+1; j < 5; j++) {
	    		if (arr4[i] == arr4[j]){
		    		c1++;
		    	}
	    	}
	    }
	    assertTrue(c1 > 0); 
	}
    
}