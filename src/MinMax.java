public class MinMax {

    public static void main(String[] args) {
        Integer[][] list;
        list = new Integer[][]{{12, 43, 97, 54}, null, {-4, 119, 22, 13}, {67, 31, -23, 87}};
        if (list != null) {
            Integer[] maxList = new Integer[list.length];
            for (int i = 0; i < list.length; i++) {
                maxList[i] = findMax(list[i]);
                System.out.println(String.format("The maxim from line %d is %d", i, maxList[i]));
            }
            System.out.println("The minimum from the maxims is: " + findMin(maxList));
        }
    }

    private static Integer findMax(Integer[] listRow) {
        if (listRow != null) {
            Integer maxim = Integer.MIN_VALUE;
            for (int i = 0; i < listRow.length; i++) {
                if (listRow[i] > maxim) {
                    maxim = listRow[i];
                }
            }
            return maxim;
        } else {
            return null;
        }
    }

    private static Integer findMin(Integer[] listRow) {
        if (listRow != null) {
            Integer minim = Integer.MAX_VALUE;
            for (int i = 0; i < listRow.length; i++) {
                if (listRow[i] != null) {
                    if (listRow[i] < minim) {
                        minim = listRow[i];
                    }
                }
            }
            return minim;
        } else {
            return null;
        }
    }
}