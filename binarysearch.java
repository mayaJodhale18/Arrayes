package array;

import java.util.Collections;
import java.util.Vector;

public class binarysearch {

	public static void main(String[] args) {
int a[]= {11,22,33,44,55,66};

Vector<Integer> al = new Vector<Integer>();

int position = Collections.binarySearch(al, "66");
System.out.println("Character found at : " + position);

}}