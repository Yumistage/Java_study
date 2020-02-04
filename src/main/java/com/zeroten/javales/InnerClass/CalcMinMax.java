package com.zeroten.javales.InnerClass;

public class CalcMinMax {

    public static class Pair {

        private int min;
        private int max;

        public Pair(int min, int max) {
            this.min = min;
            this.max = max;
        }

        public int getMin() {
            return min;
        }

        public int getMax() {
            return max;
        }
    }

    public static int[] calc(int... numbs) {
        Integer min = null;
        Integer max = null;

        if (numbs.length > 0) {


            for (int num : numbs
            ) {
                if (min == null || min > num) {
                    min = num;
                }
                if (max == null || max < num) {

                    max = num;
                }

            }
        }

        return new int[]{min, max};

    }


    public static Pair calc2(int... numbs) {
        Integer min = null;
        Integer max = null;

        if (numbs.length > 0) {


            for (int num : numbs
            ) {
                if (min == null || min > num) {
                    min = num;
                }
                if (max == null || max < num) {

                    max = num;
                }

            }
        }

        return new Pair(min, max);

    }

}
