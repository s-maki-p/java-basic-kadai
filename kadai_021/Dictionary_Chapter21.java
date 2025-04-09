package kadai_021;

import java.util.HashMap;

public class Dictionary_Chapter21 {
	
	
	HashMap<String,String> dictionary = new HashMap<String,String>();
	
	public Dictionary_Chapter21() {
	dictionary.put("apple","りんご");
	dictionary.put("peach", "桃");		
	dictionary.put("banana", "バナナ");
	dictionary.put("lemon", "レモン");
	dictionary.put("pear", "梨");
	dictionary.put("kowi", "キウィ");
	dictionary.put("strawberry", "いちご");
	dictionary.put("grape", "ぶどう");
	dictionary.put("muscat", "マスカット");
	dictionary.put("cherry", "さくらんぼ");
	}
		
	
	public void displayDictionary(String[] lists) {
		
		for( String list : lists ) {
			
			if( dictionary.get(list) == null) {
				System.out.println( list + "は辞書に存在しません");
			} else {
				System.out.println( list + "の意味は" + dictionary.get(list));
			}
			
		}
		
	}
}
