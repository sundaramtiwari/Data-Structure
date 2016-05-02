/**
 * 
 */
package array;


/**
 * @author sundaramtiwari
 *
 */
public class Rotate_Array {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		int[] intArr = {1,2,3,4,5,6,7};
		System.out.println("Enter the number of steps to rotate array... \n");
		//Scanner sc = new Scanner(System.in); sc.nextInt()
		int[] rotatedArr = rotateArr(intArr, 3);
		for (int i=0; i < rotatedArr.length; i++) {
			System.out.println(rotatedArr[i]);
		}
	}
	
	private static int[] rotateArr(int[] intArr, int step) {
		int[] rotatedArr = new int[intArr.length];
		int arrayLength = intArr.length;
		for (int i=0; i < arrayLength; i++) {
			int index = (i+step+1) % arrayLength;
			rotatedArr[i] = intArr[index];
		}
		return rotatedArr;
	}

	class Array {
		
	}

}
