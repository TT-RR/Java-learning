// 練習問題
// 以下の仕様のメソッドを作成し、mainメソッドから呼び出してください。
	
// メソッド名 ： stringScanner
// 引数 : String型
// 戻り値 : String型
// 処理内容 : ユーザからキーボードで文字を入力させ、その文字と引数の文字を
// 			 結合し、値を戻す
	
// メソッド名 ： intScanner
// 引数 : int型
// 戻り値 : int型
// 処理内容 : ユーザからキーボードで数字を入力させ、その数字と引数の数字を
// 			 合計し、値を戻す
	
// メソッド名 ： doubleScanner
// 引数 : double型
// 戻り値 : double型
// 処理内容 : ユーザからキーボードで小数を入力させ、その小数と引数の小数を
// 			 合計し、値を戻す
	
// 回答
package test;

public class Rensyu_Code5 {
	
	public static void main(String[] args) {
		String stringAns = stringScanner("さん");
		int intAns = intScanner(10);
		double doubleAns = doubleScanner(3.14);
		
		System.out.println(stringAns);
		System.out.println(intAns);
		System.out.println(doubleAns);
	}
	
	public static String stringScanner(String target) {
        System.out.println("文字列を入力してください");
        String line = new java.util.Scanner(System.in).nextLine();
        
        return line + target;		
	}

	public static int intScanner(int target) {
		System.out.println("数字を入力してください");
		int number1 = new java.util.Scanner(System.in).nextInt();
		
		return number1 + target;
	}
	
	public static double doubleScanner(double target) {
		System.out.println("小数を入力してください");
		double number2 = new java.util.Scanner(System.in).nextDouble();
		
		return number2 + target;
	}
}
