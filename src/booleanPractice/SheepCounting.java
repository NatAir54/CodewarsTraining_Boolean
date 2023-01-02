package booleanPractice;

/*
* Consider an array/list of sheep where some sheep may be missing from their place.
* We need a function that counts the number of sheep present in the array (true means present).
* Hint: Don't forget to check for bad values like null/undefined.
 */

public class SheepCounting {
    public static void main(String[] args) {
        Boolean[] array = {true, true, false, true, true, false, true, false, false};
        System.out.println(countSheep(array));
    }

    public static int countSheep(Boolean[] arrayOfSheep) {
        int counter = 0;
        for (Boolean sheep : arrayOfSheep) {
            if (sheep != null && sheep) {
                counter++;
            }
        }

        return counter;
    }
}
