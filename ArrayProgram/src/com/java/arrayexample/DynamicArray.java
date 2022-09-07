package com.java.arrayexample;

public class DynamicArray {

	
	private int array[];
	private int count;
	private int size;
	



	public DynamicArray()
	{
	array = new int[1];
	count = 0;
	size = 1;
	}
	//function add an element at the end of array


	public void add(int data)
	{

	//check no of element is equal to size of array
	if (count == size) {
	growSize(); // make array size double
	} // insert element at end of array
	array[count] = data;
	count++;
	}



	//function makes size double of array
	public void growSize()
	{

	int temp[] = null;
	if (count == size) {


	//temp is a double size array of array
	//and store array elements
	temp = new int[size * 2];
	{
	for (int i = 0; i < size; i++) {
	//copy all array value into temp
	temp[i] = array[i];
	}
	}
	}



	//double size array temp initialize
	//into variable array again
	array = temp;



	//and make size is double also of array
	size = size * 2;
	}



	//function add an element at given index



	public void addAt(int index, int data)
	{
	//if size is not enough make size double
	if (count == size) {
	growSize();
	}



	for (int i = count - 1; i >= index; i--) {



	//shift all element right
	//from given index
	array[i + 1] = array[i];
	}



	//insert data at given index
	array[index] = data;
	count++;
	}



	


	public static void main(String[] args)
	{
	DynamicArray da = new DynamicArray();



	//add 9 elements in array
	da.add(1);
	da.add(2);
	da.add(3);
	da.add(4);
	da.add(5);
	da.add(6);
	da.add(7);
	da.add(8);
	da.add(9);
	/*da.add(10);
	da.add(11);
	da.add(12);
	da.add(13);
	da.add(14);
	da.add(15);
	da.add(16);
	da.add(17);*/





	//print all array elements after add 9 elements
	System.out.println("Elements of array:");
	for (int i = 0; i < da.size; i++) {
	System.out.print(da.array[i] + " ");
	}



	System.out.println();



	//print size of array and no of element
	System.out.println("Size of array: " + da.size);
	System.out.println("No of elements in array: " +
	da.count);



	
	


	//add an element at index 1
	da.addAt(1, 22);



	//print Elements of array after adding an
	//element at index 1
	System.out.println("Elements of array after" +
	" add an element at index 1:");
	for (int i = 0; i < da.size; i++) {
	System.out.print(da.array[i] + " ");
	}



	System.out.println();



	//print size of array and no of element
	System.out.println("Size of array: " + da.size);
	System.out.println("No of elements in array: " +
	da.count);





	



	}
}
