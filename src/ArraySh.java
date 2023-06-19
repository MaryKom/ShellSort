public class ArraySh {
    private long[] theArray;
    private int nElements;

    public ArraySh(int max) {
        theArray = new long[max];
        nElements = 0;
    }

    public void insert(long value) {
        theArray[nElements++] = value;
    }

    public void display() {
        for (int i = 0; i < nElements; i++) {
            System.out.print(theArray[i] + " ");
        }
        System.out.println("");
    }

    public void shellSort() {
        int inner, outer;
        long temp;
        int h = 1;
        while (h <= nElements / 3)
            h = h * 3 + 1;

        while (h > 0) {
            for (outer = h; outer < nElements; outer++) {
                temp = theArray[outer];
                inner = outer;
                while (inner > h-1 && theArray[inner - h] >= temp) {
                    theArray[inner] = theArray[inner-h];
                    inner-=h;
                }
                theArray[inner] = temp;
            }
            h = (h-1)/3;
        }
    }

    private void swap(int one, int two) {
        long temp = theArray[one];
        theArray[one] = theArray[two];
        theArray[two] = temp;
    }
}
