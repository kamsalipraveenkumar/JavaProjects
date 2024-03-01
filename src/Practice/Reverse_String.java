package Practice;

public class Reverse_String {

	public static void main(String[] args) {
		
		    
		        String originalString = "Praveen Kumar";
		        String reversedString = reverse(originalString);
		        System.out.println("Original String: " + originalString);
		        System.out.println("Reversed String: " + reversedString);
		    }

		    public static String reverse(String str) {
		        char[] charArray = str.toCharArray();
		        int left = 0;
		        int right = charArray.length - 1;

		        while (left < right) {
		            char temp = charArray[left];
		            charArray[left] = charArray[right];
		            charArray[right] = temp;
		            left++;
		            right--;
		        }

		        return new String(charArray);
		    }
		


	}


