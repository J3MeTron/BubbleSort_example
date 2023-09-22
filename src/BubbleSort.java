public class BubbleSort {

    public static void main(String[] args) {
        int[] arr = {5, 1, 4, 2, 8};
        bubbleSort(arr);
        for (int num : arr) {
            System.out.print(num + " ");
        }
    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swapped; // Переменная для отслеживания выполнения обменов
        // Внешний цикл для общего количества проходов
        for (int i = 0; i < n - 1; i++) {
            swapped = false;// Изначально нет обменов на данной итерации
            // Внутренний цикл для одного прохода
            for (int j = 0; j < n - 1 - i; j++) {
                // Сравниваем текущий элемент со следующим
                if (arr[j] > arr[j + 1]) {
                    // Обмен элементов, если текущий элемент больше следующего
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swapped = true;// Устанавливаем флаг, что был обмен
                }
            }
            // Если на данной итерации не было обменов, массив уже упорядочен
            if (!swapped) {
                break;
            }
        }
        return arr;
    }
}
