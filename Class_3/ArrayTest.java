import java.util.Arrays;

public class ArrayTest {
	public static void main(String args[]){
		int[] array = {9, 4, 5, 6, 2, 1};
		Arrays.sort(array);//���ڰ� ���� ������ �迭�Ѵ�
		printArray(array);
		System.out.println(Arrays.binarySearch(array, 1)); // ������ �ǹ̴� 0���� 5���� ���°�� �迭�Ǵ��� �˷��ش�
		Arrays.fill(array, 8);//8�� ��� �迭�� ä���
		printArray(array);
	}
	private static void printArray(int[] array) {
		System.out.print("[");
		for(int i = 0; i < array.length; i++)
			System.out.print(array[i] + " ");
		System.out.println("]");
	}
}
