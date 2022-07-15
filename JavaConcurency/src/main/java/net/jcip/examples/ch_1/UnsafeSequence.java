package net.jcip.examples.ch_1;

import net.jcip.annotations.NotThreadSafe;

/**
 * UnsafeSequence
 *
 * @author Brian Goetz and Tim Peierls
 */

@NotThreadSafe
public class UnsafeSequence {
	private int value;

	/**
	 * Returns a unique value.
	 */
	public int getNext() {
		return value++;
	}

	public int getValue() {
		return value;
	}

	public static void main(String[] args) {
		UnsafeSequence obj = new UnsafeSequence();
		System.out.println(obj.getNext());
		System.out.println(obj.getNext());
		System.out.println(obj.getNext());
		System.out.println("*****************");
		System.out.println(obj.getValue());
	}
}
