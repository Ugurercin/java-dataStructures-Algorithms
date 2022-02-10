public class BubbleSort {

    /** Bubble Sort Algorithm
     * In-place Algorithm
     * O(n^2) time complexity - quadratic
     * linear
     */

    /** The algorithm traverses the array until the desired contidion satisfied.
     * During the traverse, compares to indices e.g i and i+1 and replaces the elements in the given positions.
     */
    public static void main(String[] args) {
        int[] intArray = { 15, 25, 33, -21 , 17, -50, 12};
        printInitialArray(intArray);
        for(int lastUnsortedIndex = intArray.length - 1; lastUnsortedIndex > 0; lastUnsortedIndex--) {
            for(int i = 0; i < lastUnsortedIndex; i++) {
                if(intArray[i] > intArray[i+1]){
                    swapElements(intArray, i, i+1);
                }
            }
        }
        System.out.println("Sorted Array : ");
        for(int i = 0; i < intArray.length; i++) {
            System.out.print(intArray[i] + " ");
        }
    }



    /*swaps the elements in the array*/
    public static void swapElements(int[] array, int i, int j) {
        if(i == j) {
            return;
        }
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

    public static void printInitialArray(int[] array) {
        System.out.println("Initial Array :");
        for(int i = 0; i < array.length; i++) {
            System.out.print(array[i] + " ");

        }
        System.out.println();
    }

}
