package kadai_028;

import java.util.HashMap;
import java.util.Scanner;

public class Jyanken_Chapter28 {
	

	public String getMyChoice() { //自分のじゃんけんの手を入力する

		System.out.println("自分のジャンケンの手を入力しましょう");
		System.out.println("グーはrockのrを入力しましょう");
		System.out.println("チョキはscissorsのsを入力しましょう");
		System.out.println("パーはpaperのpを入力しましょう");
		
		Scanner scanner = new Scanner(System.in);
		String input = scanner.next();
		boolean bool = true;

		while (bool) {
		
			if (input.equals("r") || input.equals("s") || input.equals("p")) {
				scanner.close();
				bool = false;
			}else {
				System.out.println("正しいジャンケンの手を入力してください");
				input = scanner.next();
			}
		}
		
		return input;
		
	}
	
	public String setRandom() { //対戦相手のじゃんけんの手を乱数で選ぶ
		
		String[] hand = new String[] {"r","s","p"};
		
		String result = hand[(int)Math.floor(Math.random() * 3)];
		
		return result;
	}
	
	public void playGame( String hand1,String hand2 ) { //じゃんけんを行う
		
		HashMap<String,String> jyanken = new HashMap<String,String>();
		
		jyanken.put("r","グー");
		jyanken.put("s","チョキ");
		jyanken.put("p","パー");
		
		System.out.println("自分の手は" + jyanken.get(hand1) + ",対戦相手の手は" + jyanken.get(hand2) );
		
		String judge = "";
		
		 if (hand1.equals(hand2)) {
			 judge = "あいこです";
			 
		 } else if (hand1.equals("r")) {
			 if(hand2.equals("s")) {
				 judge = "自分の勝ちです";
			 } else if (hand2.equals("p")) {
				 judge = "自分の負けです";
			 }
			 
		 } else if (hand1.equals("s")) {
			 if(hand2.equals("p")) {
				 judge = "自分の勝ちです";
			 } else if (hand2.equals("r")) {
				 judge = "自分の負けです";
			 }
			 
		 } else if (hand1.equals("p")) {
			 if(hand2.equals("r")) {
				 judge = "自分の勝ちです";
			 } else if (hand2.equals("s")) {
				 judge = "自分の負けです";
			 }
		 }
		 
		 System.out.println(judge);
	}
}
