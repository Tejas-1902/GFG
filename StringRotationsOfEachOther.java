public class StringRotationsOfEachOther {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String str1="geeksforgeeks";
		String str2="forgeeksgeeks";
		
		String concat=str1+str1;
		System.out.println(concat);
		
		if(concat.contains(str2))
			System.out.println(true);
		else
			System.out.println(false);

	}

}
