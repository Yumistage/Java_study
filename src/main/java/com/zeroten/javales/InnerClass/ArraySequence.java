package com.zeroten.javales.InnerClass;

public class ArraySequence {

    private Object[] data;

    public Object[] getData() {
        return data;
    }

    private int next = 0;

    public ArraySequence(int size) {
        this.data = new Object[size];
    }

    public void add(Object obj) {
        if (next < data.length) {
            data[next++] = obj;
        }
    }

    public class SelectorImpl implements Selector {

        private int index = 0;

        @Override
        public boolean end() {
            return index >= next;
        }

        @Override
        public Object current() {
            if (index < next) {
                return data[index];
            }

            return null;
        }

        @Override
        public void next() {
            index++;
        }
    }


}
