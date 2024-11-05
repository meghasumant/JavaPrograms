public class RemoveDuplicates {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 4, 5, 2, 3, 6, 7, 8, 1, 4};
        
        // Displaying the original array
        System.out.println("Original Array:");
        for (int num : array) {
            System.out.print(num + " ");
        }
        System.out.println();
        
        // Removing duplicates
        int[] uniqueArray = removeDuplicates(array);
        
        // Displaying the array after removing duplicates
        System.out.println("\nArray after removing duplicates:");
        for (int num : uniqueArray) {
            System.out.print(num + " ");
        }
    }
    
    // Function to remove duplicates
    public static int[] removeDuplicates(int[] array) {
        int length = array.length;
        
        // Checking for empty array
        if (length == 0 || length == 1) {
            return array;
        }
        
        // Finding the count of unique elements
        int uniqueCount = 0;
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueCount++;
            }
        }
        
        // Creating an array to store unique elements
        int[] uniqueArray = new int[uniqueCount];
        int index = 0;
        
        // Adding unique elements to the new array
        for (int i = 0; i < length; i++) {
            boolean isUnique = true;
            for (int j = 0; j < i; j++) {
                if (array[i] == array[j]) {
                    isUnique = false;
                    break;
                }
            }
            if (isUnique) {
                uniqueArray[index++] = array[i];
            }
        }
        
        return uniqueArray;
    }
}