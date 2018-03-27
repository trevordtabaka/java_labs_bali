class BubbleSort{

	public static void main(String[] args){
		int[] myArray = new int[args.length];
		for(int i = 0; i<args.length;i++){
		
			myArray[i] = Integer.parseInt(args[i]);
		}

		
		for(int i = 1; i<myArray.length; i++){
			for(int j=myArray.length-1; j >= i ; j--){
			
				if(myArray[j-1] > myArray[j]){
				
					int k = myArray[j];
					myArray[j] = myArray[j-1];
					myArray[j-1] = k;

				}

			}

		}
		for(int num:myArray){

			System.out.print(num + ",");
		}
	}

}

