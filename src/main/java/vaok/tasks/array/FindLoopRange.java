package vaok.tasks.array;

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

    public static void main(String[] args) {
        int[] data = {1, 3, 6, 8, 10};
        int element = 3;
        int start = 0;
        int end = 3;
        System.out.println(indexOfInRange(data, element, start, end));
    }
}

