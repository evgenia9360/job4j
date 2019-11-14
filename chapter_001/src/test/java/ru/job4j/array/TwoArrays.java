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
}
