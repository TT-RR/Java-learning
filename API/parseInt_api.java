packege Main;

public class parseInt_api {
    public static void main(String[] args) {
        //文字列を数字に変換する方法
        //ラッパークラスのparseIntメソッドを使用

        String str = "123";
        int num = Integer.parseInt(str);
        System.out.println(num);
    }
}
```