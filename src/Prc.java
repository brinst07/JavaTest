import java.util.Arrays;


public class Prc {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	
	int arr[] = new int[10];
	
	for(int i = 0; i<arr.length; i++){
		arr[i] = (int)(Math.random()*10);
	}
	System.out.println(Arrays.toString(arr));
	int temp = 0;
	for(int i = 0; i<arr.length; i++){
		temp = arr[0];
		arr[0] = arr[i];
		arr[i]= temp;
		
	}
	System.out.println(Arrays.toString(arr));
	
	}

}
