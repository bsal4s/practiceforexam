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
