package edu.unl.raikes.ArrayUtilsUnitTesting;

/**
 * Contains helpful static functions for arrays of Strings.
 * 
 * @author Dr. Stephanie Valentine
 */
public class StringArrayUtils {

	/**
	 * Returns the index of the smallest element in the input array (determined
	 * lexicographically). If there are duplicate minimum elements in the input
	 * array, the function will return the index of the first occurrence. If the
	 * array has zero elements, or is null, the function will return -1.
	 * 
	 * @param array
	 *            the array from which the minimum element will be found
	 * @return the index of the minimum element in the provided array, or -1 if the
	 *         provided array is empty or null
	 */
	public static int getIndexOfMinElement(String[] array) {
		if (array == null || array.length < 1) {
			return -1;
		}
		int minElementIndex = 0;
		for (int i = 1; i < array.length; i++) {
			if (array[i].compareTo(array[minElementIndex]) == -1) {
				minElementIndex = i;
			}
		}
		return minElementIndex;
	}

	/**
	 * Searches for input String in the input array of Strings. If the element is
	 * found, function returns true. If the provided String isn't in the array, or
	 * if the array is empty or null, the function returns false.
	 * 
	 * @param haystack
	 *            The array from which to search for the needle
	 * @param needle
	 *            The String to search for
	 * @return true if the needle is in the haystack, false otherwise (if the needle isn't
	 *         in the haystack array, or if the haystack array is null)
	 */
	public static boolean contains(String[] haystack, String needle) {
		for (int i = 1; i < haystack.length; i++) {
			if (haystack[i].equals(needle)) {
				return true;
			}
		}
		return false;
	}

}
