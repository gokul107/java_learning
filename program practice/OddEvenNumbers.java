public class OddEvenNumbers {

  public static void main(String[] args) {
    int[] numbers = {6, 8, 2, 5, 13, 15, 20};

    // Iterate over the array using a for each loop.
    for (int number : numbers) {
      // Check if the number is even.
      if (number % 2 == 0) {
        System.out.println(number + " is even");
      } else {
        System.out.println(number + " is odd");
      }
    }
  }
}