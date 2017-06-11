
public class Test {

	public static void main(String[] args) {
		
		/*for(int i=1;i<=10;i++){
			System.out.println(i);
		}*/
		
	/*	int[] x = {1,2,3,4,5};
		for(int i : x){
			System.out.println(i);
		}*/
		
		
		String expValue="Welcome to Selenium Class";
		String actValue="Welcome to Selenium Class";
		
		if(expValue.contentEquals(actValue)){
			System.out.println("Test Passed");
		}else{
			System.out.println("Test Failed");
		}
			
		
	}

}
