package Oopstaskfly;

public class Wrapperutility {

	public static Integer findMax(Integer[] numbers) {
   //     if (numbers == null || numbers.length == 0) return null;
        Integer max = numbers[0];
        for (Integer number : numbers) {
            if (number != null && number > max) max = number;
        }
        return max;
    }

    // Method to calculate the average of an array of doubles
    public static Double calculateAverage(Double[] numbers) {
      //  if (numbers == null || numbers.length == 0) return null;
        double sum = 0.0;
        for (Double number : numbers) {
            if (number != null) sum += number;
        }
        return sum / numbers.length;
    }

    // Method to convert a binary string to a Boolean array
    public static Boolean[] convertToBooleanArray(String binaryString) {
        if (binaryString == null || binaryString.isEmpty())
        	return new Boolean[0];
        Boolean[] booleanArray = new Boolean[binaryString.length()];
        for (int i = 0; i < binaryString.length(); i++) {
            booleanArray[i] = binaryString.charAt(i) == '1';
        }
        return booleanArray;
    }

    // Method to convert a Boolean array to a binary string
    public static String convertToBinaryString(Boolean[] booleanArray) {
        if (booleanArray == null || booleanArray.length == 0) return "";
        StringBuilder binaryString = new StringBuilder();
        for (Boolean bool : booleanArray) {
            binaryString.append(bool ? "1" : "0");
        }
        return binaryString.toString();
    }

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}
}

    
