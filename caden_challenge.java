class caden_challenge{

        public static void main(String[] args){

                int[] myArray = {0,1,2,3,4,5,6,7,8,9};
                int placeHolder;
                for(int x=0;x<(myArray.length/2); x++){
			placeHolder = myArray[x];
                        myArray[x] = myArray[myArray.length-(1+x)];
			myArray[myArray.length-(1+x)] = placeHolder;
				
                }

		for(int num:myArray){
			
			System.out.print(num + ",");


		}

        }





}


