package studentsSkills;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.IntStream;

public class StudentsSkills {

	public static void main(String[] args) {

		String entrada = "pzpmzmpqpmqzbqbb";
		int teams = 0;
		
		
		List<Integer> charList = new ArrayList<Integer>();
		
		IntStream.range(0, 5).forEach(i -> charList.add(i, 0));
		
		for (Character c : entrada.toCharArray()){
			
			if(c.equals('p'))
				charList.set(0, charList.get(0)+1);
			
			if(c.equals('m'))
				charList.set(1, charList.get(1)+1);
			
			if(c.equals('z'))
				charList.set(2, charList.get(2)+1);
			
			if(c.equals('q'))
				charList.set(3, charList.get(3)+1);
			
			if(c.equals('b'))
				charList.set(4, charList.get(4)+1);
			
		}
		
		while(charList.get(0) > 0 &&
				charList.get(1) > 0 &&
				charList.get(2) > 0 &&
				charList.get(3) > 0 &&
				charList.get(4) > 0 ){
			
			teams++;
			
			charList.set(0, charList.get(0)-1);
			charList.set(1, charList.get(1)-1);
			charList.set(2, charList.get(2)-1);
			charList.set(3, charList.get(3)-1);
			charList.set(4, charList.get(4)-1);
			
		}
			
			
		
		System.out.println("Quantidade de times: " + teams);
		
	}

}
