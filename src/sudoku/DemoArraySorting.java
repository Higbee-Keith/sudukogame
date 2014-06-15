package sudoku;

/**
 *
 * @author Keith Higbee, Jae Dillree, Josiah Hendricks, Jessie Gomez, Daniel Allen
 */
public class DemoArraySorting {

    //Declare variables
    //int compareValues, minIndex, maxIndex, temp;
    int rows = 9;
    
    //Declare array
    int[] numbers = {4, 2, 9, 6, 5, 1, 8, 3, 7};
    
    //constructor
    public DemoArraySorting() {
        
    }
    
    public void getUnsortedArray() {
        int minIndex, tempValue;
        
        //print current array before sort
        System.out.println("\nArray before being sorted: ");
        for (int printArray = 0; printArray < numbers.length; printArray++) {
            System.out.print(numbers[printArray] + " ");
        }
        
        //for loop to sort array with a selection sort
        for (int i = 0; i < numbers.length - 1; i++) {
            minIndex = i; //initialize to first element
            for (int j = i + 1; j < numbers.length; j++) { //locate smallest element
                if (numbers[j] < numbers[minIndex]) {
                    minIndex = j; 
                } //close if
            } //close for j loop
            tempValue = numbers[minIndex]; //assign smallest element to tempValue
            numbers[minIndex] = numbers[i]; //assign next element to minIndex
            numbers[i] = tempValue; //assign tempValue to new location in array
        } //close for i loop
    } //close getUnsortedArray method
    
    public void displaySortedArray() {
        //Display the sorted loop
        System.out.println("\n\nArray after being sorted: ");
	for (int i = 0; i < numbers.length; i++) { //print out new sorted array
            System.out.print(numbers[i] + " "); 
        }
    }
}
