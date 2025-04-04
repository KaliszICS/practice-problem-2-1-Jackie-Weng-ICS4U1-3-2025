public class PracticeProblem {

 
    public static int find(int[] array, int number) {
        for (int i = 0; i < array.length; i++) {
            if (array[i] == number) {
                return i;
            }
        }
        return -1;
    }


    public static int findLast(String[] array, String string) {
        for (int i = array.length - 1; i >= 0; i--) {
            if (array[i].equals(string)) {
                return i;
            }
        }
        return -1;
    }



    public static int findSecond(char[] array, char character) {
        int count = 0;
        int firstIndex = -1;

        for (int i = 0; i < array.length; i++) {
            if (array[i] == character) {
                count++;
                if (count == 1) {
                    firstIndex = i;
                } else if (count == 2) {
                    return i;
                }
            }
        }

        return firstIndex != -1 ? firstIndex : -1;
    }


    public static void main(String[] args) {
        int[] numbers = {4, 2, 7, 2, 5};
        String[] words = {"doggie", "cat", "poodle", "apple"};
        char[] letters = {'a', 'b', 'c', 'a', 'd'};

        System.out.println("find: " + find(numbers, 2)); 
        System.out.println("findLast: " + findLast(words, "apple")); 
        System.out.println("findSecond: " + findSecond(letters, 'a')); 
    }
}
