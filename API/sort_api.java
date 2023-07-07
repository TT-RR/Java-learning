package test;

public class code6_10 {

	public static void main(String[] args) {
		// 配列の要素を並び替えるAPI
		int[] heights = {172,149,152,191,155};
		java.util.Arrays.sort(heights);
		for(int h:heights) {
			System.out.println(h);
		}
	}

}
