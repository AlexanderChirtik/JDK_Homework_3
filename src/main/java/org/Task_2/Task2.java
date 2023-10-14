package org.Task_2;

public class Task2 {

    public static void main(String[] args) {
        String[] array = new String[]{"a", "b", "c"};
        String[] array2 = new String[]{"a", "b", "d", "f"};
        System.out.println(compareArrays(array, array2));
    }

    public static <T> boolean compareArrays(T[] firstArray, T[] secondArray) {
        if (firstArray.length == secondArray.length) {
            for (int i = 0; i < firstArray.length; i++) {
                if (firstArray[i] != secondArray[i]) {
                    System.out.println("Элементы массивов различаются");
                    return false;
                }
            }
            System.out.println("Массивы не отличаются друг от друга");
            return true;
        }
        System.out.println("Размер массивов отличается");
        return false;
    }
}
