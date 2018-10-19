/**
 * 
 */
package test;

import java.util.Scanner;

/**
 * @author sennbaku
 *
 */
public class StringTest {

	private String in = null;
	
	/**
	 * メインメソッド
	 * @param args
	 */
	public static void main(String[] args) {
		
		System.out.println("文字列を入れるか何も入力しないようにしてね！");
		Scanner scan = new Scanner(System.in);
		StringTest method = new StringTest(scan.nextLine());
		
		System.out.println(method.getIn());
		System.out.println(method);
		
	}
	
	/**
	 * コンストラクタ
	 */
	public StringTest() {
		this.in = "string null";
	}
	
	/**
	 * コンストラクタ
	 * @param in 入力文字列
	 */
	public StringTest(String in) {
		this.in = in;
	}
	
	/**
	 * フィールド変数inの値を取り出す getter
	 * @return　文字列
	 */
	public String getIn()  {
		return this.in;
	}
	
	/**
	 * toStringメソッドの挙動をテストする
	 * @return　出力文字列
	 */
	public String toString()  {
		String out = "toString[" + in + "]";
		return out;
	}

}
