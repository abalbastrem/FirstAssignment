/**
 * 
 */
package org.escoladeltreball.firstassignment;

import java.util.*;

/**
 * @author Pep Méndez
 *
 */
public final class ReviewImpl implements Review {
	
	private int frequency(int[] values, int n) {
		int counter = 0;
		for (int value : values) {
			if (n == value) {
				counter++;
			}
		}
		return counter;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see
	 * org.escoladeltreball.firstassignment.Utils#frequencyPercentage(int[],
	 * int)
	 */
	@Override
	public double frequencyPercentage(int[] values, int n) {
		return values.length == 0 ? 0 : ((double) frequency(values, n)) / values.length * 100;
	}

	/*
	 * (non-Javadoc)
	 * 
	 * @see org.escoladeltreball.firstassignment.Utils#merge(int[], int)
	 */
	@Override
	public int[] merge(int[] values, int n) {
		boolean found = false;
		int[] finalArray = new int[values.length+1];
		for (int i=0; i < values.length-1; i++) {
			if ( values[i] <= n && n <= values[i+1]) {
				finalArray[i] = n;
				found = true;
			}
			if (found) {
				finalArra
			}
		}
		int[] finalArray = mergedArray.toArray(new int[0]);
	}

	/*
	 * This method returns an integer matrix with row 0 holding even numbers and
	 * row 1 holding odd numbers.
	 * 
	 * NOTE: Don't waste space!!!
	 */
	@Override
	public int[][] split(int[] values) {
		return null;
	}

}
