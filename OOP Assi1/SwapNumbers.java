public class SwapNumbers{
	public void swapTwoNum(int first,int second){
		int temp;
		temp =first;
		first=second;
		second=temp;
		System.out.printf("After Swaping \n First Number is %d and Second number is %d \n",first,second);
	}
	public void swapwithtwovar(int first ,int second){
		first = first +  second;   
  		second = first -  second;   
  		first = first -  second; 
		System.out.printf("After Swaping \n First Number is %d and Second number is %d \n",first,second);
	}
	 
	
}
