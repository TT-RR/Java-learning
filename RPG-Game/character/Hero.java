package character;

import item.Sword;

public class Hero {
	public String name;	    //名前
	public int hp;			//HP
	public Sword sword;     //装備【剣】
	
	// メソッド名 ： sleep
	// 引数 ： なし
	// 戻り値 ： なし
	// 処理内容 ： 
	public void sleep() {
		this.hp = 100;
		System.out.println(this.name + "は、眠って回復した！");
	}
	
	// メソッド名 ： sit
	// 引数 ： int型sec(秒数)
	// 戻り値 ： なし
	// 処理内容 ： クラス変数hpに対して、sec秒分だけHPを回復する
	public void sit(int sec) {
		this.hp += sec;
		System.out.println(this.name + "は、" + sec + "秒座った！");
		System.out.println("HPが、" + sec + "ポイント回復した");
	}
	
	// メソッド名 ： slip
	// 引数 ： なし
	// 戻り値 ： なし
	// 処理内容 ：HPを-5(固定)する
	public void slip() {
		this.hp -= 5;
		System.out.println(this.name + "は、転んだ！");
		System.out.println("5のダメージ");
	}
	
	// メソッド名 ： run
	// 引数 ： なし
	// 戻り値 ： なし
	// 処理内容 ：「GAME OVER」と最終結果を表示する
	public void run() {
		System.out.println(this.name + "は、逃げ出した！");
		System.out.println("GAME OVER");
		System.out.println("最終HPは" + this.hp + "でした");
	}
	
	public void attack() {
		System.out.println(this.name + "は攻撃した！");
		System.out.println("敵に5のダメージをあたえた！");
	}
	
	public Hero(String name) {
		this.hp = 100;
		this.name = name;
	}
	
	// 引数なしのコンストラクタが呼び出された場合
	public Hero() {
		/* 
            【 コンストラクタ 】 
            newされた直後に自動的に実行される
            開発者が直接呼び出すものではない
            → インスタンスの生成時にJVMによって呼び出される
		*/
		
		//　自分のクラス内でString型1つを引数に持つコンストラクタを実行する
		//　public Hero(String name)を実行 -> 名前はダミーになる
		this("ダミー");
	}
	
	public Hero(String name,int hp) {
		this.name = name;
		this.hp = hp;
	}
}
