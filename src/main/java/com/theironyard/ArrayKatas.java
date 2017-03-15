package com.theironyard;

import java.util.Objects;

/**
 * This exercise is another collection of katas. Follow the instructions below
 * to create the specified methods.
 */
public class ArrayKatas {

    /**
     * Write a static method named sumArray() that accepts an array of doubles
     * and returns the sum of all of the numbers. The length of the array
     * received is arbitrary and unbounded. If there are zero numbers in the
     * array then return 0.
     *
     * For this method you should use a for-each loop.
     *
     * @param numbers an array of doubles
     * @return the sum of the provided array of doubles
     */
    // todo: create sumArray() method
	public static double sumArray(double[] numbers){
		double sum=0;

		for (double number:numbers) {
//			if(number==0){
//				return 0;
//			}
			sum += number;
		}
		return sum;
	}

    /**
     * Create a static method named concatenateStrings() that accepts an array
     * of Strings and concentrates them together. The array of String objects is
     * is arbitrary and unbounded. If there are zero Strings in the array then
     * return an empty string.
     *
     * For this method you should use a classic for loop (not for-each).
     *
     * @param strings an array of String
     * @return a concatenation of the provided array of strings.
     */
    // todo: create concatenateStrings() method
	public static String concatenateStrings(String[] strings){
		String newString ="";
//		for (String string: strings) {
//			if(string == null){
//				return null;
//			}
//			newString =newString + string;
//		}
		for(int i = 0; i < strings.length; i++){
			//prevent concat with nulls
			if(strings[i] == null){
				continue;
			}

			newString = newString+strings[i];
		}

		return newString;
	}

    /**
     * Create a static method named reverseArray that accepts an array of
     * Objects. The method should return a new array in the reverse order. For
     * example:
     *
     * input:
     *
     * ["This", true, 1, 5.6]
     *
     * reversed:
     *
     * [5.6, 1, true, "This"]
     *
     * Because the input and result can contain any type of data, make sure your
     * arguments and return data types are an array of the Object class.
     *
     * @param objects an array of arbitrary objects
     * @return an array of objects in reverse order
     */
    // todo: create reverseArray() method
	public static Object[] reverseArray(Object[] objects){
		Object[] newObject = new Object[objects.length];
		int count = 0;
		for(int  i = objects.length - 1; 0 <= i;i--){

			newObject[count] = objects[i];

			count ++;

		}
		return newObject;

	}

}
