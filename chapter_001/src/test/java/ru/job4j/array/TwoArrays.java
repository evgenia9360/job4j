package ru.job4j.array;


public class TwoArrays {
    public int[] intersection(int first[], int second[]) {
        int[] matched = new int[Math.min(first.length, second.length)];
        int count = 0;
        for (int itemFirstArray : first) {
            for (int itemSecondArray : second) {
                if (itemFirstArray == itemSecondArray) {
                    boolean needAdd = true;
                    for (int itemMatchedArray : matched) {
                        if (itemMatchedArray == itemFirstArray) {
                            needAdd = false;
                            break;
                        }
                    }
                    if (needAdd) {
                        matched[count] = itemFirstArray;
                        count++;
                    }
                }
            }
        }
        return matched;
    }

    public static void intersection2(int first[], int second[]) {
        for (int itemFirstArray : first) {
            for (int i : second) {
                if (itemFirstArray == i) {
                    System.out.println(itemFirstArray);
                    break;
                }
            }
        }

    }

    public static void main(String[] args) {
        intersection2(new int[]{1, 2, 3}, new int[]{2, 3, 4});
    }
}
