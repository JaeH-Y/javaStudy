package exampleTest;

import java.util.ArrayList;import java.util.Comparator;
import java.util.List;

public class Sol35 {
	public static void main(String[] args) {
		String[] files = {"img12.png", "img10.png", "img02.png", "img1.png", "IMG01.GIF", "img2.JPG"};
		
		String[] answer = new String[files.length];
		List<List<String>> fileList = new ArrayList<>();
		for(String file : files) {
			int numS = file.length();
			int numE = 0;
			for(int i = 0; i < file.length(); i++) {
				char c = file.charAt(i);
				if(c >= '0' && c <= '9') {
					numS = Math.min(i, numS);
					numE = Math.max(i, numE);
				}
				if(i+1 < file.length() && numS != file.length() && !(file.charAt(i+1) >='0' && file.charAt(i+1) <= '9')) break;
			}
			List<String> inList = new ArrayList<String>();
			inList.add(file.substring(0, numS));
			inList.add(file.substring(numS, numE + 1));
			inList.add(file.substring(numE + 1));
			
			fileList.add(inList);
		}
		
		fileList.sort(new Comparator<List<String>>() {

			@Override
			public int compare(List<String> a, List<String> b) {
				String aHead = a.get(0);
				String bHead = b.get(0);
				
				int headCompare = aHead.compareToIgnoreCase(bHead);
				
				if(headCompare != 0) return headCompare;
				
				int aNum = Integer.parseInt(a.get(1));
				int bNum = Integer.parseInt(b.get(1));
				
				return aNum - bNum;
			}
			
		});
//		System.out.println(fileList);
		
		for(int i = 0; i < fileList.size(); i++) {
			List<String> temp = fileList.get(i);
			StringBuilder builder = new StringBuilder();
			builder.append(temp.get(0));
			builder.append(temp.get(1));
			builder.append(temp.get(2));
			String word = builder.toString();
			answer[i] = word;
		}
		
		for(String word : answer) {
			System.out.println(word);
		}
	}
}
