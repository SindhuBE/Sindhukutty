

public class FindDuplicate {
    public static void main(String[] args) {
        // assume the array is sorted, otherwise first we have to sort it.
        // time efficiency is o(n)
        int elementData[] = new int[] { 1, 2, 3, 3, 4, 5, 6, 8, 8 };
        int count = 1;
        int element1;
        int element2;

        for (int i = 0; i < elementData.length - 1; i++) {
            element1 = elementData[i];
            element2 = elementData[count];
            count++;
            if (element1 == element2) {
                System.out.println(element2);
            }
        }
    }
}

