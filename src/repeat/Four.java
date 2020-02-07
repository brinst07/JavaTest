package repeat;

import java.util.Arrays;

public class Four {

	public static void main(String[] args) {

		String animals = "dog,cat,bear";
		
		String out[] = new String[3];
		
		out = animals.split(",");
		
		System.out.println(Arrays.toString(out));
		
		
	}
}
