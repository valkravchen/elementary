package vaok.tasks.array;

import java.util.Arrays;

public class FindLoopRange {
    public static int indexOfInRange(int[] data, int element, int start, int end) {
        if (start < 0 || end >= data.length || start > end) {
            return -1;
        }
        for (int index = start; index <= end; index++) {
            if (data[index] > element) {
                return index;
            }
        }
        return -1;
    }

    public static int[] indicesOfGreaterThan(int[] data, int element, int start, int end) {
        int[] indices = new int[end - start + 1];
        int count = 0;
        if (start < 0 || end >= data.length || start > end) {
            return new int[0];
        }
        for (int index = start; index <= end; index++) {
            if (data[index] > element) {
                indices[count++] = index;
            }
        }
        return Arrays.copyOf(indices, count);
    }

    public static int lastIndexOf(int[] data, int element, int start, int end) {
        if (start < 0 || end >= data.length || start > end) {
            return -1;
        }
        for (int index = end; start <= index; index--) {
            if (data[index] == element) {
                return index;
            }
        }
        return -1;
    }

    public static void main(String[] args) {
        int[] data = {1, 3, 6, 8, 10};
        int element = 3;
        int start = 0;
        int end = 4;
        System.out.println(indexOfInRange(data, element, start, end));
        System.out.println(Arrays.toString(indicesOfGreaterThan(data, element, start, end)));
        System.out.println(lastIndexOf(data, element, start, end));
    }
}

