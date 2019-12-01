import java.util.Arrays;

public class ArrayTest {
	public static void main(String args[]){
		int[] array = {9, 4, 5, 6, 2, 1};
		Arrays.sort(array);//숫자가 작은 순으로 배열한다
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 1)); // 숫자의 의미는 0부터 5까지 몇번째로 배열되는지 알려준다
		Arrays.fill(array, 8);//8로 모든 배열을 채운다
		printArray(array);
	}
	private static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("]");
	}
}
