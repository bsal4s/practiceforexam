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
