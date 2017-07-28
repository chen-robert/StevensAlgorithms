import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
class anagramsFinal
{
	//Create default constants A and B for hashing
	static final int A = 27382126;
    static final int B = 97382923;
    public static void main (String[] args)
    {
        Scanner scan = new Scanner(System.in);

	//Moved the things to one line
        String str1 = scan.nextLine().toLowerCase();
        String str2 = scan.nextLine().toLowerCase();

	//Print stuff out here
        if(isAnagram(str1, str2))
	{
		System.out.println("It is an anagram");	
	}
	else
	{
		System.out.println("It actually isn't one.");		
	}
		  

    }
	//Moved logic to an external function
	public static boolean isAnagram(String str1, String str2){
	    if (str1.length() != str2.length())return false;
		
      	    //Calculates hash values
	    long arrayProduct1 = 1;
	    for(int i = 0; i < str1.length(); i++){
		arrayProduct1 = (arrayProduct1 * (A + str1.charAt(i))) % B;
	    }

	    long arrayProduct2 = 1;
	    for(int i = 0; i < str2.length(); i++){
		arrayProduct2 = (arrayProduct2 * (A + str2.charAt(i))) % B;
	    }

	    if(arrayProduct1 == arrayProduct2)return true;
	    return false;
	}
}
