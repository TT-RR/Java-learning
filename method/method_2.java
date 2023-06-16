package test;

public class Code5_7 {
	//戻り値の例
	
	// メソッド名 ： add
	// 引数 ： int型 x ,int型 y
	// 戻り値 ： int型
	// 処理内容 ： 引数のxとyを合計した値を返すメソッド
	public static int add(int x,int y) {
		int ans = x + y;
		return ans;
	}
	
	public static void main(String[] args) {
		int ans = add(100,10);
		System.out.println("100 + 10 = " + ans);
	}

}
