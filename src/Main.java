public class Main {
    public static void main(String[] args) {

        int[] sortedArr = BubbleSort.bubbleSort(ReadIntArrayFromKeyboard.readAndPrintIntArray());
        System.out.print("\n\nОтсортированный массив быстрой сортировкой: ");
        for (int num : sortedArr) {
            System.out.print(num + " ");
        }
    }
}