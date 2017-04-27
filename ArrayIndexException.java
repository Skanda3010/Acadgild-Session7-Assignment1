
public class ArrayIndexException {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr={1,2,3,4,5};
		
		try{
			for(int i=0;i<=arr.length;i++){
				System.out.println("The array element is "+arr[i]);
			}
		}catch (ArrayIndexOutOfBoundsException e)
		{
			e.printStackTrace();
			System.out.println("Trying to print the "+(arr.length+1)+"th value which is not there");
			System.out.println("The array has only 5 elements");

		}

	}

}
